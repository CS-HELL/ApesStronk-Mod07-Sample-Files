//
// Created by Jeremy on 12/11/2021.
//

#include <iostream>
#include <array>
using namespace std;

void solveDigitsSum(){
    cout << "\nDigits Sum Problem" << endl;
    int t = 0; // Will be the total input accepted by the loop.
    int input = 0; // Will be the input that will be stored in an array.

    cin >> t;
    int* inputs = new int[t]; // Array of inputs.

    for(int i = 0; i < t; i++){
        cin >> input;
        inputs[i] = input;
    }

    for(int i = 0; i < t; i++){
        int k = inputs[i];
        int j = (k+1)/10;
        std::cout << j << " ";
    }
    std::cout << endl;
}

void solveDominoPiling(){
    cout << "\nDomino Piling" << endl;
    int M, N;
    cin >> M >> N;
    cout << M * N / 2 << endl;
}



void displayUserChoices() {
    cout << "\n[CodeForces Problem Set by ApesStronk]\n"
            "1. Digits Sum\n"
            "2. Domino Piling\n"
            "3. \n"
            "0. Exit Program.\n"
            "Your Choice:";
}

void solveDominoPiling(){
    cout << "\nDomino Piling" << endl;
    int M, N;
    cin >> M >> N;
    cout << M * N / 2 << endl;
}

void initiateUserChoice(int userChoice){
    switch(userChoice){
        case 1: solveDigitsSum();
            break;
        case 2: solveDominoPiling();
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 0: cout << "Goodbye.";
            exit(3);
        default:
            cout << "Invalid Input.";
    }
}


int main() {
    int userChoice;

    for (;;) {
        displayUserChoices();
        cin >> userChoice;

        initiateUserChoice(userChoice);
    }
}