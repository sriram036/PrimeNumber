package com.bridgelabz;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isPrime = false;
        System.out.println("Enter a Number: ");
        int num = s.nextInt();
        if(num <= 1 ){
            System.out.println("The Number Should be more than a 1.");
        }
        else if (num == 2){
            System.out.println("The given Number is the only Even Prime Number.");
        }
        else {
            for(int i=3;i<=num/2;i++){
                if(num%i == 0){
                    isPrime = true;
                }
            }
        }
        if(isPrime != true){
            System.out.println("The Number "+ num +" is a Prime Number.");
        }
        else{
            System.out.println("The Number "+ num +" is not a Prime Number.");
        }
    }
}
