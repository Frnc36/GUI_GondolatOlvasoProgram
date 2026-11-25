package controller;

import java.util.Scanner;
import model.Pakli;
import view.Nezet;

public class JatekController {

    private Pakli pakli;
    private Nezet nezet;
    private Scanner sc = new Scanner(System.in);

    public JatekController(Pakli pakli, Nezet nezet) {
        this.pakli = pakli;
        this.nezet = nezet;
    }

    public void indit() {
        for (int i = 0; i < 3; i++) {
            nezet.kirak(pakli.getLapok());
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        nezet.kirak(pakli.getLapok());
        nezet.eredmenyKiir(pakli.ezVolt());
    }

    private int melyik() {
        int oszlop;
        do {
            nezet.uzenetKiir("Melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
        } while (oszlop < 1 || oszlop > 3);
        return oszlop;
    }
}