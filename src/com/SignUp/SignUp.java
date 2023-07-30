package com.SignUp;
import java.util.Scanner;
import java.math.BigInteger;

public class SignUp {
    public static void main(String[] args){


        /*Sign up form*/

             /*User Name*/
        Scanner nameIn =new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = nameIn.nextLine();

             /*User email*/
        Scanner emailIN = new Scanner(System.in);
        System.out.println("Your email: ");
        String email = emailIN.nextLine();

            /*User Password*/
        Scanner passwordIn = new Scanner(System.in);
        System.out.println("Your password");
        String password = passwordIn.nextLine();


        /*END Sing up form*/


        System.out.print("Sign up finished!! now log in. ");




        /*Log in form*/

            /*Asking for user email*/
        Scanner emailInS = new Scanner(System.in);
        System.out.println("Your email: ");
        String emailS = emailInS.nextLine();


            /*Asking for password*/
        Scanner passwordIns = new Scanner(System.in);
        System.out.println("Your password: ");
        String passwordS = passwordIns.nextLine();


            /*Log in System*/

        if ( email.equals(emailS) && password.equals(passwordS)){
            System.out.println("You are welcome " + name + "!!");
        }else if (!(email.equals(emailS)) || !(password.equals(passwordS))) {
            System.out.println("password or email is wrong :(");
        }

        /*END Log in form*/



    }
}
