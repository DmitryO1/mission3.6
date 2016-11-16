package com.company;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by Dmitry on 14.11.2016.
 */
public class WriteArrayInFile {
    public void writingArrayInFile(String file, int a[]) throws Exception{
        String fileSource = file;
        int []array = a;
        PrintWriter printWriter = new PrintWriter(fileSource);
        printWriter.print(array);
        printWriter.close();
        System.out.println("Write into file :" + Arrays.toString(array));

    }
}
