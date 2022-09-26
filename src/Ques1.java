import java.sql.SQLOutput;

public class Ques1 {
    /*
    Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline
     */
    static String FirstName;
    static String LastName;
    static int age = 22;
    static void detail(String Fname,String Lname,int age) {
        System.out.println("FirstName = " + Fname);
        System.out.println("LastName = " + Lname);
        System.out.println("Age = " + age);
    }
    static {
        System.out.println("Running static initialization block.");
        System.out.println("Vikash");
        System.out.println("Rai");
        System.out.println(age);

    }

    public static void main(String[] args) {
        detail("Vikash","Rai",21);

    }
}