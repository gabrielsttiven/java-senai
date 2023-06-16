
package atividade7;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
       Motoboy motoboy = new Motoboy("l584SJH", "Gabriel", "25693545", "147777874", Genero.MASCULINO, 1524, LocalDate.of(2004, Month.JULY, 14), LocalDate.of(2020, Month.SEPTEMBER, 02), 0);
       Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Borges", "254666698", "14142365", Genero.MASCULINO, 3500, LocalDate.of(1975, Month.NOVEMBER, 29), LocalDate.of(2001, Month.JANUARY, 17), 0);
       Gerente gerente = new Gerente(Bonificacao.GERENTE, "Selena", "6598556", "7444635", Genero.FEMININO, 1452, LocalDate.of(1980, Month.MARCH, 05), LocalDate.of(2004, Month.FEBRUARY, 25), 0);
       
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(diretor.toString());
        System.out.println("");
        System.out.println(gerente.toString());
       
    }
    
}
