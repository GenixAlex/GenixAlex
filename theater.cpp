/*Theater Seating Project
* Program sells tickets for performances
* -------------------------------------------------------------------
* theaters audetoium has: 15 rows of seats, 30 seats per row
* Program should:
* display a screen to show chart of which seats are available & taken
* available seats represented by pound sign
* taken seats represented by *
*
* List of tasks program will perform:
* > when program begins:
*		- ask user to input seat prices for each row.
*	    - prices can be stored in a seperate array (may also be read from a file)
* > once prices are entered:
*		- user will enter the row and seat numbers for tickets being sold
*		- each time ticket or group of tickets is purchased, program should
*		- display total ticket prices, and update seating chart
* > Program should keep track of all ticket sales
*		- User should be given an option of viewing this amount
* > Program should also:
*		- give user the option to view list of how many seats have been sold
*		- how many seats are available in each row
*		- How many seats are available in the entire auditorium
* --------------------------------------------------------------------
* > Additional requirements
*		- Display user menu with options: buy, cancel, exit. Implement other options if needed
*		- Use different functions to recieve, process, and display info to user
*		- Modularize as much as possible
*			- EX: use function to store data in array, another function to recover data
*				  another function to process the array, etc
*		-Test the main functionality of the theater seating
*			- create lap report, call it midTermLab.pdf
*			- document with pictures and concise comments of what you ae testing
*			  and show several cases, atleast 5 for testing each case
*		- Implement a cancel ticket option
*/



#include <stdio.h>
#include<iostream>
using namespace std;
//Constants;
const int ROWS = 15,
        COLUMNS = 30;
//prototype methods
void displayMenu();
void cancel();
void displaySeatingPrices(const double[]);
void displaySeatingChart(char[ROWS][COLUMNS]);
void getValuesFromInput(double[]);
int inputValidate(int, int, int);
char inputValidateYesOrNo(char);

//Main method
int main() {
    double seat_prices[ROWS];
    char seating_chart[ROWS][COLUMNS];

    int menu_choice,
        seats_sold = 0;
    char user_choice = ' ';
    double total_ticket_sales = 0;
    int row_number = 0;
    int seat_number = 0;
    for (int i = 0; i < 15; i++) { // sets available seating
        for (int j = 0; j < 30; j++) {
            seating_chart[i][j] = '#';
        }
    }

    getValuesFromInput(seat_prices);
    do
    {
        displayMenu();

        cout << "Enter menu choice: " << endl;
        cin >> menu_choice;
        
        if (menu_choice == 1)//Displays seat pricing
        {
            cout << "Menu choice = " << menu_choice << endl;
            cout << "\nSeat prices: " << endl;
            displaySeatingPrices(seat_prices);

        }
        else if (menu_choice == 2)//Displays seating chart
        {
            cout << "Menu choice = " << menu_choice << endl;
            cout << "Seating chart: " << endl
                << "Taken = * | Available = #" << endl;
            displaySeatingChart(seating_chart);

        }
        else if (menu_choice == 3)//User selects seat in specified row
        {
            cout << "Menu choice = " << menu_choice << endl;

            cout << "Choose a seat: " << endl;
            cout << "Enter row #: ";

            row_number = inputValidate(row_number, 1, 15);

            cout << "Enter seat #: ";
            seat_number = inputValidate(seat_number, 1, 30);

            if (seating_chart[row_number - 1][seat_number - 1] == '#')
            {
                cout << "That seat is available." << endl << endl;
                cout << "The price for Row #" << row_number
                    << " Seat #" << seat_number
                    << " is $" << seat_prices[row_number - 1] << "."
                    << endl;

                cout << "Would you like to purchase Row #" << row_number << " Seat #" << seat_number << "? ";
                user_choice = inputValidateYesOrNo(user_choice);

                if (user_choice == 'Y' || user_choice == 'y')//Seating confirmation for choice yes
                {

                    // 3b. Every time a ticket or group of tickets is purchased, 
                    //      the program should display the total ticket prices 
                    //      and update the seating chart.
                    seating_chart[row_number - 1][seat_number - 1] = '*';// set the symbol *
                    total_ticket_sales += seat_prices[row_number - 1];

                    cout << "Total charges = $" << total_ticket_sales << endl; //Displays total cost

                    seats_sold++;//Keeps a total of all ticket sales. 
                }
                else if (user_choice == 'N' || user_choice == 'n')//Seating confirmation for choice no
                {
                    continue;
                }

            }
            else// Displays if seat is not available
            {
                cout << "\nThat seat is NOT available.\n" << endl;
                cout << "Would you like to pick another seat? ";
                user_choice = inputValidateYesOrNo(user_choice);
            }

        }
        else if (menu_choice == 4)//Displays number of seats sold
        {
            cout << "Menu choice = " << menu_choice << endl;
            cout << "Number of seats sold = " << seats_sold << endl;
        }
        else if (menu_choice == 5)
        {
            cout << "Menu choice = " << menu_choice << endl;
            int seats_available = 0;

            for (int row = 0; row < ROWS; row++)
            {
                for (int column = 0; column < COLUMNS; column++)
                {
                    if (seating_chart[row][column] == '#')
                        seats_available++;
                }
                cout << "Seats available for row #" << (row + 1) << " = " << seats_available << endl;
                seats_available = 0;
            }
        }
        else if (menu_choice == 6)//Displays available autitorium seating
        {
            cout << "Menu choice = " << menu_choice << endl;
            int seats_available = 0;

            for (int row = 0; row < ROWS; row++)
            {
                for (int column = 0; column < COLUMNS; column++)
                {
                    if (seating_chart[row][column] == '#')
                        seats_available++;
                }
            }
            cout << "Total seats available in the entire auditorium = "
                << seats_available
                << endl;
        }
        else if (menu_choice == 7)//Displays total tickets sold
        {
            cout << "Menu choice = " << menu_choice << endl;
            cout << "Number of seats sold = " << seats_sold << endl;
            cout << "Total ticket sales = $" << total_ticket_sales << endl;
        }
        else if (menu_choice == 8)//Cancels ticket
        {
        cout << "Menu choice = " << menu_choice << endl;

        cout << "Choose a seat: " << endl;
        cout << "Enter row #: ";

        row_number = inputValidate(row_number, 1, 15);

        cout << "Enter seat #: ";
        seat_number = inputValidate(seat_number, 1, 30);

        if (seating_chart[row_number - 1 ][seat_number - 1] == '*')
        {
            cout << "Seating to be cancelled ." << endl << endl;
            cout << "The price for Row #" << row_number
                << " Seat #" << seat_number
                << " is $" << seat_prices[row_number - 1] << "."
                << endl;

            cout << "Would you like to cancel Row #" << row_number << " Seat #" << seat_number << "? ";
            user_choice = inputValidateYesOrNo(user_choice);

            if (user_choice == 'Y' || user_choice == 'y')//Seating confirmation for choice yes
            {

                // Every time a ticket or group of tickets is cancelled, 
                // the program should display the total ticket prices 
                // and update the seating chart.
                seating_chart[row_number + 1][seat_number + 1] = '#';// set the symbol # if cancelled
                total_ticket_sales = total_ticket_sales - seat_prices[row_number +1] +1;

                cout << "Total charges to be refunded = $" << total_ticket_sales << endl; //Displays total cost

                seats_sold--;//Keeps a total of all ticket sales. 
            }
            else if (user_choice == 'N' || user_choice == 'n')//Seating confirmation for choice no
            {
                continue;
            }

        }
        else// Displays if seat is available
        {
            cout << "\nThat seat is available.\n" << endl;
            cout << "Would you like to pick another seat? ";
            user_choice = inputValidateYesOrNo(user_choice);
        }

        }
        else if (menu_choice == 9)//Quits program
        {
            cout << "Menu choice = " << menu_choice << endl;
        }


    } while (menu_choice != 9);

    return 0;

}

void displayMenu() {
    cout << "\nChoose from menu: " << endl
        << "1: Seat Prices" << endl
        << "2: Seating Chart" << endl
        << "3: Purchase Seating" << endl
        << "4: Seats Sold" << endl
        << "5: Available Row Seating" << endl
        << "6: Available Auditorium Seating" << endl
        << "7: View Ticket Sales" << endl
        << "8: Cancel Ticket" << endl
        << "9: Quit Program." << endl
        << endl;

}
void displaySeatingPrices(const double array[]) {
    for (int i = 0; i < ROWS; i++)
        cout << "Row #" << (i + 1) << " = $" << array[i] << " " << endl;

    cout << endl;
}

void displaySeatingChart(char seating_chart[ROWS][COLUMNS]) {// section to display seating chart
    // declare variable
    int i = 0, j = 0;
    cout << "\t\tSeats\n" << endl;
    for (int i = 0; i < ROWS; i++)
    {
        cout << "\t ";
        if (i < 10)                     // Checking if the row is less than 10 (Single Digit) if so, add a second space in order to right justify the single digits compared to the double digits.
            cout << "\n Row  " << i;    // Rearranged this line from "Row /n" to "\n Row  "
        else                            // If it's double digits, one 1 space is needed.
            cout << "\n Row " << i;     // Rearranged this line from "Row /n" to "\n Row "
        for (int j = 0; j < COLUMNS; j++) {
            if (i == 0) {
                cout << " ";
                if (j < 10)             //Checking if the column is less than 10 (Single Digit) for the same reason as rows.  To right justify the single digits compared to the doubles.
                    cout << " ";
                cout << j + 1;          //j+1 to output the column number since j being used to organize the columns.  +1 to offset the fact that code starts at 0 and humans don't
            }
            else {
                cout << "  ";           //Double spacing before outputting the seating_chart status to align it with the column numbers.  The column numbers, being double digit, have a total of 3 characters per ex: " 15" and since the seating chart is always a single char, it needs 2 spaces to have 3 characters ex: "  #"
                cout << seating_chart[i][j];
            }
        }
        //newline
    }
}

void getValuesFromInput(double seat_prices[]) {
    for (int row = 0; row < ROWS; row++) {
        cout << "Enter seat price: ";
        cin >> seat_prices[row];
    }
}
//you can essentially do something similar to what you're doing for displaySeatingPrices
//for each row have a cout asking the user to input a price for that Row#
//then have a cin to take their input for that row


int inputValidate(int user_number, int lowest, int highest) {
    cin >> user_number;
    while ((user_number < lowest || user_number > highest)) //not sure if (cin >> user_number) needs to be on its own line, for example like what you're doing with cin >> letter in the inputValidateYesOrNo method. testing the program will tell us
    {
        cout << "Error: Enter a number from " << lowest << " to " << highest << ": ";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); //not sure what this is or if it's needed
        cin >> user_number;
    }

    return user_number;
}

char inputValidateYesOrNo(char letter) {
    cin >> letter;
    while (!(letter == 'Y' || letter == 'y' || letter == 'N' || letter == 'n'))
    {
        cout << "Error: Enter a \"Y\" for yes or \"N\" for \"no\"";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); //same as above--not sure what this is or if it's needed
        cin >> letter;
    }
    return letter;
}