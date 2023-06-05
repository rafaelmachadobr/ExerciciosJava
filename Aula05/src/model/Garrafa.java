package model;

import java.util.Scanner;

public class Garrafa {

    private boolean cheia;
    private String cor;
    private String material;
    private int capacidade;
    private int volume;
    private boolean aberta;

    Scanner scanner = new Scanner(System.in);

    public Garrafa() {
    }

    public Garrafa(boolean cheia, String cor, String material, int capacidade, int volume, boolean aberta) {
        this.cheia = cheia;
        this.cor = cor;
        this.material = material;
        this.capacidade = capacidade;
        this.volume = volume;
        this.aberta = aberta;
    }

    public boolean isCheia() {
        return cheia;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void imprimir() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Garrafa");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Cheia: " + this.isCheia());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Capacidade: " + this.getCapacidade());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void encher() {
        if (this.isCheia()) {
            System.out.println("A garrafa já está cheia!");
        } else {
            this.setCheia(true);
            this.setVolume(this.getCapacidade());
            System.out.println("A garrafa foi enchida!");
        }
    }

    public void esvaziar() {
        if (!this.isCheia()) {
            System.out.println("A garrafa já está vazia!");
        } else {
            this.setCheia(false);
            this.setVolume(0);
            System.out.println("A garrafa foi esvaziada!");
        }
    }

    public void beber(int volume) {
        if (!this.isCheia()) {
            System.out.println("A garrafa está vazia!");
        } else if (volume > this.getVolume()) {
            System.out.println("A garrafa não tem volume suficiente para beber!");
        } else {
            this.setVolume(this.getVolume() - volume);
            System.out.println("Você bebeu " + volume + "ml de água!");
        }
    }

    public void abrir() {
        if (this.isAberta()) {
            System.out.println("A garrafa já está aberta!");
        } else {
            this.setAberta(true);
            System.out.println("A garrafa foi aberta!");
        }
    }

    public void fechar() {
        if (!this.isAberta()) {
            System.out.println("A garrafa já está fechada!");
        } else {
            this.setAberta(false);
            System.out.println("A garrafa foi fechada!");
        }
    }

    public void exibirMenu() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Garrafa");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1 - Encher");
        System.out.println("2 - Esvaziar");
        System.out.println("3 - Beber");
        System.out.println("4 - Abrir");
        System.out.println("5 - Fechar");
        System.out.println("6 - Imprimir");
        System.out.println("7 - Sair");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void iniciar() {
        int opcao = 0;
        do {
            exibirMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    encher();
                    break;
                case 2:
                    esvaziar();
                    break;
                case 3:
                    System.out.print("Digite o volume: ");
                    int volume = scanner.nextInt();
                    beber(volume);
                    break;
                case 4:
                    abrir();
                    break;
                case 5:
                    fechar();
                    break;
                case 6:
                    imprimir();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);
    }
}
