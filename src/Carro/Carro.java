package Carro;

import java.util.Scanner;

public class Carro {
    //criar os atributos da classe carro
    String nome;
    String marca;
    String modelo;
    int ano;

    public void ligarCarro(){
        System.out.println("Carro.Carro ligado!");
    }

    public void imprimirDados(){

        //imprimir todos os novos dados

        System.out.println("Caro: " + nome);
        System.out.println("");
        System.out.println("Marca " + marca);
        System.out.println("");
        System.out.println("Modelo: " + modelo);
        System.out.println("");
        System.out.println("Ano " + ano);
    }

    public void lerDados(){

        Scanner ler = new Scanner(System.in);

        System.out.println("-----------------------------------------------\n");

        System.out.println("Digite o nome do carro:");
        nome = ler.nextLine();

        System.out.println("Digite a marca:");
        marca = ler.nextLine();

        System.out.println("Digite modelo:");
        modelo = ler.nextLine();

        System.out.println("Digite o ano:");
        ano = ler.nextInt();
    }
}
