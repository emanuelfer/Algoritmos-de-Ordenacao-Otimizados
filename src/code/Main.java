/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author emanu
 */
public class Main{
    public static void main(String[] args) {
        Integer[] numeros = {3, 9, 8, 7, 6, 2, 1, 5, 44, 23, -6, 14,25, 8,100, 6, 85, 1, 0, 6, 5, 77, 123, -8};
        Integer[] temp = Arrays.copyOf(numeros, numeros.length);
        
        
        MergeSortOptimized<Integer> ordena = new MergeSortOptimized<Integer>();
        ordena.sort(numeros, temp, numeros.length);
        
        for(int x : numeros) {
          System.out.print(x + " ");
        }
    }
    
   
}


