import {it,expect} from 'vitest';import request from 'supertest';import {createApp} from '../src/app.js';
it('cria e lista via HTTP',async()=>{const app=createApp();await request(app).post('/tasks').send({title:'Testar API'}).expect(201);const res=await request(app).get('/tasks').expect(200);expect(res.body).toHaveLength(1);});
it('rejeita criação inválida',async()=>{await request(createApp()).post('/tasks').send({title:''}).expect(400);});
