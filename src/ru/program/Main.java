package ru.program;

import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void iCanThrow() throws Exception{
        System.out.println("I THREW");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
           int a = sc.nextInt();
           System.out.println(a);
        }catch (Exception e){
            System.out.println("WHY DID YOU DO THIS");
            sc.nextLine();
        }finally {
            System.out.println("FINAL");
        }

        try {
            System.out.print("Введите число: ");
            int a = sc.nextInt();
            System.out.println(10/a);
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Error: You are an IDIOT");
            sc.nextLine();
        }catch (Exception e){
            System.out.println("I dont know");
        }finally{
            System.out.println("DONE");
        }


        //iCanThrow();

        try {
            iCanThrow();
        }catch (Exception | IOError b){}


        try{
            int temp = sc.nextInt();
            if (temp == 67){
                throw new Exception("User is retard");
            }
        }catch (InputMismatchException e) {
            sc.nextLine();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
