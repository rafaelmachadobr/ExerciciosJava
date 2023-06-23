package model;

public abstract class FestaDeAniversario {

    private String nomeAniversariante;
    private int idade;
    private String local;
    private String tema;
    private boolean possuiBolo;

    public FestaDeAniversario() {
    }

    public FestaDeAniversario(String nomeAniversariante, int idade, String local, String tema, boolean possuiBolo) {
        this.nomeAniversariante = nomeAniversariante;
        this.idade = idade;
        this.local = local;
        this.tema = tema;
        this.possuiBolo = possuiBolo;
    }

    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isPossuiBolo() {
        return possuiBolo;
    }

    public void setPossuiBolo(boolean possuiBolo) {
        this.possuiBolo = possuiBolo;
    }

    public abstract void realizarFesta();

}
