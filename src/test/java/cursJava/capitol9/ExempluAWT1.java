package cursJava.capitol9;
import java.awt.*;

public class ExempluAWT1 {

    public static void main(String args[]){
        //crearea ferestrei - un obiect de tip frame
        Frame f = new Frame("O fereastra");

        //setarea modului de dispunere a componentelor
        f.setLayout(new FlowLayout());

        //crearea celor 2 butoane
        Button b1 = new Button("Ok");
        Button b2 = new Button("Cancel");

        //adaugarea butoanelor (la fereastra?)
        f.add(b1);
        f.add(b2);
        f.pack();

        //afisarea ferestrei
        f.show();
    }
}
