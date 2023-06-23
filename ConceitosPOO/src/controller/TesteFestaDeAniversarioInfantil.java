package controller;

import java.util.Scanner;

import model.FestaDeAniversarioInfantil;

public class TesteFestaDeAniversarioInfantil {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aniversariante: ");
        String nomeAniversariante = entrada.nextLine();

        System.out.println("Digite a idade do aniversariante: ");
        int idade = entrada.nextInt();

        System.out.println("Digite o local da festa: ");
        String local = entrada.nextLine();

        entrada.nextLine();

        System.out.println("Digite o tema da festa: ");
        String tema = entrada.nextLine();

        System.out.println("Digite se a festa possui bolo: ");
        boolean possuiBolo = entrada.nextBoolean();

        System.out.println("Digite o número de convidados: ");
        int numeroDeConvidados = entrada.nextInt();

        FestaDeAniversarioInfantil festa = new FestaDeAniversarioInfantil(numeroDeConvidados, nomeAniversariante, idade,
                local, tema, possuiBolo);

        festa.realizarFesta();

        entrada.close();
    }
}
