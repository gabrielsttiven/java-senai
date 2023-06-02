
package atividade4;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[]args) {
        
        Motoboy motoboy = new Motoboy("25565", "Dani", "1114299", "9988775", Genero.MASCULINO, 1200, Setor.JURIDICO, LocalDate.of(1985, Month.DECEMBER, 10));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Marcel", "6669656644", "774411233", Genero.MASCULINO, 6450, Setor.ADMINISTRATIVO, LocalDate.of(1999, Month.JULY, 02));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Helena", "4756533298", "32698145", Genero.FEMININO, 4890, Setor.RECURSOS_HUMANOS, LocalDate.of(1973, Month.JANUARY, 28));
        
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(gerente.toString());
        System.out.println("");
        System.out.println(diretor.toString());
    
   }
}