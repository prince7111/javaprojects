package javaprojects;

import com.sun.source.doctree.SystemPropertyTree;
import java.util.Scanner;

public class JavaProjects {
    public static void Calc(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number here:");
        int a =sc.nextInt();
        System.out.println("Enter your number again:");
        int b =sc.nextInt();
        System.out.println("Enter:\n'+' for addi.\n'-'for subs."/*\n'*'for mul.\n'/'for div.\n"*/);
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+' :System.out.println(a+"+"+b+"="+(a+b));
            break;
            case '-' :System.out.print(a+"-"+b+"="+(a-b));
            break;
            case '*' :System.out.println("a*b="+(a*b));
            break;
            case '/' :System.out.print("a/b="+(a/b));
            break;
            default:System.out.print("not valid opertion (simle calC)");
        }
    }   
    public static void patterP(int n){
        //print letter P
         for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(j==0 || (i<=(n/2)&& j==n/2)){
                    System.out.print(" * ");
                }else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
   
   public static String revrseStr(String str ,int idx){
        String reversString ="";
        
        while(idx>=0){
            char curChar = str.charAt(idx);
            reversString+=curChar;
            idx--;
        }
        return reversString;
    }
      
     public static void numTOWord(String digit[],int number){
        if(number ==0){
            return;
        }
        int lastDig = number % 10;
        numTOWord(digit, number/10);
        System.err.print(digit[lastDig] + " ");
        
    }
    public static boolean isNaturalNumber(int n) {
        return (n>=0);       
    }
   
    
    public static void main(String args[]){
        System.err.println();   
    }
    
}


