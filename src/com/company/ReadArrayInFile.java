package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Dmitry on 14.11.2016.
 */
public class ReadArrayInFile {
    public int[] readArr(String file) throws Exception {

        int length = 0;
        try {
            Scanner s1 = new Scanner(new File(file));
            while (s1.hasNextLine()) {//Определяю кол-во строк, в дальнейшем определю размер массива
                length++;
                s1.next();
            }
            //После того как узнал размер будущего массива, передаю длину в массив s2
            int[] text = new int[length];

            Scanner s2 = new Scanner(new File(file));
            for (int i = 0; i < length; i++) {
                text[i] = Integer.valueOf(s2.next());
            }


            return text;

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        return null;
    }

}
