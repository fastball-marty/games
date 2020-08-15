#include <iostream>
#include <string>
#include <cstdlib>
#include <stdlib.h>
using namespace std;

void errorChecking(int);
void computerTurn(int);
void printGuess(int);

int main()
{
    char play;
    int weapon;
    cout << "Welcome to boulder, parchment, shears!" << endl << endl;
    
    do 
    {
        cout << "Choose your weapon: \n 0 - Boulder \n 1 - Parchment \n 2 - Shears" << endl;
        cin >> weapon;
        errorChecking(weapon);
        system("CLS");
        computerTurn(weapon); 
        cout << "Play again? (Y/N)" << endl;
        cin >> play;
        system("CLS");
    } while (tolower(play) == 'y');

    return 0;
}

void errorChecking(int guess)
{
    while (!cin || guess > 2 || guess < 0)
    {
        cout << "Error: invalid input. Please enter a number 0-2." << endl;
        cin.clear();
        cin.ignore(100, '\n');
        cin >> guess;
    }
    return;
}

void computerTurn(int playerGuess)
{
    cout << "You cast: ";
    printGuess(playerGuess);

    cout << "Generating guess..." << endl;
    int compGuess = rand() % 3;

    cout << "Computer casts: ";
    printGuess(compGuess);

    cout << endl;

    //calculate winner
    if (compGuess == playerGuess)
        cout << "Tie game!";
    else if (compGuess == 0 && playerGuess == 1)
        cout << "Parchment beats boulder. You win!";
    else if (compGuess == 0 && playerGuess == 2)
        cout << "Boulder beats shears! Computer wins!";
    else if (compGuess == 1 && playerGuess == 0)
        cout << "Parchment beats boulder. Computer wins!";
    else if (compGuess == 1 && playerGuess == 2)
        cout << "Shears beats parchment. You win!";
    else if (compGuess == 2 && playerGuess == 0)
        cout << "Boulder beats shears. You win!";
    else if (compGuess == 2 && playerGuess == 1)
        cout << "Shears beats parchment. Computer wins!";

    cout << endl << endl;
}

void printGuess(int guess)
{
    switch (guess)
    {
    case 0:
        cout << "boulder!" << endl;
        break;
    case 1:
        cout << "parchment!" << endl;
        break;
    case 2:
        cout << "shears!" << endl;
    }
}