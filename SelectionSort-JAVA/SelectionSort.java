/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selectionsort;

/**
 *
 * @author Krym
 */
public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] array = {1,20,72,2,4,2,83,15,23,11};
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println("");
        selectSort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    
    
    
private static void selectSort(int[] array){
     for(int i = 0;i<array.length-1;i++){
            int minindx=i;
            for(int j = i+1;j<array.length;j++){
                if(array[minindx] > array[j]){
                    minindx = j;
                }    
            }
            if(minindx!= i){
                int temp = array[i];
                array[i] = array[minindx];
                array[minindx] = temp;
            }
        }
    }
}
