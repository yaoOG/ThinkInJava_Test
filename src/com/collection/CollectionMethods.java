package com.collection;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        System.out.println(c);
    }
}
