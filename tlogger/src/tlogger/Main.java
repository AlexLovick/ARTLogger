package tlogger;

import java.util.Scanner; // Import the scanner to read user input

//Main java class
public class Main{


public static void main(String[]args){

//Bloody Classic Hello World am i right or what 
System.out.println("Sarah Just bought a great blender! that's right she's a sex offender!\n");

//Calls the input class
//Input();
DisplayUserList();

}


public static void Input(){


    //Create simple username and password variables (Hardcoded atm)
    String uName;
    String pass;
    
    //Create a scanner input object to read user input from key board
    Scanner uI = new Scanner(System.in);

    //Username
    System.out.println("Please Enter your UserName: ");
    uName = uI.nextLine();
    
    //Password
    System.out.println("Please Enter your Password: ");
    pass = uI.nextLine();


}


//Function for returning the user list with a for loop based on the lenght of the userlist array
public static void DisplayUserList(){


    //Calls the user list into a new array 
String uL[] = ListOfUsers();


//Loops though the array to display the user list
for (int i = 0; i <  uL.length; i++){

    //Prints User X: Name e.g. (User 1: Alex)
    System.out.println("User " + i +": " + uL[i] + " ");
}


}


//Random userlist to display
public static String[] ListOfUsers(){

    //Define the list of users
    String ListOfUsers[] = {"Alex", "Rohan", "Admin"};
    

    //returns the user list
    return ListOfUsers;
}

public static void TestLogFunc(){

    //Define vars for test fields
    Integer testId; 
    String testName,expectedResult,actualResult;


    //UI object
    Scanner uI = new Scanner(System.in);

    //Inputs and outputs for entering the test
    System.out.println("Log number: ");
    testId = Integer.valueOf(uI.nextLine());

    System.out.println("Test Name: ");
    testName = uI.nextLine();

    System.out.println("Expected Result: ");
    expectedResult = uI.nextLine();

    System.out.println("Actual Result: ");

    actualResult = uI.nextLine();

    //Prints a concatanation of the inputted values
    System.out.println(testId + " " + testName + " " + expectedResult + " " + actualResult);

}


}

