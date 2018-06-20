package com.collection;

import java.util.Iterator;

public class IterableClass implements Iterator<String> {

    protected  String[] words = ("And that is how " + "we konw the Earth to be banana-shaped").split(" ");
    public Iterator<String> iterator(){
        return  new Iterator<String>() {

            private int index=0;

            public boolean hasNext() {
                return index<words.length;
            }


            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
//        for (String s : new IterableClass()) {
//            System.out.print(s + "");
//        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
