import java.time.LocalDate;

import javax.annotation.processing.SupportedOptions;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("das");
        curso1.setDescricao("gds");
        curso1.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Ja");
        mentoria.setDescricao("Mentoria de Ja");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devA = new Dev();
        devA.setNome("A");
        devA.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Concluídos " + devA.getConteudosInscritos());
        devA.progredir();
        System.out.println("Conteúdo Concluídos " + devA.getConteudosConcluidos());
        Dev devB = new Dev();
        devB.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos " + devB.getConteudosInscritos());
        devB.progredir();
        devB.progredir();
        System.out.println("Conteúdo Concluídos " + devB.getConteudosConcluidos());
        System.out.println("XP " + devB.calcularTotalXp());
    }
}