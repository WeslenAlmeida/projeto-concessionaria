package com.br.sistema.metodo;

import com.br.sistema.data.veiculo.Veiculo;
import com.br.sistema.dbcontrol.DBCarrosNovos;

import java.util.Scanner;

public class CadastrarVeiculoNovo extends Veiculo {

    Scanner sc =  new Scanner(System.in);

    public CadastrarVeiculoNovo() {

        System.out.println("********** CADASTRO DE VEÍCULOS NOVOS **********");

        System.out.print("Digite o ano de fabricação do veículo: ");
        setAnoFab(sc.next());

        System.out.print("Digite o modelo do veículo: ");
        setModelo(sc.next());

        System.out.println("Digite o chassi do veículo: ");
        setChassi(sc.next());

        new DBCarrosNovos(getAnoFab(), getModelo(), getChassi());

    }
}
