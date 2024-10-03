package com.example.dinoprojeto.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Dinossauro {

    private Long id;
    private String nome;
    private String especie;
    private Double altura;
    private Double peso;
    private Double velocidade;

    public Dinossauro(Long id, String nome, String especie, Double altura, Double peso, Double velocidade) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this. altura = altura;
        this.peso = peso;
        this.velocidade = velocidade;
    }

    public Dinossauro(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }


    



    




}
