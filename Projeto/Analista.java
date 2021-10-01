package Projeto;

import java.time.LocalDate;

public class Analista extends Funcionario{
    private String linguagemDeProg;
    private String ideFavorita;

    public Analista(String nome, LocalDate dataDeNascimento, int salario, LocalDate dataDeAdmissao, Escolaridade escolaridade){
        super(nome, dataDeNascimento, salario, dataDeAdmissao);
    }

 /*   public String getLinguagemDeProg() {
        return linguagemDeProg;
    }

    public void setLinguagemDeProg(String linguagemDeProg) {
        this.linguagemDeProg = linguagemDeProg;
    }

    public String getIdeFavorita() {
        return ideFavorita;
    }

    public void setIdeFavorita(String ideFavorita) {
        this.ideFavorita = ideFavorita;
    }*/
}
