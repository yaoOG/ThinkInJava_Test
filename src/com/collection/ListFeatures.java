package com.collection;

import typeinfo.pets.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1 ： "+ pets );
        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2 : "+ pets);
        System.out.println("3 : "+ pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        System.out.println("4 " + p +" " +pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5 " +pets.indexOf(cymric));
        System.out.println("6 " +pets.remove(cymric));
        System.out.println("7 " +pets.remove(p));
        System.out.println("8 " +pets);
        pets.add(3,new Mouse());
        System.out.println("9 " +pets);
        List<Pet> sub = pets.subList(1,4);
        System.out.println("sublist :"+sub);
        System.out.println("10 :"+pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted sublist :"+sub);
        System.out.println("11 :"+pets.containsAll(sub));
        Collections.shuffle(sub,random);//随机打乱原来的顺序
        System.out.println("12 :"+pets.containsAll(sub));
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23 :"+pa[3].id());






    }
}
