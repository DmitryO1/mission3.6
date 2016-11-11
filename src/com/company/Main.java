package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String textfile = in.next();

        int array[] = readArr(textfile);

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] readArr(String file) throws Exception {
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

    public static int [] sort(int [] a){

            for(int i=a.length-1;i>0;i--) {
                for(int j=0;j<i;j++){
                    if (a[j] > a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                     }
                }
            }
        return a;
    }

}
