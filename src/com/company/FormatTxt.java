package com.company;

import java.util.Arrays;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class FormatTxt implements Format {

    ReadArrayInFile readArrayInFile = new ReadArrayInFile();
    TxtOut txtOut = new TxtOut();
    public String txt = "test.txt";
    int[] a;

    @Override
    public int[] format(String txt) throws Exception {

        a = readArrayInFile.readArr(txt);
        System.out.print("Maccив: ");
        System.out.println(Arrays.toString(a));
        return  a;
    }
}
