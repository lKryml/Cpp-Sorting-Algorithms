/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertionsort;

/**
 *
 * @author Krym
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1,20,72,2,4,2,83,15,23,11};
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println("");
        insertionSort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }


public static void insertionSort(int[] array){
  for(int i = 1;i<array.length;i++){
      int temp = array[i];
      int j = i-1;
      while(j >= 0 && array[j] > temp){
          array[j+1] = array[j];
          j--;
      }
      array[j+1] = temp;
      
  }
}
}