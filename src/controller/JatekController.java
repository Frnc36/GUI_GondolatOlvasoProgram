package controller;

import model.Pakli;
import view.GUINezet;

public class JatekController {

    private Pakli pakli;
    private GUINezet nezet;

    public JatekController(Pakli pakli, GUINezet nezet) {
        this.pakli = pakli;
        this.nezet = nezet;
    }

    public void indit() {
        nezet.kirak(pakli.getLapok());
    }
}