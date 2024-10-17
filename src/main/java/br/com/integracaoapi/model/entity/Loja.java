package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "loja")
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}