package Functions;

import java.util.Scanner;

public class maxi_mini {
    public static void main(String[] args) {
        max(5 ,25 ,3);
        min(0,25,-10);


    }

    static void max(int a, int b, int c) {
        if(a>b && a>c){
            System.out.println(a +" is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b +" is the largest number");
        }
        else if(c>a && c>b){
            System.out.println(c +" is the largest number");
        }
   }
    static void min(int a, int b, int c) {
        if(a<b && a<c) {
            System.out.println(a + " is the smallest number");
        } else if(b<a && b<c){
            System.out.println(b +" is the smallest number");
        }
        else if(c<a && c<b){
            System.out.println(c +" is the smallest number");
        }
    }

}