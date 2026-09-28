package javastrings;

public class JavaStrings {

    public static void  main(String[] args){
        String str1 = "My name is :";
        String str2 = "Mr.panumas saksoponkul";
        String str3 = str1 + str2;

        System.out.println(str3);
        System.out.println("My name is :"+"Mr.Panumas saksoponkul");
        System.out.println("My name is :Mr.Panumas saksoponkul");
        System.out.println("My name is " + 78);
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str3.charAt(8));
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println(str1.contains(str2));
        System.out.println(str2.indexOf("p"));
        
    }
}