package org.example.exemplo2.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private long id;
    @Column
    private String nome;
    @Column
    private double preco;


}
