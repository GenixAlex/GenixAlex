#include <stdio.h>
#include<iostream>
#include <iomanip>
#include <string> //for string variables
#include <vector>

using namespace std;

//prototype methods
string passwordInput();
bool passwordCheck(string input);

int main()
{
	vector <string> passwords;//array of passwords
	string password = " ";// password outside while loop to store password
	while (true) {
		int userInput = 0;
		//Creates menu screen & accepts user selection for menu
		cout << "Main Menu\n";
		cout << "1: Create Password\n";
		cout << "2: Login\n";
		cout << "3: Exit\n";
		cout << "Input number selection:\n";
		cin >> userInput;
		string inputPassword = " ";
		bool validPassword = false;
		int attempt = 0;
		bool successfulLogin = false;
		switch (userInput) { //Accepts user input from menu selection
		case 1:
			while (!validPassword)// While pass word is valid
			{
				password = passwordInput();// variable equal to what method returns
				validPassword = passwordCheck(password);//valid password store information from password check medthos to store whether or not password is valid
				if (validPassword) //if password is valid
				{
					passwords.insert(passwords.begin(), password);//Password inserted into vector
					cout << "Password created\n"; //verifies password is created
				}
				else
				{
					cout << "invalid password try again\n"; // If password is invalid user gets error message
				}
			}
			break;
		case 2:
			do {
				cout << "Please type in your password\n ";
				cin >> inputPassword;// accepts user input for password
				successfulLogin = false;// sets default value to false
				for (int i = 0; i < passwords.size(); i++) { //iterate through password array checking for matching password
					if (inputPassword == passwords.at(i)) {//matching password is found
						successfulLogin = true;// default value changes to true
						break;//breaks out of for loop, no need to check other passwords.
					}
				}
				if (successfulLogin) //if successful login display message below
				{
					cout << "\nLogin successful \n";
				}
				else // login is unsuccessful
				{
					attempt++;
					if (attempt >= 3) { // 3 unsuccessful attempts locks account
						cout << "\nAccount locked \n";
						break;
					}
					else {
						cout << "\nincorrect Password, try again \n";
					}
				}
			} while (!successfulLogin);
			break;
		case 3:
			return 0;
		default:
			cout << "Invalid Selection, try again \n";
			break;
		}
	}
	system("CLS");
	return 0;
}
string passwordInput()
{
	string input;
	cout << "create password, password must be include (6 characters long, uppercase character, lowercase character, number, & special character) \n";
	cout << "Input password: \n";
	cin >> input;
	return input;
}

bool passwordCheck(string input)// return value is whether or not password is valid
{
	bool hasUpper = false;
	bool hasLower = false;
	bool hasNum = false;
	bool hasSpecialChar = false;
	bool hasSpace = false;
	if (input.size() < 6)
	{
		return false;
	}
	for (char c : input)
	{
		if (isalpha(c)) {
			if (islower(c))
			{
				hasLower = true;
			}
			else
			{
				hasUpper = true;
			}

		}
		else if (isdigit(c))
		{
			hasNum = true;
		}
		else if (isspace(c))
		{
			hasSpace = true;
		}
		else
		{
			hasSpecialChar = true;
		}
	}
	if (hasUpper && hasLower && hasNum && hasSpecialChar && !hasSpace) {
		return true;
	}
	return false;
}