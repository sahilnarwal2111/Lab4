
import java.util.Scanner;

import org.testng.annotations.Test;

public class MainTest {
    @Test
    public static void FirstTest(){
        System.out.println("Enter email: \n");
        Scanner sc = new Scanner(System.in);
        //Ensure that @ is present in email for logging in
        String str = sc.nextLine();
        if(str.contains("@")){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }
    }
    @Test
    public static void SecondTest(){
        //Ensure that password is atleast 8 characters long
        System.out.println("Enter password: \n");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() >= 8){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is invalid");
        }
    }
    @Test
    public static void ThirdTest(){
        System.out.println("ThirdTest");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        FirstTest();
        SecondTest();
        // ThirdTest();
    }

}
