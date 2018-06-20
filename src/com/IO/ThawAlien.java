package com.IO;

import java.io.*;

public class ThawAlien{
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(new File("/Users/zhuyao/IdeaProjects/Java/ThinkInJava_Test/","X.file")));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());

    }
}
