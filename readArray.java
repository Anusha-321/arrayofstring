package forLoopDemo;

import java.util.Scanner;

public class readArray {
    public static void main(String[] args) {
            int n, s;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter size of array:");
            n = obj.nextInt();
            int[] arr = new int[n];
            ReadArrays(arr);
            s = SumArrays(arr);
            System.out.println("Sum of array: " + s);
        }


        private static int SumArrays(int[] a) {
            int i, sum = 0, total = 0;
            for (i = 0; i < a.length; i++) {
                sum = sum + a[i];
            }
            System.out.println("SUM= " + sum);
            //advanced loop
            for (int b : a) {
                total+=b;
            }
            return total;
        }
        private static void ReadArrays(int[] a) {
            int i;
            Scanner obj = new Scanner(System.in);
            for (i = 0; i < a.length; i++) {
                System.out.println("Enter " + i + " element of Array:");
                a[i] = obj.nextInt();
            }
        }
    }
