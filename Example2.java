package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Example2 {

    public void arrayRotation(int[] arr, int num){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int first= arr[0];
            for(int j=0;j<len-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[len - 1] = first;
        }
    }

    public  void printTrangle(int num)
    {
        for (int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public void pascalTriangle(int num){

        for (int i = 0; i < num; i++) {
            int res = 1;

            // Print spaces for triangle shape
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(res + " ");

                // Calculate next value
                res = res * (i - k);
                res = res / (k + 1);


            }

            System.out.println();
        }
    }



    public void RemoveDuplicate(int[] arr){

        HashSet<Integer> set= new HashSet<>();
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }

    public void RemoveKeyfromArray()
    {
        //using java 8 streams
        Integer[] a= {3, 9, 2, 3, 1, 7, 2, 3, 5 };

        int k=3;

        Integer[] ans = Arrays.stream(a).filter(e->e!=k).toArray(Integer[]::new);

        System.out.println(Arrays.toString(ans));


    }

    public void palindromeCheck(String s)
    {
        s=s.toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev= rev + s.charAt(i);
        }
        System.out.println("Palindrome: " + s.equals(rev));
    }

    public Boolean twoStringsAnagram(char[] s1, char[] s2){
        int l1=s1.length;
        int l2=s2.length;

        if(l1!=l2)
        {
            return false;
        }

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<l1;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }

        return true;
    }

    public void reverseString(String s){
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }
        System.out.println("Reversed String:"+rev);
    }

    public void removeLeadingZeros(String str)
    {
        //string is immutable

        int count=0, len=str.length();
        //count zeros
        while(count<len && str.charAt(count)=='0')
        {
            count++;
        }
        String str1=str.substring(count,len);
        System.out.println(str1);

    }


}
