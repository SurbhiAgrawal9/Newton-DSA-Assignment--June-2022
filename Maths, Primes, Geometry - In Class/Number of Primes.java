// Problem Statement
// You are given a number n. Your task is to print the number of prime numbers before that number.
// Input
// The first line of the number of test cases T.
// Next T lines contains the value of N.

// Constraints
// 1 <= T <= 100
// 1 <= N <= 1000
// Output
// Print the number of primes numbers before that number.
// Example
// Sample Input 1:
// 3
// 10
// 19
// 4

// Sample Output 1:
// 4
// 8
// 2



#include <bits/stdc++.h>
using namespace std;
bool isPrime(int n)
{
    if (n <= 1)
        return false;


    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;

    return true;
}
int ppp=0;
void printPrime(int n)
{
    for (int i = 2; i <= n; i++) {
        if (isPrime(i))
            ppp++;
    }
    cout<<ppp<<endl;
    ppp=0;
}

int main()
{
    int t;
    cin>>t;

    while(t--){
    int n;cin>>n;
    printPrime(n);
    }
}

