package Projeto;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario {
    private String nome;
    private LocalDate dataDeNascimento;
    private int salario;
    private LocalDate dataDeAdmissao;

    public Funcionario(String nome, LocalDate dataDeNascimento, int salario, LocalDate dataDeAdmissao){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", salario=" + salario +
                ", dataDeAdmissao=" + dataDeAdmissao +
                '}';
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
