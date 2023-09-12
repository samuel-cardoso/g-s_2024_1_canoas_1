/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionariomvc.model;

/**
 *
 * @author rafaelamoreira
 */
public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(int id, String nome, int idade, double salario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      

    @Override
    public String toString() {
        return "Id: "+ id +
               "\nNome:" + nome + 
               "\nIdade: " + idade + 
               "\nSalario: " + salario;
    }
    
}
