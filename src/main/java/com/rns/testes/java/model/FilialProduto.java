package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "FILIALPRODUTO")
@Data
public class FilialProduto {
    @Id
    @GeneratedValue(generator = "FILIALPRODUTO_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String nome;

    @Column
    private String local;

    @Column
    private Long quantidade;
}