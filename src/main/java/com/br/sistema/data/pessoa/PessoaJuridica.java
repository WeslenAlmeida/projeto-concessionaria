package com.br.sistema.data.pessoa;

import com.br.sistema.data.endereco.Endereco;

public abstract class PessoaJuridica extends Endereco {

    String razaoSocial;
    String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}
