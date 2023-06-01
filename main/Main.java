package main;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica(Genero.FEMININO, "9999999", "85485522", LocalDate.of(1985, Month.MAY, 15), 15282, 0, 3564, "Helen", "7185658744", 
                          new Endereco("", "56", "Apartamento", "2658445", "Salvador", UnidadeFederativa.BAHIA));
        Juridica juridica = new Juridica("5588965", "36595422", LocalDate.of(1999, Month.DECEMBER, 12), LocalDate.of(2006, Month.MARCH, 29), 352658, 111, "ROGERS", "22235698",
                                new Endereco("Parque", "31", "Casa", "364214", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        
        System.out.println(juridica.toString());
        System.out.println("");
        System.out.println(fisica.toString());
        System.out.println("");
        
        
       
    }
    
}
