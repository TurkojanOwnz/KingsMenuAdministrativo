package com.mycompany.kingsmenuadministrativo.Model;

import java.util.Date;

public class Cliente {

    private int idCliente;

    private String nome;

    private String cpf;

    private String telefone;

    private String email;

    private String senha;

    private Date dataNascimento;

    private Endereco[] endereco;
    
    public Cliente(){
        super();
    }

    public Cliente(String nome, String cpf, String telefone, String email, String senha, Date dataNascimento, Endereco[] endereco) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }
            
    public void manter() {
        //TODO CRUD
    }

}
