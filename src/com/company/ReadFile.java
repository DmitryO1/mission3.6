package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Dmitry on 15.11.2016.
 */
public class ReadFile {

    public String read() throws IOException{
        Scanner in = new Scanner(new File("test1.txt"));

        String str = null;
        while (in.hasNext()) {
            str = in.nextLine();
        }

        return str;
    }

}
