
package statics;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("Homer", LocalDate.of(2002, Month.DECEMBER, 14), 2000.69);
       
       
        System.out.println(pessoa.toString());
    }
    
}
