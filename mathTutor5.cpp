#include <stdio.h>
#include<iostream>
#include<cstdlib> //for rand and srand functions
#include <ctime> //time function
#include <iomanip>
#include <vector>
using namespace std;

//-----------------------------------------------
//Each random number returned from function
static int getNumber(int num1, int num2)
{
    int min_Value = 10,
        max_Value = 99;
    //Gets system time
    //unsigned seed = time(0); seed random number generator had this in my code was not sure if i needed it or not
    //srand(seed); had this in my code was not sure if i needed it or not
    num1 = (rand() % (max_Value - min_Value + 1)) + min_Value;
    num2 = (rand() % (max_Value - min_Value + 1)) + min_Value;
    return num1, num2;
}
//------------------------------------------------
//function to implement the menu.
static int getUserNumber()
{
    int userAnswer;
    cout << "Enter a Number:\n";
    cin >> userAnswer;
    return userAnswer;
}
//-------------------------------------------------
static int menu()
{
    //Explains program to user
    int userInput;
    cout << endl;
    cout << "----------------------------------------------------- \n\n";
    cout << "This program displays two random numbers to be calculated \n";
    cout << "Select 1 for Addition \n" << endl;
    cout << "Select 2 for Subtraction \n" << endl;
    cout << "Select 3 for Remainder \n" << endl;
    cout << "Select 4 for Multiplication \n" << endl;
    cout << "Select 5 for Division \n" << endl;
    cout << "Select 6 to exit \n" << endl;
    cout << "----------------------------------------------------- \n\n";
    cin >> userInput;   //take user input
    return userInput;   //return option
}
//---------------------------------------------
//function to implement the addition operation
static void add(int num1, int num2)//num1, num1 passed into function
{
    int randNumAnswer;
    int userAnswer;
    randNumAnswer = num1 + num2;   //add two numbers
    cout << num1 << endl;
    cout << num2 << " +\n";
    cout << "-------\n";
    cout << "input answer, then press enter: ";
    cin >> userAnswer;//Recieves enter key pressed
    cout << endl;
    //Decision statement and display
    if (userAnswer == randNumAnswer) {
        cout << "\nCongratulations";
    }
    else {
        //display answer
        cout << "\nIncorrect, answer is ";
        cout << randNumAnswer << endl;
    }
    //cout << randNumAnswer;//Prints the result, might be unnecessary so I use a random count of 'n', 'c', and 's' each time. Thus I commented it out
}
//---------------------------------------------
//Subtraction
static void subtraction(int num1, int num2)//num1, num1 passed into function
{
    //Implements subtraction so that the user answer is only positive: 
    //ex.Program should not display 25 - 46. Use up to two digits for each number
    int randNumAnswer;
    int userAnswer;
    randNumAnswer = num1 - num2;//Subtract two numbers
    cout << num1 << endl;
    cout << num2 << " -\n";
    cout << "-------\n";
    cout << "input answer, then press enter: ";
    cin >> userAnswer;//Recieves enter key pressed
    cout << endl;
    //Decision statement and display
    if (userAnswer == randNumAnswer) {
        cout << "\nCongratulations";
    }
    else {
        //display answer
        cout << "\nIncorrect, answer is: ";
        cout << randNumAnswer << endl;
    }
}
//----------------------------------------------
//Function to implement modulus(remainder)
static void  modular(int num1, int num2)//num1, num1 passed into function
{
    //Implement modulus operation. Numbers must be up to two digits.
    int randNumAnswer;
    int userAnswer;
    randNumAnswer = num1 % num2;//remainder of two numbers
    cout << num1 << endl;
    cout << num2 << " %\n";
    cout << "-------\n";
    cout << "input answer, then press enter: ";
    cin >> userAnswer;//Recieves enter key pressed
    cout << endl;
    //Decision statement and display
    if (userAnswer == randNumAnswer) {
        cout << "\nCongratulations";
    }
    else {
        //display answer
        cout << "\nIncorrect, answer is: ";
        cout << randNumAnswer << endl;
    }
}
//----------------------------------------------
//function to implement multiplication
static void multiplication(int num1, int num2)//num1, num1 passed into function
{
    //Implement multiplication where one of the factor is one digit number and 
    //the other is up to two digits number.
    int randNumAnswer;
    int userAnswer;
    randNumAnswer = (num1%10) * num2;//Multiply two numbers
    cout << num1 << endl;
    cout << num2 << " x\n";
    cout << "-------\n";
    cout << "input answer, then press enter: ";
    cin >> userAnswer;//Recieves enter key pressed
    cout << endl;
    //Decision statement and display
    if (userAnswer == randNumAnswer) {
        cout << "\nCongratulations";
    }
    else {
        //display answer
        cout << "\nIncorrect, answer is: ";
        cout << randNumAnswer << endl;
    }
}
//----------------------------------------------
//Division
static void division(int num1, int num2)//num1, num1 passed into function 
{
    int randNumAnswer;
    int userAnswer;
    randNumAnswer = num1 / num2;//Subtract two numbers
    cout << num1 << endl;
    cout << num2 << " \\n";
    cout << "-------\n";
    cout << "input answer, then press enter: ";
    cin >> userAnswer;//Recieves enter key pressed
    cout << endl;
    //Decision statement and display
    if (userAnswer == randNumAnswer) {
        cout << "\nCongratulations";
    }
    else {
        //display answer
        cout << "\nIncorrect, answer is: ";
        cout << randNumAnswer << endl;
    }
}
//-----------------------------------------------
//Main method
int main()
{
    //Variables

    int num1,
        num2,
        userAnswer,
        randNumAnswer,
        userInput;

    while (1) {// run a while loop
        userInput = menu();
        if (userInput == 6) {
            break; //if user selects 6 program stops
        }
        num1 = getNumber(num1,num2);  //get input of number by calling getNumber function
        num2 = getNumber(num1,num2);
        if (userInput == 1) {//Addition
            add(num1, num2);
        }
        else if (userInput == 2) {//Subtraction
            subtraction(num1, num2);
        }
        else if (userInput == 3) {//Remainder
            modular(num1, num2);
        }
        else if (userInput == 4) {//Multiplication
            multiplication(num1, num2);
        }
        else if (userInput == 5) {//Division
            division(num1, num2);
        }
        else {//if user enter a input not in menu print message
        //invalid input
            cout << "Invalid input";
        }
    }
    //Format line break
    cout << endl;
    return 0;
}
