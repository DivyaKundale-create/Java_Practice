package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Example1 example1= new Example1();
//        int a=12,b=34;
//        example1.swap(a,b);
//        example1.decimalToBinary();
//        example1.decimalToBinaryBitwise();
//        System.out.println(example1.factorial(5));
//        example1.factorial1(5);
//        ComplexNumber complexNumber1= new ComplexNumber(12,23);
//        ComplexNumber complexNumber2= new ComplexNumber(1,2);
//
//        ComplexNumber add = ComplexNumber.addComplex(complexNumber1,complexNumber2);
//        System.out.println("Addition");
//        add.printComplex();
//        example1.fibonacci(5);
//        example1.sumOfArray();
        int[] arr= {7, 102, 0, 1, 70, 6, 7, 8, 9};
//        example1.largestElement(arr);
//        example1.largestElementInGivenWindow(arr,3);
//        example1.transponseOfMatrix();

        Example2 example2 = new Example2();
//        example2.printTrangle(4);
//        example2.pascalTriangle(4);

//        int[] arr={1,2,3,3,4,3,7};
//        example2.RemoveDuplicate(arr);

//        example2.palindromeCheck("sisi");
//        char[] a1={'i','j','k'};
//        char[] a2={'k','j','i'};
//        System.out.println("Anagram check: "+example2.twoStringsAnagram(a1,a2));

//        example2.reverseString("Geeks");
//        example2.removeLeadingZeros("00000123");

        int a[]={1,2,8,7,6,1,2};
//        int position= Searches.linearSearch(a,6); //static method
//        System.out.println("Element found at: "+position);
        Searches searches = new Searches();
        int sortedDeduplicatedArray[]= Arrays.stream(a).distinct().sorted().toArray();
        System.out.println(Arrays.toString(sortedDeduplicatedArray));
        System.out.println( searches.binarySearch(sortedDeduplicatedArray,2));



    }
}
