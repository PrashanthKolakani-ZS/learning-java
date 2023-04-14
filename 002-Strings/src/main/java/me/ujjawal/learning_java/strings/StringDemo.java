package me.ujjawal.learning_java.strings;

public class StringDemo {

    public static void main(String[] args){
        String str1 = "Hello World ";
        String str2 = "Hello World";
        String str3 = "hello world";
        String str4 = new String("Hello World");

        System.out.println(str1==str2);
        System.out.println(str1==str4);
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

        String[] strArray = str1.split(" ");
        for(int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }

        System.out.println(str1.substring(6));
        System.out.println(str1.substring(0, 5));

        str1 = str1 + str2;
        System.out.println(str1);

        // StringBuilder -> Not thread safe
        // StringBuffer  -> Thread safe

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Prashnath");
        stringBuilder.append(str1);
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        System.out.println(result);
    }

}
