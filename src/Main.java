//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import br.com.dio.desafio.dominio.*;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

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
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Spring Framework");
        mentoria.setDescricao("Aprenda Spring Framework com um especialista");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Spring Framework");
        mentoria2.setDescricao("Aprenda Spring Framework com um especialista");
        mentoria2.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
      //  System.out.println(mentoria);
       // System.out.println(mentoria2);

        BootCamp bootcamp = new BootCamp();
         bootcamp.setNome("Bootcamp Java SpringBoot");
            bootcamp.setDescricao("Bootcamp para aprender Java e SpringBoot");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.inscreverBootCamp(bootcamp);
        System.out.println(devLaura.getNome() + " Seus Conteudos Inscritos " +  devLaura.getConteudosInscritos());
        devLaura.cancelarBootCamp(bootcamp);
        System.out.println(devLaura.getNome() + " Seus Conteudos Inscritos " +  devLaura.getConteudosInscritos());
        System.out.println("----------------------------------");


        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootCamp(bootcamp);
        System.out.println(devMarcio.getNome() + " Seus Conteudos Inscritos " +  devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        System.out.println("XP Total: " + devMarcio.calcularTotalXp());
        System.out.println(devMarcio.getNome() + " Seus Conteudos Inscritos " +  devMarcio.getConteudosInscritos());


        devMarcio.progredir();

        System.out.println("----------------------------------------");
        System.out.println(devMarcio.getNome() + " Seus Conteudos Concluidos " +  devMarcio.getConteudosConcluidos());

        System.out.println("XP Total: " + devMarcio.calcularTotalXp());
        System.out.println("----------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println(devJoao.getNome() + " Seus Conteudos Inscritos "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println(devJoao.getNome() + " Seus Conteudos Inscritos "+ devJoao.getConteudosInscritos());
        System.out.println(devJoao.getNome() + " Seus Conteudos Concluidos " +  devJoao.getConteudosConcluidos());
        System.out.println("XP Total: " + devJoao.calcularTotalXp());


    }
}