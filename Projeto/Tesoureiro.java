package Projeto;

import java.time.LocalDate;

public class Tesoureiro extends Funcionario{
    public Tesoureiro(String nome, LocalDate dataDeNascimento, int salario, LocalDate dataDeAdmissao, Escolaridade escolaridade){
        super(nome, dataDeNascimento, salario, dataDeAdmissao);
    }
}
