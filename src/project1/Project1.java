/*
Kaitlin Stark
Project 1
Link to hackerrank: https://www.hackerrank.com/challenges/java-end-of-file
 */
package project1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Project1 {

    public static void main(String[] args) {
    int counter =1;
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext() == true){
            String string = scan.nextLine();
            System.out.println(counter + " " + string);
            counter++;
        } 
    }
}

