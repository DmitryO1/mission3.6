package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class TxtOut implements OutputResultAfterSorting {

    @Override
    public int[] resultAfterSorting(String textfile) {

            int length = 0;
            try {
                Scanner s1 = new Scanner(new File(textfile));
                while (s1.hasNextLine()) {//Определяю кол-во строк, в дальнейшем определю размер массива
                    length++;
                    s1.next();
                }
                //После того как узнал размер будущего массива, передаю длину в массив s2
                int[] text = new int[length];

                Scanner s2 = new Scanner(new File(textfile));
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
