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
        Integer[] temp;
        //Integer[] numeros = new Integer[10000];
        //Integer[] numeros = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,6,3,2,1};
        //Integer[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        MergeSort<Integer> ordena = new MergeSort<Integer>();
//        ordena.mergeSort(numeros, 0, numeros.length);

        temp = Arrays.copyOf(numeros, numeros.length);
        
        MergeSortWithInsert<Integer> ordena = new MergeSortWithInsert<Integer>();

//        Random gerador = new Random();
//        for (int j = 0; j < 10000; j++) {
//            numeros[j] = gerador.nextInt();
//        }

        long tempIni = System.currentTimeMillis();
        ordena.mergeSort(numeros, 0, numeros.length);
        long tempFim = System.currentTimeMillis();
        
        System.out.println(MergeSortWithInsert.comp);

               


//        for(int x : numeros) {
//          System.out.print(x + ", ");
//        }
    }
    
   
}


