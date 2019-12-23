package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList spisok = new ArrayList();
        spisok.add(1);
        spisok.add("Hello");
        spisok.add(new Object());

        int a = (int)spisok.get(2);

        ArrayList<String> states = new ArrayList<String>();
        states.add("1");
        states.add("Hello!");
        String result = states.get(0);

        Account<Integer, Double> acc1
            = new Account<Integer, Double>(123,(double)9000);

        Account<String, Float> acc2
                = new Account<String, Float>("N2399",(float)78922200);




    }
}
