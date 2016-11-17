package com.company;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class FormatJson implements Format{

    ReadArrayInFile readArrayInFile = new ReadArrayInFile();
    public final static String json = "json";


    @Override
    public int[] format(String json) throws Exception {

        Scanner in = new Scanner(new File(json));
        String str = null;
        while (in.hasNext()) {
                str = in.nextLine();
            }

        Gson parser = new Gson();

        return parser.fromJson(str, int[].class);
    }

}
