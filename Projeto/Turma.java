package Projeto;

import java.time.LocalDate;

public class Turma {
    private Professor resposavel;
    private String disciplina;

    public Turma(Professor resposavel, String disciplina) {
        this.resposavel = resposavel;
        this.disciplina = disciplina;

    }
    public void addAluno(Alunos aluno){
        aluno.add(aluno);
        aluno.addTurma(this);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "resposavel=" + resposavel +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
