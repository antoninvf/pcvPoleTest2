package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        List<Integer> jed = new ArrayList<>();
        List<Integer> dva = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            jed.add(rand.nextInt(100));
        }
        for (int i = 0; i < 50; i++) {
            dva.add(rand.nextInt(100));
        }

        Collections.sort(jed);
        Collections.sort(dva);

        for (int i = 0; i < 50; i++) {
            jed.remove(i);
        }


        for (int i = 0; i < jed.size(); i++) {
            if (jed.get(i) == jed.get(i++)) {
                Collections.sort(jed);
                jed.remove(i);
                i--;
            }
        }
        for (int i = 0; i < dva.size(); i++) {
            if (dva.get(i) == dva.get(i++)) {
                Collections.sort(dva);
                dva.remove(i);
                i--;
            }
        }

        for (int i = 0; i < jed.size(); i++) {
            if (jed.get(i) != dva.get(i)) {
                int bweeejabreciim = jed.get(i);
                dva.set(i, bweeejabreciim);
            }
        }


        Collections.sort(jed);
        Collections.sort(dva);

        System.out.println("První pole - délka:" + jed.size());
        for (Integer integer : jed) {
            System.out.print(integer + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Druhé pole - délka:" + dva.size());
        for (Integer integer : dva) {
            System.out.print(integer + ",");
        }
        System.out.println();
        System.out.println();
        if (jed.equals(dva)) {
            System.out.println("Pole jsou stejná");
        } else {
            System.out.println("Pole nejsou stejná");
        }

    }
}
