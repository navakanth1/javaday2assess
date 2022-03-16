package com.harman.pr2;

import java.util.Scanner;

public class Coba1 extends Mythings1 {//inheritance
    public static void main(String[] args) {
        Coba1 co=new Coba1();
        Scanner input= new Scanner(System.in);
        int x,y,addresult,subresult;
        System.out.println("Enter 1st num:");
        x= input.nextInt();
        System.out.println("Enter 2nd num");
        y=input.nextInt();
        addresult=co.Add2numbers(x,y);
        System.out.println(addresult);
        subresult=co.Sub2numbers(x,y);
        System.out.println(subresult);

    }
}

