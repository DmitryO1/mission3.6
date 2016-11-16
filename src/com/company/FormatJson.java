package com.company;

import java.util.Arrays;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class FormatJson implements Format{
    public String json = "test1.txt";
    ReadArrayInFile readArrayInFile = new ReadArrayInFile();
    JsonOut jsonOut = new JsonOut();
    int[]a;


    @Override
    public int[] format(String txt) throws Exception {

        a = readArrayInFile.readArr(txt);
        System.out.print("Maccив: ");
        System.out.println(Arrays.toString(a));
        return  a;
    }
}
