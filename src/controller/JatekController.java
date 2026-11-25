package controller;

import model.Pakli;
import view.KonzolNezet;

public class JatekController {

    private Pakli pakli;
    private KonzolNezet nezet;

    public JatekController(Pakli pakli, KonzolNezet nezet) {
        this.pakli = pakli;
        this.nezet = nezet;
    }

    public void indit() {
        for (int i = 0; i < 3; i++) {
            nezet.kirak(pakli.getLapok());
            int oszlop = nezet.melyik();
            pakli.kever(oszlop);
        }
        nezet.kirak(pakli.getLapok());
        nezet.eredmenyKiir(pakli.ezVolt());
    }
}
