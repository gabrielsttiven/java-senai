
package operacaomatematica;
public class Main {
    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(123, 478));
        System.out.println("");
        System.out.println("Substração: " + subtracao.calcular(123, 478));
        System.out.println("");
        System.out.println("Multiplicação: " + multiplicacao.calcular(123, 478));
        System.out.println("");
        System.out.println("Divisão: " + divisao.calcular(123, 478));
        
    }
}
