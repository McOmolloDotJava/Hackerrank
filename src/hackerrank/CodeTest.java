/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CodeTest {

    Scanner scanData = new Scanner(System.in);

    public void copareArray() {
        int alicePoints = 0;
        int bobsPoints = 0;
        int result[] = new int[2];
        int a[] = {1, 2, 3};
        int b[] = {3, 2, 1};

        for (int i = 0; i < a.length; i++) {
            if (1 <= a[i] && a[i] <= 100 && 1 <= b[i] && b[i] <= 100) {
                if (a[i] > b[i]) {
                    System.out.println(" Alice is awarded 1 point.");
                    alicePoints += 1;
                } else if (a[i] < b[i]) {
                    System.out.println("Bob is awarded 1 point");
                    bobsPoints += 1;
                } else {
                    System.out.println(" neither person receives a point.");
                }

            } else {
                System.out.println("number not within range=" + a[i]);
            }
        }
        List<Integer> list = Arrays.asList(alicePoints, bobsPoints);
        System.out.println("list=" + list.size());
    }

    public void aVeryBigSum() {
        long maxInt = Long.parseLong("10000000000");
        long arSum = 0;
        System.out.println("How many elements do you want to use ?");
        int n = scanData.nextInt();
        if (n >= 1 && n <= 10) {
            long ar[] = new long[n];
            for (int k = 0; k < ar.length; k++) {
                long element = scanData.nextLong();
                if (element >= 0 && element <= maxInt) {
                    ar[k] = element;
                    arSum += element;
                } else {
                    System.out.println("element out of range");
                }
            }
            System.out.println("sum =" + arSum);
        } else {
            System.out.println("n is out of range ");
        }
    }

    public void diagonalDifffrence() {
        List<List<Integer>> arr = null;
        int l = arr.size();
        int one = arr.get(l).get(l);
        int diagonalA = 0;
        int diagonalB = 0;
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int mLength = matrix.length;
        for (int i = 0; i < mLength; i++) {
            diagonalA += matrix[i][i];
            diagonalB += matrix[i][mLength - 1 - i];
        }
        System.out.println(" " + Math.abs(diagonalA - diagonalB));
    }

    public void plusMinus() {
        int arr[] = {-4, 1003, -9, 12200, 40000, 1999};
        double arrLength = arr.length;
        double negTot = 0;
        double posTot = 0;
        double zeroTot = 0;
        if (arrLength < 100 && arrLength > 0) {
            for (int i = 0; i < arrLength; i++) {
                if (arr[i] > -100 && arr[i] < 100) {
                    if (arr[i] < 0) {
                        negTot += 1;
                    } else if (arr[i] > 0) {
                        posTot += 1;
                    } else if (arr[i] == 0) {
                        zeroTot += 1;
                    } else {
                        System.out.println(" invalid value =" + arr[i]);
                    }
                } else {
                    System.out.println(" invalid value =" + arr[i]);
                }

            }
        } else {
            System.out.println(" invalid value =" + arrLength);
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        String r1 = df.format(posTot / arrLength);
        String r2 = df.format(negTot / arrLength);
        String r3 = df.format(zeroTot / arrLength);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    public void stairCase() {
        Scanner sacn = new Scanner(System.in);
        System.out.println("Enter the height of the staieCase");
        int n = sacn.nextInt();
        if (n > 0 && n <= 100) {
            String starCase[] = new String[n];
            String stareModule = "";
            for (int i = 0; i < starCase.length; i++) {
                stareModule += "#";
                starCase[i] = stareModule;
            }
            for (int i = 0; i < starCase.length; i++) {
                System.out.println(starCase[i]);
            }
        } else {
            System.out.println("invalide height");
        }

    }

    public void stairCase2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - 1 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("");
            }

        } else {

        }

    }

    public void stairCase3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0 && n <= 100) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if ((i + j) > n) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {

        }

    }

}
