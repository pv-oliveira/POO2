package Projeto;

import java.util.List;

public class Alunos{
    private String nome;
    private int numeroDeMatricula;
    private int cpf;
    private List<Turma> turmas;
    private List<Aula> aulas;

    public Integer getPresencas(){
        return aulas.size();
    }


    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void add(Alunos aluno) {

    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }
}
