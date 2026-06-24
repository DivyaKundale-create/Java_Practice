package org.example;

public class Searches {

    public static int linearSearch(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }

    public int binarySearch(int arr[],int x){
        int start =0, end=arr.length-1;

        while(start<=end) {  // 0>4  3>4
            int mid=(start+end)/2; //2  3+4/2 = 7/2= 3

            if (arr[mid] == x) {  //a[2]= 6  6!=7 arr[3] ==
                return mid;
            }
            if (arr[mid] < x) ///  check right {  6<7
            { start = mid + 1;   //2+1 =3
            }else {  //6>7
                end = mid - 1;   //2-1=1
            }
        }
        return -1;
    }


}
