/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Arrays;

/**
 *
 * @author emanu
 */
public class MergeSortWithInsert <T extends Comparable<T>>{
    public static int comp = 0;    
    
    public <T extends Comparable <T>> void mergeSort(T[] v, int inicio, int fim) {
        if(v.length <= 15){
            insertionSort(v, fim - inicio);
        }
        if(fim - inicio > 1){
            int meio = (inicio + fim)/2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio, fim);
            if(!(v[meio].compareTo(v[meio-1]) >= 0)){
                merge(v, inicio, meio, fim);

            }
        }
    }
    
    public static <T extends Comparable<T>> void merge(T[] v, int inicio, int meio, int fim){
        T[] temp = Arrays.copyOf(v, fim - inicio);
        int i = inicio;
        int m = meio;
        int pos = 0;
        
        while(i < meio && m < fim){
            //v[i] < v[m]
            if(v[i].compareTo(v[m]) < 0)
                temp[pos++] = v[i++];
            else
                temp[pos++] = v[m++];
            comp++;
        }
        
        while(i < meio){
            temp[pos++] = v[i++];
            comp++;
        }
        
        while(m < fim){
            temp[pos++] = v[m++];
            comp++;
        }

        for(pos = 0, i = inicio; i < fim; i++, pos++){
            v[i] = temp[pos];
            comp++;
        }
            
    }
    
    public static <T extends Comparable<T>> void insertionSort(T[] v, int n){
        int i, j;
        T aux;
        
        for(i=0; i<n; i++){
            aux = v[i];
            for(j = i; j>0 && (aux.compareTo(v[j-1]) < 0);j--){
                v[j] = v[j-1];
            }
            v[j] = aux;
        }
    }
}
