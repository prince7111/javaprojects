package javaprojects;

import com.sun.source.doctree.SystemPropertyTree;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
    // Define the character sets for different types of characters
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_+=<>?";
    
    // Combine all character sets for general random characters
    private static final String ALL_CHARS = LOWER_CASE + UPPER_CASE + DIGITS + SPECIAL_CHARS;

    private static SecureRandom random = new SecureRandom();

    /**
     * Generates a strong, random password of a specified length.
     * It guarantees at least one character from each required type.
     *
     * @param length The desired length of the password.
     * @return A randomly generated password string.
     */
    public static String generatePassword(int length) {
        if (length < 4) {
            throw new IllegalArgumentException("Password length must be at least 4 to guarantee all character types.");
        }

        StringBuilder password = new StringBuilder(length);
        
        // 1. Ensure at least one character from each required set
        // This makes the password meet most security policies
        password.append(getRandomChar(UPPER_CASE));
        password.append(getRandomChar(LOWER_CASE));
        password.append(getRandomChar(DIGITS));
        password.append(getRandomChar(SPECIAL_CHARS));

        // 2. Fill the remaining length with random characters from ALL sets
        for (int i = 4; i < length; i++) {
            password.append(getRandomChar(ALL_CHARS));
        }

        // 3. Shuffle the characters to ensure the required characters 
        // are not always in the same starting positions (e.g., A1b#...)
        return shuffleString(password.toString());
    }

    // Helper method to get a random character from a given set
    private static char getRandomChar(String charSet) {
        int randomIndex = random.nextInt(charSet.length());
        return charSet.charAt(randomIndex);
    }
    
    // Helper method to shuffle the final password string
    private static String shuffleString(String s) {
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars, random); // Use SecureRandom for shuffling

        StringBuilder shuffledPassword = new StringBuilder(s.length());
        for (char c : chars) {
            shuffledPassword.append(c);
        }
        return shuffledPassword.toString();
    }
    public class Student implements Serializable {
    private String studentId;
    private String name;
    private int daysPresent;
    private int totalClasses;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.daysPresent = 0;
        this.totalClasses = 0;
    }

    // Getters and Setters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getDaysPresent() { return daysPresent; }
    public int getTotalClasses() { return totalClasses; }

    // Methods to update attendance
    public void markPresent() {
        this.daysPresent++;
        this.totalClasses++;
    }
    
    public void markAbsent() {
        this.totalClasses++;
    }

    public double getAttendancePercentage() {
        if (totalClasses == 0) {
            return 0.0;
        }
        return (double) daysPresent / totalClasses * 100;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Present: %d/%d (%.2f%%)", 
                             studentId, name, daysPresent, totalClasses, getAttendancePercentage());
    }
}

    public static void main(String args[]){
        System.err.println("projects pendng");  
        
        // 1. Define the character
        char characterA = 'A';
        char character5 = '5';
        char character_sym = '$';
        
        // 2. Perform the type cast to int
        // Java automatically uses the character's Unicode (ASCII) value
        int asciiValueA = (int) characterA;
        int asciiValue5 = (int) character5;
        int asciiValueSym = (int) character_sym;

        // 3. Print the results
        System.out.println("The character is: " + characterA + ", and its ASCII value is: " + asciiValueA);
        System.out.println("The character is: " + character5 + ", and its ASCII value is: " + asciiValue5);
        System.out.println("The character is: " + character_sym + ", and its ASCII value is: " + asciiValueSym);

        // Example of direct conversion in an expression
        int sum = 'a' + 1; // 'a' is 97
        System.out.println("\n'a' + 1 = " + sum); // Output will be 98


       


    }
} 


    



