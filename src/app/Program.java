package app;

import controller.JatekController;
import model.Pakli;
import view.GUINezet;

public class Program {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pakli pakli = new Pakli();
                GUINezet view = new GUINezet();
                JatekController controller = new JatekController(pakli, view);
                
                view.setController(controller);
                view.setVisible(true);
                controller.indit();
            }
        });
    }
}