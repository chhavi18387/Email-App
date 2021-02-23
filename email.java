package com.EMAILAPP;
import java.util.Locale;
import java.util.Scanner;

public class email {
    private String f_name,l_name,department;
    String email_add;
    private String alternate_emailAdd;
    private String password;
    private int mail_box_capacity;
    int default_len=10;
    //constructor
    public email(String firstname,String lastname){
        f_name=firstname;
        l_name=lastname;
        //call a method to ask for department name
        department=setDepartment()+".";
        email_add=f_name.toLowerCase()+"."+l_name.toLowerCase()+"@"+department+"company.com";
        System.out.println("new email address: "+email_add);
        password= GenPassword(default_len);
        System.out.println("your pasword is: "+password);
        alternate_emailAdd="";
        //set mailbox capacity
        mail_box_capacity=500;
    }

    //ask for department
    String setDepartment(){
        System.out.println("Enter department code\n1 for sales\n2 for development\n3 for accounting\n0 for none");
        Scanner in =new Scanner(System.in);
        int dep=in.nextInt();
        if (dep==1){return "sales";}
        else if (dep==2){return "dev";}
        else if (dep==3){return "acct";}
        else{return "";}
    }

    //generate password
    private String GenPassword(int length){
        String s="ABCDEFGHIJKLMNOPQRSTabcdefghijklmnopqrst1234567890!@#$%&";
        char[] passwordArr = new char[length];
        for (int i=0;i<length;i++){
            int a = (int) Math.ceil(Math.random()*s.length());
            passwordArr[i]= s.charAt(a);
        }
        return new String(passwordArr);
    }

    //set mailbox capacity
    void setMailboxCapacity(){
        System.out.println("Enter mailbox capacity:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        mail_box_capacity=n;
    }

    //get mailbox capacity
    int getMailboxCapacity(){
        System.out.println(mail_box_capacity);
        return mail_box_capacity;
    }

    //set alternate email address
     void setAlternateEmail_Add(){
        System.out.println("Enter alternate email address:");
        Scanner in = new Scanner(System.in);
        String altEmail = in.next();
        alternate_emailAdd=altEmail;
    }

    //get alternate email address
    String getAlternate_emailAdd(){
        System.out.println(alternate_emailAdd);
        return alternate_emailAdd;
    }

    //change password
    public void change_password (String new_password){
        password=new_password;
    }
}
