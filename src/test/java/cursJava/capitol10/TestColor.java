package cursJava.capitol10;
import javafx.scene.control.ScrollBar;

import java.awt.*;
import java.awt.event.*;

class Culoare extends Canvas {
    public Color color = new Color(0,0,0,255);
    Dimension canvasSize = new Dimension(150,50);

    public void paint (Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 12));
        String text = "";
        text += " R =  " + color.getRed();
        text += " G =  " + color.getGreen();
        text += " B =  " + color.getBlue();
        text += " A =  " + color.getAlpha();
        g.drawString(text, 0, 30);

        g.setColor(color);
        g.fillRect(0,0, canvasSize.width, canvasSize.height);
    }

    public Dimension getPreferredSize() {
        return canvasSize;
    }
}

class Fereastra4 extends Frame implements AdjustmentListener {
    private Scrollbar rvalue, gValue, bValue, aValue;
    private Culoare culoare;
    public Fereastra4 (String titlu) {
        super(titlu);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        });
        Panel rgbValues = new Panel();
        rgbValues.setLayout(new GridLayout(4, 1));
        rvalue = new Scrollbar (Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        rvalue.setBackground(Color.red);
        gValue =  new Scrollbar (Scrollbar.HORIZONTAL ,0,1,0, 256);
        gValue.setBackground(Color.green);
        bValue = new Scrollbar (Scrollbar.HORIZONTAL ,0,1,0, 256);
        bValue.setBackground(Color.blue);
        aValue = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,256);
        aValue.setBackground(Color.lightGray);

        rgbValues.add(rvalue);
        rgbValues.add(gValue);
        rgbValues.add(bValue);
        rgbValues.add(aValue);
        rgbValues.setSize(200, 100);
        add(rgbValues, BorderLayout.CENTER);

        culoare = new Culoare();
        add(culoare, BorderLayout.NORTH);

        pack();

        rvalue.addAdjustmentListener(this);
        gValue.addAdjustmentListener(this);
        bValue.addAdjustmentListener(this);
        aValue.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r = rvalue.getValue();
        int g = gValue.getValue();
        int b = bValue.getValue();
        int a = aValue.getValue();
        Color c = new Color(r, g, b, a);
        culoare.color = c;
        culoare.repaint();
    }
}

public class TestColor {
    public static void main (String args[]) {
        Fereastra4 f = new Fereastra4("Color");
        f.show();
    }
}
