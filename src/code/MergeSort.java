/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author emanu
 * @param <T>
 */

//Questao 1
public class MergeSort<T extends Comparable <T>>{
     public <T extends Comparable <T>> void mergeSort(T[] v, int inicio, int fim) {
        if(fim - inicio > 1){
            int meio = (inicio + fim)/2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio, fim);
            merge(v, inicio, meio, fim); 
        }

    }
    
    
    public static <T extends Comparable<T>> void merge(T[] v, int inicio, int meio, int fim){
        T[] temp = Arrays.copyOf(v, v.length);
        int i = inicio;
        int m = meio;
        int pos = 0;
        
        while(i < meio && m < fim){
            if(v[i].compareTo(v[m]) < 0)
                temp[pos++] = v[i++];
            else
                temp[pos++] = v[m++];
        }
        
        while(i < meio){
            temp[pos++] = v[i++];
        }
        
        while(m < fim){
            temp[pos++] = v[m++];
        }
        
        for(pos = 0, i = inicio; i < fim; i++, pos++)
            v[i] = temp[pos];
    }

}
