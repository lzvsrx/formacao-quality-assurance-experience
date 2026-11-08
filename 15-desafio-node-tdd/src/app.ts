import express from 'express';import {TaskService} from './tasks.js';
export function createApp(service=new TaskService()){const app=express();app.use(express.json());
app.get('/tasks',(_req,res)=>res.json(service.list()));
app.post('/tasks',(req,res)=>{try{res.status(201).json(service.create(req.body?.title));}catch(e){res.status(400).json({error:(e as Error).message});}});
app.patch('/tasks/:id/complete',(req,res)=>{try{res.json(service.complete(Number(req.params.id)));}catch(e){res.status(404).json({error:(e as Error).message});}});
app.delete('/tasks/:id',(req,res)=>{try{service.remove(Number(req.params.id));res.status(204).end();}catch(e){res.status(404).json({error:(e as Error).message});}});return app;}
