package com.company;

/**
 * Created by Dmitry on 14.11.2016.
 */
public class MergeSort implements SortAlgorithms{

    public final static String MERGE = "merge";

    @Override
        public int[] sortingAlogritm(int[] a) {

            if (a.length <= 1) {
                return a;
            }
            int mid = a.length / 2;
            int[] left = new int[mid];
            int[] right;
            if (a.length % 2 == 0) {
                right = new int[mid];
            } else {
                right = new int[mid + 1];
            }
            int[] result = new int[a.length];
            for (int i = 0; i < mid; i++) {
                left[i]=a[i];
            }
            int x=0;
            for (int j=mid;j<a.length;j++){
                if(x<right.length)
                    right[x]=a[j];
                x++;
            }

            left = sortingAlogritm(left);
            right = sortingAlogritm(right);
            result=merge(left,right);
            return result;
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

}
