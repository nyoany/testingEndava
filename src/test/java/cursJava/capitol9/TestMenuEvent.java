package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

public class TestMenuEvent extends Frame implements ActionListener, ItemListener{
    public TestMenuEvent (String titlu) {
        super (titlu);

        MenuBar mb1 = new MenuBar();
        Menu test = new Menu("Test");
        CheckboxMenuItem check = new CheckboxMenuItem("Check me");
        test.add(check);
        test.addSeparator();
        test.add(new MenuItem("Exit"));

        mb1.add(test);
        setMenuBar(mb1);

        Button btnExit = new Button("Exit");
        add(btnExit, BorderLayout.SOUTH);
        setSize(300,200);
        show();

        test.addActionListener(this);
        check.addItemListener(this);
        btnExit.addActionListener(this);
    }

    public void actionPerformed (ActionEvent e) {
        //valabila si pentru meniu si pentru buton
        String command = e.getActionCommand();
        if(command.equals("Exit"));
        System.exit(0);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
            setTitle("Checked");
        else
            setTitle("Not Checked");
    }

    public static void main (String args[]) {
        TestMenuEvent f = new TestMenuEvent("Tratare evenimente meniuri");
        f.show();
    }
}
