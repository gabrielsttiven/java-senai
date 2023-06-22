/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contratar;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("256844", "Carlos", LocalDate.of(1995, Month.MARCH, 25), Genero.MASCULINO, Setor.OPERACOES, 0);
        Diretor diretor = new Diretor("Selena", LocalDate.of(1977, Month.NOVEMBER, 14), Genero.FEMININO, Setor.OPERACOES, 0);
        
        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());
    }
    
}
