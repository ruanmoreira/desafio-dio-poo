import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso: Java", "Descrição curso java", 8);
        Curso curso2 = new Curso("Curso: js", "Descrição curso js", 4);

        Mentoria ment1 = new Mentoria("Mentoria de java", "descrição mentoria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(ment1);
    }
}