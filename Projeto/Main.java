package Projeto;


import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Professor fernando = new Professor("Fernando", LocalDate.parse("1996-08-27") , 1000 ,LocalDate.parse("2021-08-07"), Escolaridade.DOUTORADO );
        Turma matematica = new Turma(fernando, "Matematica");

        System.out.println("matematica " + matematica.toString());

         List<Turma> suaLista = new ArrayList<>();
    }

}
