/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edunova;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OibGenerator {

    public OibGenerator() {
       
        generirajOib(10000);
       
        
    }

    public static void generirajOib(int kolicina) {
        for(int x=0;x<kolicina;x++){
        StringBuilder oib = new StringBuilder();
        oib.append(slucajniBroj(10));
        int znamenka = Integer.parseInt(String.valueOf(oib.charAt(0))) + 10;
        int kontrolnaZnamenka = 0;
        for (int i = 0, j = 0; i < 10; i++) {

            if (znamenka % 10 == 0) {
                znamenka = 10;
            } else {
                znamenka = znamenka % 10;
            }
            znamenka *= 2;
            znamenka = znamenka % 11;
            if (i == 9) {
                break;
            }
            znamenka += Integer.parseInt(String.valueOf(oib.charAt(i + 1)));
            
        }
        
        if (11 - znamenka != 10) {
            
            kontrolnaZnamenka = 11 - znamenka;
        }
       
        System.out.println(x+1+". oib je: " + oib.append(kontrolnaZnamenka));
        }
    }
    public static long slucajniBroj(int brojznamenki) {
    long min = (long) Math.pow(10, brojznamenki - 1);
    return ThreadLocalRandom.current().nextLong(min, min * 10);
}

    public static void main(String[] args) {
        new OibGenerator();
    }

}
