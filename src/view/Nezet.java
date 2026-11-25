package view;

import model.Lap;

public class Nezet {

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

    public void uzenetKiir(String uzenet) {
        System.out.print(uzenet);
    }

    public void eredmenyKiir(Lap lap) {
        System.out.println("Ez volt? " + lap.megjelenit());
    }
}