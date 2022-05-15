package com.br.sistema.dbcontrol;

import java.util.ArrayList;

public class DBClienteFisico {

    public DBClienteFisico(String nome, String cpf, String rg){
        ArrayList<String> list = new ArrayList<>();
        list.add(nome);
        list.add(cpf);
        list.add(rg);
        System.out.println(list);

    }
}
