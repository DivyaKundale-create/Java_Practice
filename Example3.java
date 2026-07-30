package org.example;

import javax.swing.plaf.IconUIResource;

public class Example3 {

    public void lcmOfTwoNumbers(int a,int b)
    {
        int hcf= gcdOrHcf(a,b);
        System.out.println("HCF of two number "+hcf);
        int lcm = (a*b)/hcf;
        System.out.println("LCM of two numbers are "+lcm);
    }

    public static int gcdOrHcf(int a, int b)
    {
        if(b==0)
            return a;
        return gcdOrHcf(b,a%b);
    }

    public void convertDataType()
    {
        //String to long
        String s = "999999999999";
        long l= Long.parseLong(s);
        long l1=Long.valueOf(s);
        long l2= new Long(s);
        System.out.println("String: "+ s +" Long: "+ l);

        //Long to String
        long l11= 9999999999991L;
        String str1= String.valueOf(l11);
        System.out.println(str1);


        //boolean to String
        boolean value = true;
        String b= Boolean.toString(value);
        System.out.println(b);

        //string to double
        String str = "2033.12244";
        double d= Double.parseDouble(str);
        System.out.println(d);

        //double to string
        double dou = 2033.12454;
        String s2= Double.toString(dou);
        System.out.println(s2);

        //integer to character
        int a= 97;
        char ch= (char) a; //explicitly typecast
        System.out.println(ch);

        //character to integer
        char ch1= 'c';
        int b1= Integer.valueOf(ch1);
        System.out.println(b1);


    }

    public void armstrongNumbers(int low, int high)
    {
        //https://www.geeksforgeeks.org/java/java-program-to-check-armstrong-number-between-two-integers/
        System.out.println("Armstrong numbers are ");
        for(int i=low;i<=high;i++)
        {
            //calculate length of number
            int len= i;
            int count=0;
            while(len!=0)
            {
                len = len/10;
                count++;
            }

            // Calculating the sum of nth
            // power of all the digits
            int sumOfPower=0;
            len=i;
            while (len!=0) {
                int d= len % 10;
                sumOfPower += Math.pow(d, count);
                len= len/10;
            }

            // Checking if the current number
            // i is equal to the sum of nth
            // power of all the digits
            if(sumOfPower==i)
            {
                System.out.println(i);
            }


        }

    }
    public void compoundInterest(double principal, double rate, double time)
    {
//        Compound Interest = Principal(1 + Rate/100)^time
//        double CT = principal*((1+rate/100)^time); ///cannot apply ^ to double/
        double CI = principal * Math.pow((1+rate/100),time);
        System.out.println("Compound Interest = "+CI);
    }


    public void isPrime(int num)
    {
        if(num==0 || num==1)
        {
            System.out.println("Not Prime number");
        }
        boolean flag=true;
        for(int i=0;i*i<=num;i++)// this is equal to i= square root of n
        {
           if(num%i==0)
           {
               flag=false;
           }
        }
        if(flag){
            System.out.println(num +" is prime number");
        }
        else{
            System.out.println(num +" is not prime number");
        }
    }
}
