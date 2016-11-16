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


public  class Main {

    public static void main(String[] args) throws Exception {

        BubleSort bubleSort = new BubleSort();
        InserSort inserSort = new InserSort();
        MergeSort mergeSort = new MergeSort();
        ReadJSON readJSON = new ReadJSON();
        ReadFile readFile = new ReadFile();
        GetTypeSorting getTypeSorting = new GetTypeSorting();
        ReadArrayInFile readArrayInFile = new ReadArrayInFile();
        GetTypeSorting sorting = new GetTypeSorting();
        Gson parser = new Gson();
        String resStr;

        Scanner in = new Scanner(System.in);

        String textfile = in.next();
        if (textfile.equals("test.txt")) {
            String typeSort = in.next();
            int[] a = new int[]{};
            a = readArrayInFile.readArr("test.txt");
            System.out.println(Arrays.toString(a));
            getTypeSorting.getTypeSorting(typeSort, a);
        }

        else if (textfile.equals("test1.txt")){
            String typeSort = in.next();
            int[] a = new int[]{};
            resStr = readFile.read();
            System.out.println(resStr);

            int[] arr = readJSON.toArray(resStr, parser);//Парсинг в массив
            getTypeSorting.getTypeSorting(typeSort, arr);
        }

        else System.out.println("Файл не найден");



    }
}
