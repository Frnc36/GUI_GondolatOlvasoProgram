package controller;

import model.Lap;
import model.Pakli;
import view.GUINezet;

public class JatekController {

    private Pakli model;
    private GUINezet view;
    private int kor = 0;

    public JatekController(Pakli pakli, GUINezet nezet) {
        this.model = pakli;
        this.view = nezet;
    }

    /**
     * Átalakít Lap[] -> String[], át adja view-nak
     */
    public void indit() {
        view.kirak(atalakit());
    }

    public void oszlopValasztva(int oszlop) {
        if (kor < 3) {
            model.kever(oszlop);
            kor++;
            view.kirak(atalakit());

            if (kor == 3) {
                Lap talalat = model.ezVolt();
                String talalatNev = (talalat != null) ? talalat.megjelenit() : "";
                view.eredmenyKiir(talalatNev);
            }
        }
    }

    private String[] atalakit() {
        Lap[] lapok = model.getLapok();
        String[] tomb = new String[lapok.length];
        for (int i = 1; i < lapok.length; i++) {
            if (lapok[i] != null) {
                tomb[i] = lapok[i].megjelenit();
            }
        }
        return tomb;
    }

    public void ujJatek() {
        model.feltolt();
        kor = 0;
        view.alapAllapot();
        view.kirak(atalakit());
    }
}
