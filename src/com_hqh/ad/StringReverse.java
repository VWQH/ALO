package com_hqh.ad;

public class StringReverse {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        String A = "madam";

        int a_pointer = 0;
        int b_pointer = A.length()-1;
        while (a_pointer <= b_pointer){
            if(A.charAt(a_pointer) != A.charAt(b_pointer)){
                System.out.println("No");
                return;
            }
            a_pointer++;
            b_pointer--;
        }
        System.out.println("Yes");

        */
        String a = "hello";
        String b = "olleh";


        int[] char_fre = new int[26];
        int a_lenght = a.length();
        int b_lenght = b.length();

        if(a_lenght != b_lenght)

        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a_lenght; i++) {
            char current = a.charAt(i);
            int index = current - 'a';
            char_fre[index]++;
            System.out.print(current + " ");
        }
        System.out.println();
        for (int i = 0; i < b_lenght; i++) {
            char current = b.charAt(i);
            int index = current - 'a';
            char_fre[index]--;
            System.out.print(current + " ");
        }

        for (int i = 0; i < 26; i++) {
            if(char_fre[i] != 0)
                System.out.println("No");
        }

    }
}
