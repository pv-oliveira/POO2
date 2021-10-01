package Projeto;

import java.time.LocalDate;

public class Secretario extends Funcionario{
    public Secretario(String nome, LocalDate dataDeNascimento, int salario, LocalDate dataDeAdmissao, Escolaridade escolaridade){
        super(nome, dataDeNascimento, salario, dataDeAdmissao);

    }
}
