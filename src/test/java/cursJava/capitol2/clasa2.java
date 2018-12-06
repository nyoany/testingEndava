/*package cursJava.capitol2;

import org.testng.annotations.Test;

import java.awt.*;

public class clasa2 {

    public Rectangle()
    public Rectangle(int latime, int inaltime)
    public Rectangle(int x, int y, int latime, int inaltime)
    public Rectangle(Point origine)
    public Rectangle(Point origine, int latime, int inaltime)
    public Rectangle(Point origine, Dimension dimensiune)
    Rectangle patrat = new Rectangle(0, 0, 100, 100);

    Rectangle patrat = new Rectangle(new Point(0,0),
            new Dimension(100, 100));

    Rectangle patrat;
    patrat.x = 10;
//Eroare - lipseste instantierea

   Rectangle patrat = new Rectangle(0, 0, 100, 200);
    System.out.println(patrat.width); //afiseaza 100
    patrat.x = 10;
    patrat.y = 20; //schimba originea
    patrat.origin = new Point(10, 20); //schimba originea

    Rectangle patrat = new Rectangle(0, 0, 100, 200);
patrat.setLocation(10, 20); //schimba originea
patrat.setSize(200, 300); //schimba dimensiunea

    patrat.width = -100; //stare inconsistenta
patrat.setSize(-100, -200); //metoda setter
//metoda setSize poate sa testeze daca noile valori sunt
//corecte si sa valideze sau nu schimbarea lor
}

class Dreptunghi {
    double x, y, w, h;
    Dreptunghi(double x1, double y1, double w1, double h1) {
// Cel mai general constructor
        x=x1; y=y1; w=w1; h=h1;
        System.out.println("Instantiere dreptunghi");
    }
    Dreptunghi(double w1, double h1) {
// Constructor cu doua argumente
        x=0; y=0; w=w1; h=h1;
        System.out.println("Instantiere dreptunghi");
    }
    Dreptunghi() {
// Constructor fara argumente
        x=0; y=0; w=0; h=0;
        System.out.println("Instantiere dreptunghi");
    }
}

class Dreptunghi2 {
    double x, y, w, h;
    Dreptunghi(double x1, double y1, double w1, double h1) {
// Implementam doar constructorul cel mai general
        x=x1; y=y1; w=w1; h=h1;
        System.out.println("Instantiere dreptunghi");
    }
    Dreptunghi(double w1, double h1) {
        this(0, 0, w1, h1);
// Apelam constructorul cu 4 argumente
    }
    Dreptunghi() {
        this(0, 0);
// Apelam constructorul cu 2 argumente
    }
}

class Patrat extends Dreptunghi {
    Patrat(double x, double y, double d) {
        super(x, y, d, d);
// Apelam constructorul superclasei
    }
}

class Dreptunghi3 {
    double x, y, w, h;
// Nici un constructor
}
class Cerc {
    double x, y, r;
    // Constructor cu 3 argumente
    Cerc(double x, double y, double r) { ... };
}

    Dreptunghi d = new Dreptunghi();
    // Corect (a fost generat constructorul implicit)
    Cerc c;
c = new Cerc();
// Eroare la compilare !
        c = new Cerc(0, 0, 100);
// Varianta corecta

class A {
    int x=1;
    A(int x) { this.x = x;}
}
class B extends A {
    // Corect
    B() {super(2);}
    B(int x) {super.x = x;}
}
class C extends A {
    // Eroare la compilare !
    C() {super.x = 2;}
    C(int x) {super.x = x;}
}

class Exemplu {
    double x;
    protected static int n;
    public String s = "abcd";
    private Point p = new Point(10, 10);
    final static long MAX = 100000L;
}
class Test {
    final int MAX;
    Test() {
        MAX = 100; // Corect
        MAX = 200; // Eroare la compilare !
    }
}


class AA {
    int x;
    AA() {
        this(0);
    }
    AA(int x) {
        this.x = x;
    }
    void metoda() {
        x ++;
    }
}
class BB extends AA {
    BB() {
        this(0);
    }
    BB(int x) {
        super(x);
        System.out.println(x);
    }
    void metoda() {
        super.metoda();
        System.out.println(x);
    }
}


class Student {
...
    final float calcMedie(float note[], float ponderi[]) {
...
    }
...
}
class StudentInformatica extends Student {
    float calcMedie(float note[], float ponderi[]) {
        return 10.00;
    }
}// Eroare la compilare !

    public void afisareRezultat() {
        System.out.println("rezultat");
    }
    private void deseneaza(Shape s) {
...
        return;
    }

    double radical(double x) {
        if (x >= 0)
            return Math.sqrt(x);
        else {
            System.out.println("Argument negativ !");
// Eroare la compilare
// Lipseste return pe aceasta ramura
        }
    }


    int metoda() {
        return 1.2; // Eroare
    }
    int metoda() {
        return (int)1.2; // Corect
    }
    double metoda() {
        return (float)1; // Corect
    }


    Poligon metoda1( ) {
        Poligon p = new Poligon();
        Patrat t = new Patrat();
        if (...)
        return p; // Corect
else
        return t; // Corect
    }
    Patrat metoda2( ) {
        Poligon p = new Poligon();
        Patrat t = new Patrat();
        if (...)
        return p; // Eroare
else
        return t; // Corect
    }

class Cerc {
    int x, y, raza;
    public Cerc(int x, int y, int raza) {
        this.x = x;
        this.y = y;
        this.raza = raza;
    }
}
// Varianta incorecta:
class Cerc {
    private int x, y, raza;
    public void aflaParametri(int valx, int valy, int valr) {
// Metoda nu are efectul dorit!
        valx = x;
        valy = y;
        valr = raza;
    }
}

// Varianta corecta
class Param {
    public int x, y, raza;
}
class Cerc {
    private int x, y, raza;
    public void aflaParametri(Param param) {
        param.x = x;
        param.y = y;
        param.raza = raza;
    }
}



class Cerc {
    private int x, y, raza;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
...
}

    void metoda(Object ... args) {
        for(int i=0; i<args.length; i++)
            System.out.println(args[i]);
    }
...
        metoda("Hello");
        metoda("Hello", "Java", 1.5);


class A {
    void metoda() {
        System.out.println("A: metoda fara parametru");
    }
    // Supraincarcare
    void metoda(int arg) {
        System.out.println("A: metoda cu un parametru");
    }
}
class B extends A {
    // Supradefinire
    void metoda() {
        System.out.println("B: metoda fara parametru");
    }
}

    B b = new B();
b.metoda();
// Afiseaza "B: metoda fara parametru"

class B extends A {
    // Supradefinire prin extensie
    void metoda() {
        super.metoda();
        System.out.println("B: metoda fara parametru");
    }
}
. . .
        B b = new B();
        b.metoda();
/* Afiseaza ambele mesaje:
"A: metoda fara parametru"
"B: metoda fara parametru" */

/*class Exemplu {
    int x ; //variabila de instanta
}
        Exemplu o1 = new Exemplu();
        o1.x = 100;
        Exemplu o2 = new Exemplu();
        o2.x = 200;
        System.out.println(o1.x); // Afiseaza 100
        System.out.println(o2.x); // Afiseaza 200
class Exemplu {
    int x ; // Variabila de instanta
    static long n; // Variabila de clasa
}
. . .
        Exemplu o1 = new Exemplu();
        Exemplu o2 = new Exemplu();
        o1.n = 100;
        System.out.println(o2.n); // Afiseaza 100
        o2.n = 200;
        System.out.println(o1.n); // Afiseaza 200
        System.out.println(Exemplu.n); // Afiseaza 200
// o1.n, o2.n si Exemplu.n sunt referinte la aceeasi valoare
class Exemplu {
    static final double PI = 3.14;
    static long nrInstante = 0;
    static Point p = new Point(0,0);
}
class Exemplu {
    int x ; // Variabila de instanta
    static long n; // Variabila de clasa
    void metodaDeInstanta() {
        n ++; // Corect
        x --; // Corect
    }
    static void metodaStatica() {
        n ++; // Corect
        x --; // Eroare la compilare !

    }
    Exemplu.metodaStatica(); // Corect, echivalent cu
    Exemplu obj = new Exemplu();
        obj.metodaStatica(); // Corect, de asemenea
    Exemplu.metodaDeInstanta(); // Eroare la compilare !
    Exemplu obj = new Exemplu();
obj.metodaDeInstanta(); // Corect
}

class Exemplu {
    final double PI = 3.14;
// Variabila finala de instanta
}

class Exemplu {
    static long nrInstante = 0;
    Exemplu() {
// Constructorul este apelat la fiecare instantiere
        nrInstante ++;
    }
}

public class Test {
// Declaratii de variabile statice
static int x = 0, y, z;
    // Bloc static de initializare
    static {
        System.out.println("Initializam...");
        int t=1;
        y = 2;
        z = x + y + t;
    }
    Test() {
/* La executia constructorului
variabilele de clasa sunt deja initializate si
toate blocurile statice de initializare au
fost obligatoriu executate in prealabil.
*/
/*...
    }
}
*/

/* class ClasaDeAcoperire {
    class ClasaImbricata1 {
// Clasa membru
    }

    void metoda() {
        class ClasaImbricata2 {
// Clasa locala metodei
        }
    }
}

class ClasaDeAcoperire{
    private int x=1;
    class ClasaImbricata1 {
        int a=x;
    }
    void metoda() {
        final int y=2;
        int z=3;
        class ClasaImbricata2 {
            int b=x;
            int c=y;
            int d=z; // Incorect
        }
    }
}

*/