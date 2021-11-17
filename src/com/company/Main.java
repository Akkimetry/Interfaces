package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            var reader = new FileReader("xyz");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        PhoneModel phone1 = new Samsung();

    }
}
