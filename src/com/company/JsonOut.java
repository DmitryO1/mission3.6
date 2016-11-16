package com.company;
import com.google.gson.Gson;

import java.util.Arrays;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class JsonOut implements OutputResultAfterSorting {


    GetTypeSorting getTypeSorting = new GetTypeSorting();
    ReadFile readFile = new ReadFile();
    ReadJSON readJSON = new ReadJSON();
    Gson parser = new Gson();
    String resStr;

    @Override
        public void resultAfterSorting(int[] a, String typeSort, String textfile) {
    try {
        System.out.println("Введите тип сортировки");
        System.out.println(typeSort);
        resStr = readFile.read();
        System.out.print("Maccив: ");
        System.out.println(resStr);

        int[] arr = readJSON.toArray(resStr, parser);//Парсинг в массив
        System.out.print("Отсортированный массив: ");
        getTypeSorting.getTypeSorting(typeSort, arr);
    }
    catch (Exception e){
        System.out.print("Ошибка");
    }
    }


}
