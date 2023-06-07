package src.Constructor.src;

import src.Constructor.src.Parent;

public class Child extends Parent {

    int b;

    public Child(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public Child(int b) {
        this.b = b;
    }

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }

}
