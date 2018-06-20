package com.IO;

import java.io.*;

public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("x.file"));
        Alien quellek = new Alien();
        out.writeObject(quellek);

    }
}

