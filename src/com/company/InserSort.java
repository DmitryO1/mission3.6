package com.company;

/**
 * Created by Dmitry on 14.11.2016.
 */
public class InserSort implements SortAlgorithms {

    public final static String INSER = "insertion";

        @Override
        public int[] sortingAlogritm(int[] a) {

            int key,temp,i,j;
            for(i=1;i<a.length;i++){
                key=a[i];
                j=i-1;
                while (j>=0 && key<a[j]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    j--;
                }

            }
            return a;
        }

        }


