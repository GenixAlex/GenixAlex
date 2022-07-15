#include <stdio.h>
#include<iostream>
#include<cstdlib> //for rand and srand functions
#include <ctime> //time function
#include <iomanip>
#include <vector>
#include <limits>
#include <cstring> // for memeset

using namespace std;
const int ROWS = 5;
const int COLUMNS = 3;
int statistics[ROWS][COLUMNS];
//Prototype methods ::: defined all the prototypes here
void displayStatistics();
static int getNumber();
static int getNumber2();
char inputValidateYesOrNo(char letter);
static int menu();
static void add();
static void subtraction();
static void modular();
static void multiplication();
static void division();
//-----------------------------------------------
//Main method
int main()
{
	//Variables


	int userInput;
	memset(statistics, 0, sizeof(statistics)); // statistics table setting it to zero
	srand(time(0)); // seeding time else we will get same no always


	while (1) {// run a while loop
		userInput = menu();

		if (userInput == 6) {
			cout << endl;
			displayStatistics(); // ::: displaying table before exiting
			break; //if user selects 6 program stops
		}
		if (userInput == 1) {//Addition
			add();
		}
		else if (userInput == 2) {//Subtraction
			subtraction();
		}
		else if (userInput == 3) {//Remainder
			modular();
		}
		else if (userInput == 4) {//Multiplication
			multiplication();
		}
		else if (userInput == 5) {//Division
			division();
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
// displays statistics of correct and incorrect answers
void displayStatistics() {
	int total = 0, totalC = 0, totalW = 0;
	printf("\t\t\t\t Total Question \t\t RIGHT \t\t WRONG"); // table header
	cout << endl;
	for (int i = 0; i < 4; i++) {
		statistics[4][0] += statistics[i][0]; // adding the number of each type of question to the total
		statistics[4][1] += statistics[i][1]; // adding the number of each right answer to the total
		statistics[4][2] += statistics[i][2]; // adding the number of each wrong answer to the total

	}
	for (int i = 0; i < 5; i++) {
		if (i == 0) {
			cout << "ADDITION";
			printf("%35d %30d %15d", statistics[i][0], statistics[i][1], statistics[i][2]); // displaying the number of questions, right, and wrong for addition
		}
		else if (i == 1) {
			cout << "SUBTRACTION";
			printf("%27d %30d %15d", statistics[i][0], statistics[i][1], statistics[i][2]); // displaying the number of questions, right, and wrong for subtraction

		}
		else if (i == 2) {
			cout << "MULTIPLICATION";
			printf("%24d %30d %15d", statistics[i][0], statistics[i][1], statistics[i][2]); // displaying the number of questions, right, and wrong for multiplication
		}
		else if (i == 3) {
			cout << "MODULUS";
			printf("%31d %30d %15d", statistics[i][0], statistics[i][1], statistics[i][2]); // displaying the number of questions, right, and wrong for modulus
		}
		else {
			cout << "TOTALS";
			printf("%32d %30d %15d", statistics[i][0], statistics[i][1], statistics[i][2]); // displaying the total number of questions, right, and wrong
		}

		cout << endl;

	}


}
//-----------------------------------------------
//Each random number returned from function
static int getNumber() // ::: changes now return only number cause returning num1, num2 is wrong
{

	int min_Value = 0,
		max_Value = 1000,
		num1,
		num2;
	num1 = (rand() % (max_Value - min_Value + 1)) + min_Value;
	return num1;
}
//-----------------------------------------------
//Here random number return from 0-500 for out modulo operation
static int getNumber2() // ::: changes now return only number cause returning num1, num2 is wrong
{

	int min_Value = 0,
		max_Value = 500,
		num1,
		num2;
	num1 = (rand() % (max_Value - min_Value + 1)) + min_Value;

	return num1;
}
//------------------------------------------------
//Function for user answer to problem
static int getUserNumber()
{
	int userAnswer;
	cout << "Enter a Number:\n";
	cin >> userAnswer;
	return userAnswer;
}
//-------------------------------------------------
//Function to validate user input when selection to continue or not
char inputValidateYesOrNo(char letter) {
	cin >> letter;
	while (!(letter == 'Y' || letter == 'y' || letter == 'N' || letter == 'n'))
	{
		cout << "Error: Enter a \"Y\" for yes or \"N\" for \"no\"";
		cin.clear();
		cin.ignore(numeric_limits<streamsize>::max(), '\n'); //--not sure what this is or if it's needed
		cin >> letter;
	}
	return letter;
}
//-------------------------------------------------
//function to implement the menu.
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
	cin >> userInput; //take user input
	return userInput; //return option
}
//---------------------------------------------

//---------------------------------------------
//function to implement the addition operation
static void add()//num1, num1 passed into function
{
	int randNumAnswer;
	int userAnswer;
	int menuInput = 0;
	int num1 = 0, num2 = 0;
	char user_choice = ' ';
	do {
		num1 = getNumber(); // get num1
		num2 = getNumber(); // get num2
		randNumAnswer = num1 + num2; //add two numbers
		cout << num1 << endl;
		cout << num2 << " +\n";
		cout << "-------\n";
		cout << "input answer, then press enter: ";
		cin >> userAnswer;//Receives enter key pressed
		if (userAnswer == randNumAnswer) {
			cout << "\nCongratulations";
			statistics[0][0]++; statistics[0][1]++; //update row corresponding to add
		}
		else if (userAnswer != randNumAnswer) {
			//display answer
			cout << "\nIncorrect, answer is ";
			statistics[0][0]++; statistics[0][2]++; //update row corresponding to add
			cout << randNumAnswer << endl;
		}
		cout << "Return to menu? (enter y for yes, n for no): \n";
		user_choice = inputValidateYesOrNo(user_choice);
		if (user_choice == 'y' || user_choice == 'Y') {
			return;
		}
		else {
			char user_Choice = 'n';
		}
	} while (menuInput == 1 || user_choice == 'n' || user_choice == 'N');
}
//---------------------------------------------
//Subtraction
static void subtraction()//num1, num1 passed into function
{
	//Implements subtraction so that the user answer is only positive:
	//ex.Program should not display 25 - 46. Use up to two digits for each number
	int randNumAnswer;
	int userAnswer;
	int menuInput = 0;
	char user_choice = ' ';
	int num1 = 0, num2 = 0;

	do {
		num1 = getNumber(); //get num1
		num2 = getNumber(); //get num2
		randNumAnswer = num1 - num2;//Subtract two numbers
		if (randNumAnswer < 0) {
			int tempInt = num2;
			num2 = num1;
			num1 = tempInt;
			randNumAnswer = num1 - num2;
		}
		cout << num1 << endl;
		cout << num2 << " -\n";
		cout << "-------\n";
		cout << "input answer, then press enter: ";
		cin >> userAnswer;//Receives enter key pressed
		if (userAnswer == randNumAnswer) {
			cout << "\nCongratulations";
			statistics[1][0]++; statistics[1][1]++; //update row corresponding to subtraction
		}
		else if (userAnswer != randNumAnswer) {
			//display answer
			cout << "\nIncorrect, answer is ";
			statistics[1][0]++; statistics[1][2]++; //update row corresponding to subtraction
			cout << randNumAnswer << endl;
		}
		cout << "Return to menu? (enter y for yes, n for no): \n";
		user_choice = inputValidateYesOrNo(user_choice);
		if (user_choice == 'y' || user_choice == 'Y') {
			return;
		}
		else {
			char user_Choice = 'n';
		}
	} while (menuInput == 1 || user_choice == 'n' || user_choice == 'N');
}
//----------------------------------------------
//Function to implement modulus(remainder)
static void modular()//num1, num1 passed into function
{
	//Implement modulus operation. Numbers must be up to two digits.
	int randNumAnswer;
	int userAnswer;
	int menuInput = 0;
	char user_choice = ' ';
	int num1 = 0, num2 = 0;

	do {
		num1 = getNumber(); //get num1
		num2 = getNumber(); //get num2
		randNumAnswer = num1 % num2;//remainder of two numbers
		cout << num1 << endl;
		cout << num2 << " %\n";
		cout << "-------\n";
		cout << "input answer, then press enter: ";
		cin >> userAnswer;//Receives enter key pressed
		if (userAnswer == randNumAnswer) {
			cout << "\nCongratulations";
			statistics[3][0]++; statistics[3][1]++; //update row corresponding to modular
		}
		else if (userAnswer != randNumAnswer) {
			//display answer
			cout << "\nIncorrect, answer is ";
			cout << randNumAnswer << endl;
			statistics[3][0]++; statistics[3][2]++; //update row corresponding to modular
		}
		cout << "Return to menu? (enter y for yes, n for no): \n";
		user_choice = inputValidateYesOrNo(user_choice);
		if (user_choice == 'y' || user_choice == 'Y') {
			return; //confirmation for choice yes
		}
		else {
			char user_Choice = 'n';
		}
	} while (menuInput == 1 || user_choice == 'n' || user_choice == 'N');
}
//----------------------------------------------
//function to implement multiplication
static void multiplication()//num1, num1 passed into function
{
	//Implement multiplication where one of the factor is one digit number and
	//the other is up to two digits number.
	int randNumAnswer;
	int userAnswer;
	int menuInput = 0;
	char user_choice = ' ';
	int num1 = 0, num2 = 0;

	do {
		num1 = getNumber(); //get num1
		num2 = getNumber(); //get num2
		randNumAnswer = num1 % num2;//remainder of two numbers
		int k = num2 % 10; //forming 2 digit no from num2
		num2 = num2 / 10;
		int j = num2 % 10;
		randNumAnswer = (num1 % 10) * (j * 10 + k);//Multiply two numbers
		cout << num1 % 10 << endl;
		cout << (j * 10 + k) << " *\n";
		cout << "-------\n";
		cout << "input answer, then press enter: ";
		cin >> userAnswer;//Receives enter key pressed
		if (userAnswer == randNumAnswer) {
			cout << "\nCongratulations";
			statistics[2][0]++; statistics[2][1]++; //update row corresponding to multiplication
		}
		else if (userAnswer != randNumAnswer) {
			//display answer
			cout << "\nIncorrect, answer is ";
			cout << randNumAnswer << endl;
			statistics[2][0]++; statistics[2][2]++; //update row corresponding to multiplication
		}
		cout << "Return to menu? (enter y for yes, n for no): \n";
		user_choice = inputValidateYesOrNo(user_choice);
		if (user_choice == 'y' || user_choice == 'Y') {
			return; //confirmation for choice yes
		}
		else {
			char user_Choice = 'n';
		}
	} while (menuInput == 1 || user_choice == 'n' || user_choice == 'N');
}
//----------------------------------------------
//Division
static void division()//num1, num1 passed into function
{
	int randNumAnswer;
	int userAnswer;
	int menuInput = 0;
	char user_choice = ' ';
	int num1 = 0, num2 = 0;

	do {
		num1 = getNumber();
		num2 = getNumber();
		randNumAnswer = num1 / num2;//remainder of two numbers
		cout << num1 << endl;
		cout << num2 << " /\n";
		cout << "-------\n";
		cout << "input answer, then press enter: ";
		cin >> userAnswer;//Receives enter key pressed
		if (userAnswer == randNumAnswer) {
			cout << "\nCongratulations";
		}
		else if (userAnswer != randNumAnswer) {
			//display answer
			cout << "\nIncorrect, answer is ";
			cout << randNumAnswer << endl;
		}
		cout << "Return to menu? (enter y for yes, n for no): \n";
		user_choice = inputValidateYesOrNo(user_choice);
		if (user_choice == 'y' || user_choice == 'Y') {
			return; //confirmation for choice yes
		}
		else {
			char user_Choice = 'n';
		}
	} while (menuInput == 1 || user_choice == 'n' || user_choice == 'N');
}