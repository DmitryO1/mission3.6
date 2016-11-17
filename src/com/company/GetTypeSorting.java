package com.company;

import java.util.Arrays;

import static java.lang.System.in;

/**
 * Created by Dmitry on 14.11.2016.
 */
public class GetTypeSorting {


    public SortAlgorithms getTypeSorting(String typeSort){


        if(typeSort.equals(BubleSort.BUBLE)){
            return new BubleSort();
        }
        else if(typeSort.equals(MergeSort.MERGE)){
            return new MergeSort();
        }
        else if(typeSort.equals(InserSort.INSER)){
            return new InserSort();
        }
        else  System.out.println("Указан неправильный тип сортировки");
        return null;
    }

}
