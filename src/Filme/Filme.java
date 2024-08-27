package Filme;

import java.util.Scanner;

public class Filme {

    //atributos da classe

    String nome;
    String classificacaoIndicativa;
    String genero;
    boolean inclusoNoPlano;
    int duracaoEmMinutos;

    //metodo imprimir dados do filme
    public void imprimirDados(){

        //imprimir todos os novos dados

        System.out.println("Filme.Filme: " + nome);
        System.out.println("Classificaçõa indicativa: " + classificacaoIndicativa);
        System.out.println("Gênero: " + genero);
        System.out.println("Esse filme está incluso no plano? " + inclusoNoPlano);
        System.out.println("Duração: " + duracaoEmMinutos + "min");
    }

    public void lerDados(){

        Scanner ler = new Scanner(System.in);

        System.out.println("-----------------------------------------------\n");

        System.out.println("Digite o novo nome do filme:");
        nome = ler.nextLine();

        System.out.println("Digite a classificação indicativa:");
        classificacaoIndicativa = ler.nextLine();

        System.out.println("Digite o gênero do filme:");
        genero = ler.nextLine();

        System.out.println("Esse filme está incluso no plano?");
        inclusoNoPlano = ler.nextBoolean();

        System.out.println("Digite a duração do filme:");
        duracaoEmMinutos = ler.nextInt();
    }
}
