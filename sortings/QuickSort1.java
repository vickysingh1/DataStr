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
public class QuickSort1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        long arr[];
        arr= new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] =kb.nextLong();
        }
        QuickSort1 obj = new QuickSort1();
        obj.QuickRecursion(arr, 0, n - 1);
        obj.Show(arr);
        System.out.println("second max"+arr[n-2]);
    }

    long Partition(long arr[], int low, int high) {
        long pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                long temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;        
    }

    void QuickRecursion(long arr[],int  low, int high) {
        long pi = Partition(arr, low, high);
        if (low < pi - 1) {
            QuickRecursion(arr, low, (int)pi - 1);
        }
        if (pi < high) {
            QuickRecursion(arr, (int)pi, high);
        }
    }

    void Show(long arr[]) {
        for (long i : arr) {
            System.out.print(i + " ");
        }
    }
}
