package com.bridgelabz.Orderedlist;
import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to search :");
        Integer input = scan.nextInt();
        OrderedList<Integer> func = new OrderedList<Integer>(input);
        func.ascOrder();
        func.show();
        System.out.println(func.search());
        func.show();
    }

}
