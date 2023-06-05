package model;

import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado;

    Scanner scanner = new Scanner(System.in);

    public Carro() {
    }

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Carro");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("ERRO! O carro já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("O carro foi ligado.");
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("ERRO! O carro já está desligado.");
        }
    }

    public void acelerar() {
        if (this.ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("ERRO! O carro está desligado.");
        }
    }

    public void frear() {
        if (this.ligado) {
            System.out.println("O carro está freando.");
        } else {
            System.out.println("ERRO! O carro está desligado.");
        }
    }

    public void buzinar() {
        if (this.ligado) {
            System.out.println("O carro está buzinando.");
        } else {
            System.out.println("ERRO! O carro está desligado.");
        }
    }

    public void exibirMenu() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Menu do Carro");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");
        System.out.println("5 - Buzinar");
        System.out.println("6 - Imprimir dados do carro");
        System.out.println("7 - Sair");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Digite a opção desejada: ");
    }

    public void iniciar() {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    acelerar();
                    break;
                case 4:
                    frear();
                    break;
                case 5:
                    buzinar();
                    break;
                case 6:
                    imprimir();
                    break;
                case 7:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("ERRO! Opção inválida.");
                    break;
            }
        } while (opcao != 7);
    }

}
