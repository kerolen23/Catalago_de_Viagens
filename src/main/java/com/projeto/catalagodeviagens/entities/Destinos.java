package com.projeto.catalagodeviagens.entities;

import javax.persistence.*;

@Entity
public class Destinos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nomeDestino;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String dica;

    public Destinos(){

    }

    public Destinos(Integer id, String nomeDestino, String pais, String descricao, String dica) {
        this.id = id;
        this.nomeDestino = nomeDestino;
        this.pais = pais;
        this.descricao = descricao;
        this.dica = dica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDestino() {
        return nomeDestino;
    }

    public void setNomeDestino(String nomeDestino) {
        this.nomeDestino = nomeDestino;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}
