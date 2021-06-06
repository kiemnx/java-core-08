package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        char a = 'a';
        // Hello A
        char[] hello = {'H','e','l','l','o'};

//        int a = 1;
        Integer b = 1;

//        hello = {'H','e','l','l','o', 'i'};
        //Nguyen Mong Thanh Nhi

//        String helloStr = new String(hello);
//        System.out.println(helloStr);

        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
        String name = "Nguyen Mong Thanh Nhi";
       /* System.out.println(name);
        System.out.println("So ky tu: " + name.length());
*/

        String a = "                                Nguyen Mong Thanh Nhi";
        System.out.println(a);
        /*String b = "Java";
        a = a +b;
        System.out.println(a);*/

        /*boolean result = a.equalsIgnoreCase("hello");
        System.out.println(result);*/

        /*String[] items = a.split("Mong");
        for(String item : items){
            System.out.println(item);
        }*/

        a = a.trim();
        System.out.println(a);
    }
}
