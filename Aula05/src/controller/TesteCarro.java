package controller;

import model.Carro;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Uno", "Vermelho", 2010);

        carro.iniciar();
    }
}
