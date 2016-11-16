package com.company;

import java.util.Arrays;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class TxtOut implements OutputResultAfterSorting{

    ReadArrayInFile readArrayInFile = new ReadArrayInFile();
    GetTypeSorting getTypeSorting = new GetTypeSorting();

    @Override
    public void resultAfterSorting(int[] a, String typeSort, String textfile) {
        try {
            System.out.println("Введите тип сортировки");
            System.out.println(typeSort);



        }
        catch (Exception e){
            System.out.print("Ошибка");
        }
    }
}
