package view;

import java.util.Scanner;
import model.Lap;

public class KonzolNezet {

    private Scanner sc = new Scanner(System.in);

    public void kirak(Lap[] lapok) {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ". \t");
        }
        System.out.println();
        for (int i = 1; i < lapok.length; i++) {
            System.out.print(lapok[i].megjelenit() + "\t");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }

    public int melyik() {
        int oszlop;
        do {
            System.out.print("Melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
        } while (oszlop < 1 || oszlop > 3);
        return oszlop;
    }

    public void eredmenyKiir(Lap lap) {
        System.out.println("Ez volt? " + lap.megjelenit());
    }
}
