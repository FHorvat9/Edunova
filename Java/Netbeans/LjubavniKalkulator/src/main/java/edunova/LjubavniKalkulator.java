/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edunova;

/**
 *
 * @author Feecho
 */
public class LjubavniKalkulator {

    public static void main(String[] args) {
        new Pocetna().setVisible(true);

    }

    public static String start(String imeA, String imeB) {
        String broj = "";
        for (int i : Kalkulator(Brojslova(imeA, imeB))) {
            broj += i;

        }

        return imeA + " i " + imeB + " se vole " + broj + "%";
    }

    ;

    
        

public static int[] Brojslova(String imeA, String imeB) {

        String zajedno = imeA + imeB;

        int counter;

        char a[] = (zajedno.toLowerCase()).toCharArray();

        int brojevi[] = new int[zajedno.length()];

        for (int i = 0; i <= (zajedno.length() - 1); i++) {
            counter = 0;
            for (int j = 0; j <= (zajedno.length() - 1); j++) {
                if (a[i] == a[j]) {
                    counter++;
                }

            }
            brojevi[i] = counter;
        }

        brojevi = makniViseznamenkaste(brojevi);

        if (imeA.length() >= imeB.length()) {
            int[] prviKorak = new int[imeA.length()];
            for (int i = 0, index = 0; index < imeA.length(); index++, i++) {
                if (index >= imeB.length()) {
                    prviKorak[index] = 0 + brojevi[brojevi.length - (1 + i)];
                } else {
                    prviKorak[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];

                }

            }

            prviKorak = makniViseznamenkaste(prviKorak);

            return prviKorak;

        } else {
            int[] prviKorak = new int[imeB.length()];
            for (int i = 0, index = 0; index < imeB.length(); index++, i++) {
                if (index >= imeA.length()) {
                    prviKorak[index] = 0 + brojevi[brojevi.length - (1 + i)];
                } else {
                    prviKorak[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
                }

            }

            prviKorak = makniViseznamenkaste(prviKorak);

            return prviKorak;

        }

    }

    public static int[] Kalkulator(int[] medjuZbroj) {

        if (medjuZbroj.length <= 2) {

            return medjuZbroj;
        } else {
            if (medjuZbroj.length % 2 == 0) {
                int[] korak = new int[medjuZbroj.length / 2];
                for (int i = 0; i < korak.length; i++) {

                    korak[i] = medjuZbroj[i] + medjuZbroj[medjuZbroj.length - (1 + i)];

                }

                korak = makniViseznamenkaste(korak);
                if (korak.length > 2) {

                    return Kalkulator(korak);

                } else {

                    return Kalkulator(korak);

                }

            } else {
                int[] korak = new int[(medjuZbroj.length / 2) + 1];
                for (int i = 0; i < korak.length; i++) {

                    if (i == korak.length - 1) {
                        korak[i] = 0 + medjuZbroj[medjuZbroj.length - (1 + i)];
                    } else {
                        korak[i] = medjuZbroj[i] + medjuZbroj[medjuZbroj.length - (1 + i)];
                    }

                }

                if (korak.length > 2) {

                    return Kalkulator(makniViseznamenkaste(korak));

                } else {
                    return Kalkulator(makniViseznamenkaste(korak));

                }
            }
        }

    }

    public static int[] makniViseznamenkaste(int[] unos) {
        int counter = 0;
        for (int i : unos) {
            if (i >= 10) {
                counter++;
            }
        }
        int[] bezViseznamenkastih = new int[unos.length + counter];

        for (int i = 0, j = 0; i < unos.length; i++) {
            if (unos[i] < 10) {
                bezViseznamenkastih[j++] = unos[i];
            } else {
                bezViseznamenkastih[j++] = (unos[i] / 10);
                bezViseznamenkastih[j++] = (unos[i] % 10);

            }
        }

        int[] a = bezViseznamenkastih;

        return a;
    }

}
