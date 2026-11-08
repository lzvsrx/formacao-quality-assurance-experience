import React, { useState } from 'react';
export function Formulario() {
 const [nome, setNome] = useState(''); const [mensagem, setMensagem] = useState('');
 return <main><h1>Cadastro</h1><label htmlFor="nome">Nome</label><input id="nome" value={nome} onChange={e=>setNome(e.target.value)}/><button onClick={()=>setMensagem(nome.trim() ? `Olá, ${nome.trim()}!` : 'Informe seu nome')}>Enviar</button><p role="status">{mensagem}</p></main>;
}
