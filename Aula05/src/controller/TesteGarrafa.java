package controller;

import model.Garrafa;

public class TesteGarrafa {

    public static void main(String[] args) {

        Garrafa garrafa = new Garrafa(true, "Azul", "Plástico", 500, 500, true);

        garrafa.iniciar();
    }

}
