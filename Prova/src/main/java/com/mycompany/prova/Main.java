package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        
        
        Motoboy motoboy = new Motoboy("588558", "741521", "256485", "123", Setor.OPERACOES, 15264, LocalDate.of(2005, Month.JANUARY, 04), Genero.MASCULINO, "Elias", "77758488",
                "eliasboaventura@gmail.com", new Endereco("Praça", "35", "Casa", "45865", "Ipanema", UnidadeFederativa.RIO_DE_JANEIRO));
        Medico medico = new Medico("12552", "45856", "47451", "256", Setor.SAUDE, 3520, LocalDate.of(1985, Month.FEBRUARY, 24), Genero.FEMININO, "Marta", "998653241", "martadasilva@outlook.com",
        new Endereco("Rua", "68", "1º Andar", "36598756", "Feira de Santana", UnidadeFederativa.BAHIA));
        Advogado advogado = new Advogado("11414", "32658745216", "447855411", "381", Setor.JURIDICO, 6150, LocalDate.of(1965, Month.OCTOBER, 11), Genero.MASCULINO, "Welton", "85954221", "weltonvieiro@hotmail.com",
        new Endereco("Rodovia", "71", "Última Casa", "269741349", "Guarulhos", UnidadeFederativa.SAO_PAULO));
        Cliente cliente = new Cliente(65954422, LocalDate.of(2002, Month.SEPTEMBER, 05), Genero.FEMININO, "Natalia", "7185554695", "nataliasantana@hotmail.com",
        new Endereco("Beco", "4006", "Casa", "11452244", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Juridica juridica = new Juridica("698993412", "227896", "Bartolomeu", "8954442453", "bartolomeumoveis@yahoo.com",
        new Endereco("Rua", "286", "Apartamento", "22564585", "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println(advogado.toString());
        System.out.println("");
        System.out.println(cliente.toString());
        System.out.println("");
        System.out.println(juridica.toString());
        
        
    }
}
