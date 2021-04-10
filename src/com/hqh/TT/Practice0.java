package com.hqh.TT;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice0 {

    static int[] addElement(int a[], int n, int ele, int pos){
        int[] newArr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            if(i < pos-1)
                newArr[i] = a[i];
            else if(i == pos-1)
                newArr[i] = ele;
            else
                newArr[i] = a[i-1];
        }
        return newArr;
    }

    static void addElenment1(Integer a[], int ele, int pos){
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        list.add(pos-1, ele);
        a = list.toArray(a);
        System.out.println(Arrays.toString(a));
    }


    static int[] deleteElemen(int[] a, int pos){
        if(a == null || pos < 0 || pos > a.length)
            return  a;
        int[] anotherArr = new int[a.length-1];
        for (int i = 0, k = 0; i < a.length; i++) {
            if(i == pos){
                continue;
            }
            anotherArr[k++] = a[i];
        }
        return  anotherArr;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};
        int n = a.length;
        int ele = 10, pos = 2;

        ///Integer b[] = {1, 2, 4, 5};
        //a = addElement(a, n, ele, pos);
        //System.out.println(Arrays.toString(a));
        //Integer b[] = {1, 2, 4, 5};
        //addElenment1(b, ele, pos);

        System.out.println("Arr: " + Arrays.toString(a));
        int index = 2;
        a =  deleteElemen(a, index);
        System.out.println(Arrays.toString(a));
    }
}
