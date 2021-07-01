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

//Questao 4
public class MergeSortOptimized<T extends Comparable <T>>{
    public static int comp = 0;    
    
    public <T extends Comparable <T>> void sort(T[] v, T[] temp, int n){
        copy(v, temp, 0, n);
        mergeSort(v, temp, 0, n);
    }
    
    public static <T extends Comparable <T>> void mergeSort(T[] v, T[] temp, int inicio, int fim) {
        if(v.length <= 15){
            insertionSort(v, fim - inicio);
        }
        if(fim - inicio > 1){
            int meio = (inicio + fim)/2;
            mergeSort(temp, v, inicio, meio);
            mergeSort(temp, v, meio, fim);
            if(!(temp[meio].compareTo(temp[meio-1]) >= 0)){
                merge(temp, v, inicio, meio, fim);
            }
        }
    }
    
    public static <T extends Comparable<T>> void merge(T[] v, T[] temp, int inicio, int meio, int fim){
        int i = inicio;
        int m = meio;
        int pos = inicio;
        
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
    
    public static <T> void copy(T[] v, T[] temp, int ini, int fim){
        for(int i = ini; i< fim; i++){
            temp[i] = v[i];
        }
    }
}
