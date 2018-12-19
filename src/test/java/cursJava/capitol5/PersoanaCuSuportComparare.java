package cursJava.capitol5;

class PersoanaCuSuportComparare implements Comparable {
    int cod;
    String nume;

    public PersoanaCuSuportComparare (int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public String toString() {
        return cod + " \t" + nume;
    }

    public boolean equals(Object o) {
        if (!(o instanceof PersoanaCuSuportComparare))
            return false;
        PersoanaCuSuportComparare p = (PersoanaCuSuportComparare) o;
        return (cod == p.cod) && (nume.equals(p.nume));
    }

    public int compareTo (Object o ) {
        if (o==null)
            throw new NullPointerException();
        if (!(o instanceof PersoanaCuSuportComparare))
            throw new ClassCastException("Nu se pot compara!");

        PersoanaCuSuportComparare p = (PersoanaCuSuportComparare) o;

        return (cod - p.cod);
    }
}


