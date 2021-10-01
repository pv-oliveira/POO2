package Projeto;

import java.time.LocalDate;
import java.util.*;

public class Professor extends Funcionario{
    private Escolaridade escolaridade;
    private List<Aula> aulas;

    public Professor(String nome, LocalDate dataDeNascimento, int salario, LocalDate dataDeAdmissao, Escolaridade escolaridade){
        super(nome, dataDeNascimento, salario, dataDeAdmissao);
        this.escolaridade = escolaridade;

    }

    @Override
    public String toString() {
        return "Professor " + getNome() +
                ", escolaridade=" + escolaridade +
                ", aulas=" + aulas +
                '}';
    }
}
