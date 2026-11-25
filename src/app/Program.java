package app;

import controller.JatekController;
import model.Pakli;
import view.KonzolNezet;

public class Program {

    public static void main(String[] args) {
        Pakli pakli = new Pakli();
        KonzolNezet nezet = new KonzolNezet();
        JatekController controller = new JatekController(pakli, nezet);

        controller.indit();
    }
}
