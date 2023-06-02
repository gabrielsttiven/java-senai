package atividade5;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente(25264, Genero.FEMININO, EstadoCivil.SEPARADO, LocalDate.of(1970, Month.AUGUST, 11), 11141, "Isabella", "856945125", "isabella@gmail.com",
       new Endereco("Rua", "36K", "1º Andar", "365957-859", "Guarulhos", UnidadeFederativa.SAO_PAULO));
       Medico medico = new Medico("8594755", "777458474", "2659555", "3659422", Setor.JURIDICO, 4500, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1981, Month.MARCH, 10), 3695847, "Renata", "558555445", "renata@gamil.com",
       new Endereco("Praça", "255", "Apartamento", "22565", "Salvador", UnidadeFederativa.BAHIA));
       Advogado advogado = new Advogado("225555", "77444115", "3659822", "4458782", Setor.JURIDICO, 1526, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.MAY, 27), 15264, "Roger", "74526655", "roger@gmail.com",
       new Endereco("Parque", "22", "10º Andar", "254866", "Monte Carlo", UnidadeFederativa.REIO_DE_JANEIRO));
       Engenheiro engenheiro = new Engenheiro("1144452", "369887788", "7789565", "444155668", Setor.ENGENHARIA, 3240, Genero.MASCULINO, EstadoCivil.VIUVO, LocalDate.of(1986, Month.JUNE, 14), 25654, "Leo", "7859955", "leo@gmail.com", 
       new Endereco("Rua", "365", "Casa", "8555", "Galorte", UnidadeFederativa.SAO_PAULO));
       
       
       System.out.println(cliente.toString());
       System.out.println("");
       System.out.println(medico.toString());
       System.out.println("");
       System.out.println(advogado.toString());
       System.out.println("");
       System.out.println(engenheiro.toString());
    }
    
}
