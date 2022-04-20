package com.br.sistema.data.funcionario;

import com.br.sistema.data.pessoa.PessoaFisica;

public abstract class Funcionario extends PessoaFisica {

    String cargo;
    String dataAdmissao;
    double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
