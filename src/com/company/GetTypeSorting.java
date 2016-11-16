package com.company;

import java.util.Arrays;

import static java.lang.System.in;

/**
 * Created by Dmitry on 14.11.2016.
 */
public class GetTypeSorting {

    BubleSort bubleSort = new BubleSort();
    MergeSort mergeSort = new MergeSort();
    InserSort inserSort = new InserSort();


    public void getTypeSorting(String typeSort, int []a){

        if(typeSort.equals("buble")){
            System.out.println(Arrays.toString(bubleSort.sortingAlogritm(a)));
        }
        else if(typeSort.equals("merge")){
            System.out.println(Arrays.toString(mergeSort.sortingAlogritm(a)));
        }
        else if(typeSort.equals("insertion")){
            System.out.println(Arrays.toString(inserSort.sortingAlogritm(a)));
        }
        else  System.out.println("Указан неправильный тип сортировки");
    }

}
