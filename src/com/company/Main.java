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



        if (args.length < 3) {
            System.out.println("Недостаточно агрументов");
        }
            String textfile = args[0];
            String typeSort  = args[1];
            String format = args[2];

            ReadJSON readJSON = new ReadJSON();
            ReadFile readFile = new ReadFile();
            GetTypeSorting getTypeSorting = new GetTypeSorting();
            ReadArrayInFile readArrayInFile = new ReadArrayInFile();
            JsonOut jsonOut = new JsonOut();

            String resStr;
            int[] a = new int[]{};


            if (textfile.equals("test.txt")) {
                txtOut.resultAfterSorting(a,typeSort,textfile);
                System.out.print("Отсортированный массив: ");
                getTypeSorting.getTypeSorting(typeSort, a);

            } else if (textfile.equals("test1.txt")) {
                jsonOut.resultAfterSorting(a,typeSort,textfile);
                System.out.print("Отсортированный массив: ");
                getTypeSorting.getTypeSorting(typeSort, a);

            } else System.out.println("Файл не найден");


        }
    }

