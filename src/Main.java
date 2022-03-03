import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desenvolvimento do paradigma de POO");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Mao na massa com JavaScript");
        curso2.setCargaHoraria(19);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("Auxilio no desenvolvimento de exercicios");
        mentoria1.setData(LocalDate.now());





        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
