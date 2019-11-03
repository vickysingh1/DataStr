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
public class LinearSearch {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter the data you want to Search:");
        int data = kb.nextInt();
        int found = 0;
        for (int i = 0; i < n; i++) {
            if (data == arr[i]) {
                System.out.println("index:" + i + "position:" + (i + 1));
                found++;
                break;
            }
        }
        if (found < 1) {
            System.out.println("data not found");
        }
    }

}
