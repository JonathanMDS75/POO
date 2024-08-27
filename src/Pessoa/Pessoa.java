package Pessoa;

import java.util.Scanner;

public class Pessoa {
    //criar os atributos da classe carro
    String nome;
    String idade;
    String altura;
    boolean vacinado;

    public void ligarCarro(){
        System.out.println("Olá mundo!");
    }

    public void imprimirDados(){

        //imprimir todos os novos dados

        System.out.println("Nome: " + nome);
        System.out.println("");
        System.out.println("Idade " + idade);
        System.out.println("");
        System.out.println("Altura: " + altura);
        System.out.println("");
        System.out.println("Vacinado " + vacinado);
    }

    public void lerDados(){

        Scanner ler = new Scanner(System.in);

        System.out.println("-----------------------------------------------\n");

        System.out.println("Digite o nome da pessoa:");
        nome = ler.nextLine();

        System.out.println("Digite a idade:");
        idade = ler.nextLine();

        System.out.println("Digite altura:");
        altura = ler.nextLine();

        System.out.println("Digite se vacinou:");
        vacinado = ler.nextBoolean();
    }
}
