import {describe,it,expect,beforeEach} from 'vitest';import {TaskService} from '../src/tasks.js';
describe('TaskService TDD',()=>{let service:TaskService;beforeEach(()=>service=new TaskService());
it('cria tarefa',()=>expect(service.create('Estudar').title).toBe('Estudar'));
it('rejeita título vazio',()=>expect(()=>service.create('  ')).toThrow());
it('conclui tarefa',()=>{const t=service.create('Teste');expect(service.complete(t.id).done).toBe(true);});
it('remove tarefa',()=>{const t=service.create('Teste');service.remove(t.id);expect(service.list()).toHaveLength(0);});
it('não conclui inexistente',()=>expect(()=>service.complete(99)).toThrow());});
