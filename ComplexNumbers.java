package org.example;

public class ComplexNumber {

    int real, image;
    public ComplexNumber(int r, int i){
        this.real= r;
        this.image=i;
    }

    public void printComplex(){
        System.out.println("Complex Number "+this.real +"+"+this.image+"i");
    }

    public static ComplexNumber addComplex(ComplexNumber n1, ComplexNumber n2){
       ComplexNumber complexNumber = new ComplexNumber(0,0);
        complexNumber.real = n1.real+n2.real;
        complexNumber.image = n1.image + n2.image;
        return  complexNumber;
//        System.out.println("Complex Number "+addR +"+"+addI+"i");
    }

}
