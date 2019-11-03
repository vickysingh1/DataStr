/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortings;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class QuickSort {

    public int Partition(int arr[], int lb, int ub) {
        int pivot = arr[ub];
        int i = (lb - 1); // index of smaller element 
        for (int j = lb; j < ub; j++) {
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i + 1];
        arr[i + 1] = arr[ub];
        arr[ub] = temp;

        return i + 1;

    }

    public void Quick(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = Partition(arr, lb, ub);
            Quick(arr, lb, ub - 1);
            Quick(arr, lb + 1, ub);
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        QuickSort qk = new QuickSort();
        qk.Quick(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
