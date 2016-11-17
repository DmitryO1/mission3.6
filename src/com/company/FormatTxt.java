package com.company;

import java.util.Arrays;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class FormatTxt implements Format {

    ReadArrayInFile readArrayInFile = new ReadArrayInFile();
    public final static String formatTxt = "txt";


    @Override
    public int[] format(String txt) throws Exception {

        int [] a = readArrayInFile.readArr(txt);
        return  a;
    }
}
