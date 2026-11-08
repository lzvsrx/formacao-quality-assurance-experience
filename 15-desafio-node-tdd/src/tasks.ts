export type Task={id:number;title:string;done:boolean};
export class TaskService {
 private tasks:Task[]=[];private nextId=1;
 list(){return this.tasks.map(t=>({...t}));}
 create(title:string){if(!title?.trim())throw new Error('Título obrigatório');const task={id:this.nextId++,title:title.trim(),done:false};this.tasks.push(task);return {...task};}
 complete(id:number){const t=this.tasks.find(t=>t.id===id);if(!t)throw new Error('Tarefa inexistente');t.done=true;return {...t};}
 remove(id:number){const index=this.tasks.findIndex(t=>t.id===id);if(index<0)throw new Error('Tarefa inexistente');this.tasks.splice(index,1);}
}
