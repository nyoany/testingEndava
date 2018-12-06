/*package cursJava.capitol2;

class Complex {
    private double a; // partea reala
    private double b; // partea imaginara
    public Complex ( double a, double b) {
        this .a = a;
        this .b = b;
    }
    public Complex () {
        this (1, 0);
    }
    public boolean equals ( Object obj) {
        if (obj == null ) return false ;
        if (!( obj instanceof Complex )) return false ;
        Complex comp = ( Complex ) obj;
        return ( comp .a==a && comp .b==b);
    }
    public Object clone () {
        return new Complex (a, b);
    }
    public String toString () {
        String semn = (b > 0 ? "+" : "-");
        return a + semn + b + "i";
    }
    public Complex aduna ( Complex comp ) {
        Complex suma = new Complex (0, 0);
        suma .a = this .a + comp .a;
        suma .b = this .b + comp .b;
        return suma ;
    }
}
public class TestComplex {
    public static void main ( String c[]) {
        Complex c1 = new Complex (1 ,2);
        Complex c2 = new Complex (2 ,3);
        Complex c3 = ( Complex ) c1. clone ();
        System . out. println (c1. aduna (c2)); // 3.0 + 5.0i
        System . out. println (c1. equals (c2)); // false
        System . out. println (c1. equals (c3)); // true
    }
}

public class CuloriSemafor {
    public static final int ROSU = -1;
    public static final int GALBEN = 0;
    public static final int VERDE = 1;
    ...
// Exemplu de utilizare
            if (semafor.culoare = CuloriSemafor.ROSU)
    semafor.culoare = CuloriSemafor.GALBEN);
        ...
}


public enum CuloriSemafor { ROSU, GALBEN, VERDE };
...
// Utilizarea structurii se face la fel
        ...
        if (semafor.culoare = CuloriSemafor.ROSU)
        semafor.culoare = CuloriSemafor.GALBEN);
        ...

*/