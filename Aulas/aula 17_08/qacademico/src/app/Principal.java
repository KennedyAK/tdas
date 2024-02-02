package app;
import entities.Aluno;
import entities.Curso;

public class Principal {

    public static void main(String[] args){
        Aluno kennedy = new Aluno("kennedy", 2023, "tads");
        Curso tads = new Curso(kennedy.getCurso(), 6.00, 6.00);


    }
}
