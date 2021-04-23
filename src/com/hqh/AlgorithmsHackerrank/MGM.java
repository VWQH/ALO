package com.hqh.AlgorithmsHackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MGM {
    public static void main(String[] args)  {
        /*int a[][] = {
                {1, 2, 3},
                {2, 0, 3},
                {2, 2, 3}
        };*/

        int a[][] = {
                {1, 2, 3},
                {1, 0, 1},
                {1, 0, 1}
        };


        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                /*if((i == 1) || (j == 1))
                    a[i][j]  = 0;*/
                if((i == 1 || j == 1) || (i == 2 && j == 1) || (i == 2))
                    a[i][j] = 0;

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
