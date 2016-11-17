package com.company;

import com.google.gson.Gson;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Dmitry on 17.11.2016.
 */
public class JsonOut implements OutputResultAfterSorting{

    @Override
    public int[] resultAfterSorting(String textFile) {
        try {
            Scanner in = new Scanner(new File(textFile));
            String str = null;
            while (in.hasNext()) {
                str = in.nextLine();
            }

            Gson parser = new Gson();

            return parser.fromJson(str, int[].class);
        } catch (Exception e) {
            System.out.println("Error");
        }
            return null;

    }
}
