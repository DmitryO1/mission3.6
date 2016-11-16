package com.company;


import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;

public  class Main {

    public static void main(String[] args) throws Exception {

        if (args.length > 0) {
            String s = args[0];
            String textfile =s;

            ReadJSON readJSON = new ReadJSON();
            ReadFile readFile = new ReadFile();
            GetTypeSorting getTypeSorting = new GetTypeSorting();
            ReadArrayInFile readArrayInFile = new ReadArrayInFile();
            Gson parser = new Gson();
            String resStr;
            Scanner in = new Scanner(System.in);


            if (textfile.equals("test.txt")) {
                System.out.println("Введите тип сортировки");
                String typeSort = in.next();
                int[] a = new int[]{};
                a = readArrayInFile.readArr(s);
                System.out.print("Maccив: ");
                System.out.println(Arrays.toString(a));
                System.out.print("Отсортированный массив: ");
                getTypeSorting.getTypeSorting(typeSort, a);
            } else if (textfile.equals("test1.txt")) {
                System.out.println("Введите тип сортировки");
                String typeSort = in.next();
                int[] a = new int[]{};
                resStr = readFile.read();
                System.out.print("Maccив: ");
                System.out.println(resStr);

                int[] arr = readJSON.toArray(resStr, parser);//Парсинг в массив
                System.out.print("Отсортированный массив: ");
                getTypeSorting.getTypeSorting(typeSort, arr);
            } else System.out.println("Файл не найден");


        }
    }
}
