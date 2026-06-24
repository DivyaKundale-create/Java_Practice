package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

   public void swap(int a,int b) {
       int temp;
       System.out.println("a:"+a+"  b:"+b);
       temp = a;
       a = b;
       b = temp;
       System.out.println("a:"+a+"  b:"+b);
   }

   public void decimalToBinary (){
//       Store the remainder when the number is divided by 2 in an array.
//       Divide the number by 2
//       Repeat the above two steps until the number is greater than zero.
//       Print the array in reverse order now.
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
      int num =sc.nextInt();
      int i=0;
       int[] arr = new int[10];

       while(num>0) {
           arr[i] = num % 2;   ///reminder
           num = num / 2;      ///quotient
           System.out.print(arr[i]);
       }
   }
   public void decimalToBinaryBitwise(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int num =sc.nextInt();

       // Binary:  0000 0000 0000 0000 0000 0000 0000 0101  ==> 5
       //a << 2; // Shifting by 2 left shift
       //Result: 0000 0000 0000 0000 0000 0000 0001 0100 ==>which is 20

       for (int i=31;i>=0; i--){
           int k= num>>i; //right shift
           if(( k & 1 ) >0){  //and
               System.out.print("1");
           }
           else {
               System.out.print("0");
           }

       }
   }

   int f=1;
   public int factorial(int num){
       if (num==0) { return 1; }
       return num * factorial(num-1);
   }

   public void factorial1(int n){
       int k =1;
       for(int i=1;i<=n;i++)
       {
          k=k*i;
       }
       System.out.println(k);
   }


   public void fibonacci(int num){
       int i=0,j=1,f=0;
       for (int k=0;k<=num;k++){
           System.out.print(f + " ");
           f=i+j;
           i=j;
           j=f;
       }
   }

   public void sumOfArray(){
       int[] arr= {2, 4, 6, 7, 9};
       int sum=0;
       for (int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
       System.out.println(sum);
   }

   public void largestElement(int[] arr){

       int largeN=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largeN)
            {
                largeN=arr[i];
            }
        }
       System.out.println("Largest Number "+ largeN);

   }

   public void largestElementInGivenWindow(int arr[],int k){


        int newArr[] = new int[arr.length-k];
        int m=arr.length-(k);
//       System.out.println(m);
       for(int i=0;i<=m;i++){
           int count=0,j=i;
           int largestEle = arr[i];
           while(count<k) {
               if (arr[j] > largestEle) {
                   largestEle = arr[j];
               }
               count++;
               j++;
           }
           System.out.println(largestEle);

       }
   }

   public void transponseOfMatrix(){

       int input[][]={{1,2,3},
                      {4,5,6}}; //2-3
       int output[][] = new int[3][2];
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<2;j++)
           {
               output[i][j]= input[j][i];
           }
       }

       for(int i=0;i<3;i++)
       {
           for(int j=0;j<2;j++)
           {
               System.out.print(output[i][j]+" ");
           }
           System.out.println();
       }


   }
}
