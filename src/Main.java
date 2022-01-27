import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso de Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("PHP");
        curso2.setDescricao("descrição curso PHP");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();
        System.out.println("Conteúdos inscritos Maria: " +  devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("------------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("Conteúdos inscritos João: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());
    }
}
