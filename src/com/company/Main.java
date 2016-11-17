package com.company;


import java.io.FileReader;
import java.text.*;
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
            return;
        }
            String textfile = args[0];//прочитали аргументы
            String typeSort  = args[1];
            String format = args[2];

            File f = new File(textfile);
            if(!f.exists() || f.isDirectory()){
                System.out.println("Некорректный файл");
                return;
            }

            FileTypeResolver fileTypeResolver = new FileTypeResolver();
            Format reader = fileTypeResolver.resolver(format);

            int[] readerSTR = reader.format(textfile);

            GetTypeSorting getTypeSorting = new GetTypeSorting();

            int [] resultAfterSort = getTypeSorting.getTypeSorting(typeSort).sortingAlogritm(readerSTR);

            System.out.println("Result after sorting array: "+ Arrays.toString(resultAfterSort));


        }
    }

