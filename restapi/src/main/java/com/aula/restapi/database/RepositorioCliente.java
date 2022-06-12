package com.aula.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.restapi.entidade.Cliente;

//O Spring tem uma biblioteca de um repositorio que faz um CRUD basico
//entao esta chamada com parametros eh a instanciacao dele, passando a classe e o tipo de identificacao
public interface RepositorioCliente extends JpaRepository<Cliente,Long> {
    
}
