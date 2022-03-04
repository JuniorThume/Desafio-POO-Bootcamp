import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNomeBootcamp("Programacao JAVA");
        bootcamp1.setDescricaoBootcamp("Stream na pratica");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Junior");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println(dev1.getNome() + " esta incrito em " + dev1.getConteudosInscritos());
        dev1.progredir();

        System.out.println(dev1.getNome() + " concluiu " + dev1.getConteudosConcluidos());
        System.out.println(dev1.getNome() + " esta incrito em " + dev1.getConteudosInscritos());


        Dev dev2 = new Dev();
        dev1.setNome("Bianca");
        dev2.inscreverBootcamp(bootcamp1);

        bootcamp1.getDevInscritos().add(dev1);
        bootcamp1.getDevInscritos().add(dev2);






    }
}
