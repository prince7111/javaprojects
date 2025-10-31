package javaprojects;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.HashMap;
import java.util.Map;
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
    public static void countConsnVovels(String name,int idx) {
        int vovel = 0;
        int conse = 0;
    while (idx<name.length()) {       
        char ch = name.charAt(idx);
        if((ch =='a')||(ch=='e')||(ch=='i')||(ch =='o')||(ch=='u')){
        vovel++;
        }else{
            conse++;
        }
        idx++;
    }
    System.out.println(name +" = "+"V"+"("+vovel+")"+"&"+"C"+"("+conse+")");
}
         
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = values.get(s.charAt(i));
            
            // अगले कैरेक्टर के लिए चेक करें
            if (i < n - 1) {
                int next = values.get(s.charAt(i + 1));
                
                // घटाव का नियम: यदि वर्तमान मान अगले से कम है (जैसे IV, IX)
                if (current < next) {
                    result += (next - current);
                    i++; // अगले कैरेक्टर को छोड़ दें
                } else {
                    // सामान्य जोड़ का नियम (जैसे VI, LVIII)
                    result += current;
                }
            } else {
                // अंतिम कैरेक्टर को हमेशा जोड़ें
                result += current;
            }
        }
        return result;
    }
    public static void main(String args[]){
        System.err.println();   
    }
    
}


