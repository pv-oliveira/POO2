package Projeto;

import java.time.LocalDate;

public class Motorista extends Funcionario{
    private String catgDeHabilitacao;

    public Motorista(String nome, LocalDate dataDeNascimento, int salario, LocalDate dataDeAdmissao, Escolaridade escolaridade){
        super(nome, dataDeNascimento, salario, dataDeAdmissao);

    }

  /*  public String getCatgDeHabilitacao() {
        return catgDeHabilitacao;
    }

    public void setCatgDeHabilitacao(String catgDeHabilitacao) {
        this.catgDeHabilitacao = catgDeHabilitacao;
    }*/
}
