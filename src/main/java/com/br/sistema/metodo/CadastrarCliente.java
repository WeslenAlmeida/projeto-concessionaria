package com.br.sistema.metodo;

import com.br.sistema.data.cliente.CadastroPessoaFisica;
import com.br.sistema.dbcontrol.DBClienteFisico;

import java.util.Scanner;

public class CadastrarCliente extends CadastroPessoaFisica {

    public CadastrarCliente() {

        Scanner sc = new Scanner(System.in);

        System.out.println("********** CADASTRO CLIENTE **********");

        System.out.print("Nome: ");
        setNome(sc.next());

        System.out.print("CPF: ");
        setCpf(sc.next());

        System.out.print("RG: ");
        setRg(sc.next());

        new DBClienteFisico(getNome(), getCpf(), getRg());

    }
}
