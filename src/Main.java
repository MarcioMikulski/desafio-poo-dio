//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Java Básico");
    curso1.setDescricao("Aprenda os conceitos básicos de Java");
    curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python Básico");
        curso2.setDescricao("Aprenda os conceitos básicos de Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitutlo("Como ser um programador Java");
        mentoria.setDescricao("Imersão total ao mundo da programação Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitutlo("Como ser um programador Python");
        mentoria2.setDescricao("Imersão total ao mundo da programação Python");
        mentoria2.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
    System.out.println(mentoria2);
    }
}