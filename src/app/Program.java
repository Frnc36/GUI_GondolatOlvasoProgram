package app;

import controller.JatekController;
import model.Pakli;
import view.Nezet;

public class Program {

    public static void main(String[] args) {
        Pakli pakli = new Pakli();
        Nezet nezet = new Nezet();
        JatekController controller = new JatekController(pakli, nezet);

        controller.indit();
    }
}