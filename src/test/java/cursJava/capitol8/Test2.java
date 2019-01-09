package cursJava.capitol8;

import java.io.*;

// 8.2 membrii neserializabili

class A {
    int x=1;
}

class B implements Serializable {
    int y=2;
}

public class Test2 implements Serializable {
    A a = new A(); //exceptie
    B b = new B(); //Da

    public String toString(){
        return a.x + "," + b.y;
    }
}
