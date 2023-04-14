package me.ujjawal.learning_java.core;

public class InitialProgram {

    // access modifiers

    //packages

    // public -> class, same package, other packages
    // private -> class
    // default -> class, same package
    // protected -> class, same package, child class within another package

    // keywords

    // Data types
    // boolean -> 1 bit -> true/false
    // byte -> 8bits/1 byte -> -127->128 -> 2^8 -> 256
    // short -> 2 bytes
    // int -> 4 bytes
    // long -> 8 bytes
    // float -> 4 bytes
    // double -> 8 bytes
    // char -> 2 bytes
    // arrays
    // String


    // variables

    public static int number = 5;

    public static void main(String[] args){
        System.out.println("Hello World");
        int value = 6;
        int randomNumber = 8;
        System.out.println(value);
        printRandomValues(value);
        System.out.println(number);

        int a = 2;
        int b = 4;

        int c = a/b;
        System.out.println(c);

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a%b);

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);

        int d = a<b ? a:b;
        //if else
        //if elseif else
        //switch

        int e;
        if(a<b){
            e = a;
        }else if(a>b) {
            e=b;
        }else{
            e = a+b;
        }

        switch(a){
            case 1:
                System.out.println(a+1);
                break;
            case 2:
                System.out.println(a+2);
                break;
            default:
                System.out.println(a);
        }

        //Do while
        //While do
        //for



    }

    public static void printRandomValues(int value){
        System.out.println(value);
        System.out.println(number);
        System.out.println(randomNumber);
    }
}
