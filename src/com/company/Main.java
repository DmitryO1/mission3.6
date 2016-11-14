package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {

        Main main = new Main();
        Scanner in = new Scanner(System.in);

        String textfile = in.next();
        if(!textfile.equals("test.txt")){
            System.out.println("Файл не найден");
        }
        else {
            String typeSort = in.next();

            int[] a = new int[]{};
            a = main.readArr("test.txt");
            main.typeOfSorting(textfile, a, typeSort);
        }
        /*int array[] = main.readArr(textfile);

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(main.sortBuble(array)));

        main.writingArrayInFile(textfile,array);*/

    }

    public int[] readArr(String file) throws Exception {

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

    public int [] sortBuble(int [] a){

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

    public void writingArrayInFile(String file, int a[]) throws Exception{
        String fileSource = file;
        int []array = a;
        PrintWriter printWriter = new PrintWriter(fileSource);
        printWriter.print(array);
        printWriter.close();
        System.out.println("Write into file :" + Arrays.toString(array));

    }

    public int [] typeOfSorting(String file, int a[], String typeSort){
        String buble = "buble";
        String merge = "merge";
        String insertion = "insertion";
        if(typeSort.equals(buble)){
            System.out.println(Arrays.toString(sortBuble(a)));
            return a;
        }
        else if(typeSort.equals(merge)){
            System.out.println(Arrays.toString(mergeSortList(a)));
            return a;
        }
        else if(typeSort.equals(insertion)){
            System.out.println(Arrays.toString(insertSort(a)));
            return a;
        }
        else System.out.println("Алгоритм сортировки указан неверно");
         return null;
    }

    public int[] merge(int []left,int []right){
        int lengthResult = left.length+right.length;
        int [] result = new int[lengthResult];
        int indexL=0;
        int indexR=0;
        int indexRes=0;

        while (indexL<left.length || indexR<right.length){
            if(indexL<left.length && indexR < right.length){
                if(left[indexL]<=right[indexR]){
                    result[indexRes] = left[indexL];
                    indexL++;
                    indexRes++;
                }
                else {
                    result[indexRes] = right[indexR];
                    indexR++;
                    indexRes++;
                }

            }
            else if (indexL<left.length){
                result[indexRes] = left[indexL];
                indexL++;
                indexRes++;
            }
            else if (indexR<right.length){
                result[indexRes] = right[indexR];
                indexR++;
                indexRes++;
            }
        }
        return result;
    }

    public int[] mergeSortList(int[]B) {
        if (B.length <= 1) {
            return B;
        }
        int mid = B.length / 2;
        int[] left = new int[mid];
        int[] right;
        if (B.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }
        int[] result = new int[B.length];
        for (int i = 0; i < mid; i++) {
            left[i]=B[i];
        }
        int x=0;
        for (int j=mid;j<B.length;j++){
            if(x<right.length)
                right[x]=B[j];
            x++;
        }

        left = mergeSortList(left);
        right = mergeSortList(right);
        result=merge(left,right);
        return result;
    }

    public int[] insertSort(int[] arr) {
        int key,temp,i,j;
        for(i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while (j>=0 && key<arr[j]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }

        }
        return arr;
    }

}
