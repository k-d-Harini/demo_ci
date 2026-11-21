package com.example;
import java.lang.String;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int c=0;
        for (int i=0;i<l;i++){
            if (s[i].charAt() == " ") {
                c = c + 1;
            } else if (s[i].charAt() == "\n") {
                c = c + 1;
            }

            }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Number of words:"+c);


    }
}