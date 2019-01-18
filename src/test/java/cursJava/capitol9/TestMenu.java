package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

public class TestMenu {

    public static void main (String args[]) {

      Frame f = new Frame ("Test Menu");

        MenuBar mb = new MenuBar();

        Menu fisier = new Menu("File");
        fisier.add(new MenuItem("Open"));
        fisier.add(new MenuItem("Close"));
        fisier.addSeparator();
        fisier.add(new MenuItem("Exit"));

        Menu optiuni = new Menu ("Options");
        optiuni.add(new MenuItem("Copy"));
        optiuni.add(new MenuItem("Cut"));
        optiuni.add(new MenuItem("Paste"));

        Menu editare = new Menu("Edit");
        editare.addSeparator();
        editare.add(new CheckboxMenuItem("Bold"));
        editare.add(new CheckboxMenuItem("Italic"));

        mb.add(fisier);
        mb.add(editare);

        f.setMenuBar(mb);
        f.setSize(200, 100);
        f.show();

        }
}