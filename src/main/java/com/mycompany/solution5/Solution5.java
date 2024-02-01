/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solution5;

/**
 *
 * @author Brigette Setlago
 */

       import java.util.*;
public class Solution5 {

   


    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
          // Generate and print the series
            generateSeries(a, b, n);
        }

        in.close();
    }

    // Function to generate and print the series
    private static void generateSeries(int a, int b, int n) {
        int term = a;
        for (int i = 0; i < n; i++) {
            term += Math.pow(2, i) * b;
            System.out.print(term + " ");
        }
        System.out.println();
    }
}
    

