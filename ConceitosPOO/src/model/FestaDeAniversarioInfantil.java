package model;

public class FestaDeAniversarioInfantil extends FestaDeAniversario {

    private int numeroDeConvidados;

    public FestaDeAniversarioInfantil() {
    }

    public FestaDeAniversarioInfantil(int numeroDeConvidados, String nomeAniversariante, int idade, String local,
            String tema, boolean possuiBolo) {
        super(nomeAniversariante, idade, local, tema, possuiBolo);
        this.numeroDeConvidados = numeroDeConvidados;
    }

    public int getNumeroDeConvidados() {
        return numeroDeConvidados;
    }

    public void setNumeroDeConvidados(int numeroDeConvidados) {
        this.numeroDeConvidados = numeroDeConvidados;
    }

    @Override
    public void realizarFesta() {
        System.out.println("Realizando festa de aniversário infantil para " + getNomeAniversariante());
        System.out.println("Idade: " + getIdade());
        System.out.println("Local: " + getLocal());
        System.out.println("Tema: " + getTema());
        System.out.println("Possui Bolo: " + isPossuiBolo());
        System.out.println("Número de Convidados: " + numeroDeConvidados);
    }
}
