
package com.mycompany.main;
public class Main {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("2565845", "Gabriel", "854.444.695-85", "32.555.694-41", Double.valueOf(25152));
        Engenheiro engenheiro = new Engenheiro("SEL985WW6W", "Kauã", "741.554.632-12", "21.477.112-98", Double.valueOf(36954));
        Medico medico = new Medico("96334888", "Jéssica", "541.369.445-20", "69.736.200-10", Double.valueOf(9524));
        
        
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(engenheiro.toString());
        System.out.println("");
        System.out.println(medico.toString());
    }
}
