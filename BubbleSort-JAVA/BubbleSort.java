
package com.mycompany.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {20,1,2,9,33,11};
        for(int i : array){
            System.out.print(i+" ");
        }
        
        bubbleSort(array);
        
        System.out.println("\nAfter bubbleSort");
        
        for(int i : array){
            System.out.print(i+" ");
        }
        
        
    }


    private static void bubbleSort(int[] array){
        int temp;
        for(int i = 0; i<array.length;i++){
            for(int j = 1;j<array.length-i;j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }    
            }
        }
    }
}