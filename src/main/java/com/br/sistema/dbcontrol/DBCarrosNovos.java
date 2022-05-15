package com.br.sistema.dbcontrol;

import java.util.ArrayList;

public class DBCarrosNovos {

    public DBCarrosNovos(String ano, String modelo, String chassi){

        ArrayList<String> list = new ArrayList<>();
        list.add(ano);
        list.add(modelo);
        list.add(chassi);
        System.out.println(list);

        //<DBCarrosNovos>
    }

}
