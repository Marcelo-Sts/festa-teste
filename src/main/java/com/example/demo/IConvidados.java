package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Convidado;

public interface IConvidados extends JpaRepository<Convidado, Long> {

}
