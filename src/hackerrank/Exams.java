/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.*;

/**
 *
 * @author User
 */
public class Exams {

    public void miniMaxSum() {
        long maxInt=(long) Math.pow(10, 9);
        long arr[] = {2, 5, 1, 3, 4};
        long totSum = 0;
       int arrayLength=arr.length;
        for (int i = 0; i < arrayLength; i++) {
            if(arr[i]>=1 && arr[i]<=maxInt){
                    for (int j = i + 1; j < arrayLength; j++) {
                if (arr[i] > arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            totSum += arr[i];
            }else{
        //
            }
        }
        long max = totSum - arr[0];
        long min = totSum - arr[arrayLength-1];
        System.out.println(min+" "+max);
    }
        public int birthdayCakeCandles(){
                long nMax=(long) Math.pow(10, 5);
                 long arMax=(long) Math.pow(10, 7);
            int numberOfCandles=0;
            int ar[] = {9547948, 8558390, 9999933, 5148263 ,5764559 ,
                906438 ,9296778 ,1156268, 6642930, 362317 ,5884372, 8183642 ,
                1893625, 2078221, 9091567 ,9008204, 5596899 ,2415143 ,3745745, 9999933 ,
                4601052, 2226334, 9999933 };
               int maxVal = Arrays.stream(ar).max().getAsInt();
            int arrLenth=ar.length;
            long temp;
            if(arrLenth>=1&& arrLenth<=nMax){
                for(int i=0;i<arrLenth;i++){
                    if(ar[i]>=1 && ar[i]<=arMax){                   
                            if(ar[i]>=1 && ar[i]<=arMax){
                               if(ar[i]==maxVal){
                   numberOfCandles +=1; 
                } 
                    }else{
                        //
                    }
            } 
                   }
        
            }else{
                //
            }
            return numberOfCandles;
    }
}
