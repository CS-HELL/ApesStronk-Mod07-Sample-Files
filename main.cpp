//
// Created by ApesStronk on 12/11/2021.
//

#include <iostream>
#include <array>
#include <cstdio>
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


void solvePalindromicTimes(){
    cout << "\nPalindromic Times" << endl;
    int hh, mm;
    scanf("%d:%d", &hh, &mm);
    do
    {
        ++mm;
        if (mm == 60)
        {
            ++hh;
            mm = 0;
        }
        if (hh == 24)
        {
            hh = 0;
        }
    } while (hh % 10 * 10 + hh / 10 != mm);
    printf("%02d:%02d\n", hh, mm);
}

void solveWayTooLongWords() {
    cout << "\nWay Too Long Words" << endl;
    int n;
    string s;
    cin >> n;
    while (n--)
    {
        cin >> s;
        if (s.length() > 10)
        {
            cout << s[0] << s.length() - 2 << s[s.length() - 1] << endl;
        }
        else
        {
            cout << s << endl;
        }
    }
}

void solveVusTheCossackAndAContest(){
    cout << "\nVus The Cossack and a Contest" << endl;
    int M, N, K;
    cin >> M >> N >> K;
    if (M - N >= 0 && K - N >= 0)
    {
        cout << "\nYes";
    } else
    {
        cout << "\nNo";
    }
}


void displayUserChoices() {
    cout << "\n[CodeForces Problem Set by ApesStronk]\n"
            "1. Digits Sum\n"
            "2. Domino Piling\n"
            "3. Palindromic Times\n"
            "4. Way Too Long Words\n"
            "5. Vus the Cossack and a Contest\n"
            "0. Exit Program.\n"
            "Your Choice:";
}

void initiateUserChoice(int userChoice){
    switch(userChoice){
        case 1: solveDigitsSum();
            break;
        case 2: solveDominoPiling();
            break;
        case 3: solvePalindromicTimes();
            break;
        case 4: solveVusTheCossackAndAContest();
            break;
        case 5: solveWayTooLongWords();
            break;
        case 0: cout << "Goodbye.";
            exit(3);
        default:
            cout << "Invalid Input.";
    }
}

void emptySampleMethod(){
    helloIamAnError()
}


int main() {
    int userChoice;

    for (;;) {
        displayUserChoices();
        cin >> userChoice;

        initiateUserChoice(userChoice);
    }
}