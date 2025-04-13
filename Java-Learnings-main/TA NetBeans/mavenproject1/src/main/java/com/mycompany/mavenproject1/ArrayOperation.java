package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class ArrayOperation {
    public static int[] removeDuplicates(int arr[]) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int res[] = new int[set.size()], i = 0;
        for (int num : set) { res[i++] = num; }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Input Size of Array: ");
            int n = s.nextInt();
            System.out.println("Input " + n + " Numbers in Array:");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int res[] = removeDuplicates(arr);
            System.out.println("Final Array without Duplicates:");
            for (int num : res) { System.out.print(num + " "); }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("Invalid input.");
        }
        finally { s.close(); }
    }
}
