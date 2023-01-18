import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso("Curso: Java", "Descrição curso java", 8);
        Conteudo curso2 = new Curso("Curso: js", "Descrição curso js", 4);

        Conteudo ment1 = new Mentoria("Mentoria de java", "descrição mentoria java", LocalDate.now());


        Bootcamp bc = new Bootcamp();
        bc.setNome("Bootcamp Java Developer");
        bc.setDescricao("Descrição Bootcamp Java Developer");
        bc.getConteudos().add(curso1);
        bc.getConteudos().add(curso2);
        bc.getConteudos().add(ment1);

        Dev devRuan = new Dev();
        devRuan.setNome("Ruan");
        devRuan.increverBootcamp(bc);
        System.out.println("Conteúdos Inscritos Ruan: "+ devRuan.getConteudosInscritos());
        devRuan.progredir();
        devRuan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ruan: "+ devRuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ruan: "+ devRuan.getConteudosConcluidos());
        System.out.println("XP: "+ devRuan.calcularXp());


        System.out.println("------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootcamp(bc);

        System.out.println("Conteúdos Inscritos Joao: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularXp());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(ment1);
         */
    }
}