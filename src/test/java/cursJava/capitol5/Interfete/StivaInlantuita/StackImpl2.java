package cursJava.capitol5.Interfete.StivaInlantuita;

import cursJava.capitol5.Interfete.Stack;
import cursJava.capitol5.Interfete.StackException;

public class StackImpl2 implements Stack {
    class Node {
        //clasa interna ce reprezinta un nod al listei
        Object item; //informatioa din nod
        Node link; //legatura la urmatorul nod
        Node(Object item, Node link) {
            this.item = item;
            this.link = link;
        }
    }

    private Node top = null;
    //Referinta la varful stivei
    public void push (Object item) {
        Node node = new Node(item,top);
        top = node;
    }

    public void pop() throws StackException {
        if (empty())
            throw new StackException("Stiva este vida!");
        top =  top.link;
    }

    public Object peek() throws StackException {
        if (empty())
            throw new StackException("Stiva este vida!");
        return top.item;
    }

    public boolean empty() {
        return (top == null);
    }

    public String toString(){
        String s="";
        Node node = top;
        while (node != null) {
            s += (node.item).toString() + "";
            node = node.link;
        }
        return s;
    }
}