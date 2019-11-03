/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class BinarySearch {

    public int BinarySearching(int arr[], int n, int data) {
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (data == arr[mid]) {
                return mid;
            } else if (data < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter the data you want to Search:");
        int data = kb.nextInt();
        BinarySearch obj = new BinarySearch();
        int ret = obj.BinarySearching(arr, n, data);
        if (ret == -1) {
            System.out.println("data not found");
        } else {
            System.out.println("index:" + ret + "position:" + (ret + 1));
        }
    }

}
