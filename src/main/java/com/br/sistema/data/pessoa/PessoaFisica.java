package com.br.sistema.data.pessoa;

import com.br.sistema.data.endereco.Endereco;

public abstract class PessoaFisica extends Endereco {

    String nome;
    String cpf;
    String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
