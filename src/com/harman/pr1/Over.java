package com.harman.pr1;

public class Over {

    public static void main(String[] args) {//overriding
        Me mobj=new Me();
        mobj.name();
    }
}
class Dad {

    public void property() {
        System.out.println("House");
    }

    public void name() {
        System.out.println("Nava");
    }
}
class Me extends Dad{
    public void name() {
        System.out.println("Kanth");
    }
}
