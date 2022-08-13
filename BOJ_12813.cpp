/*
2022.08.13. (토)
https://boj.kr/12813
"이진수 연산" 문제 풀이
*/
#include <iostream>
#include <bitset>

#define endl "\n"

using namespace std;
typedef bitset<100000> bin;

int main(){
    string s1, s2;
    cin >> s1 >> s2;
    
    bin a(s1);
    bin b(s2);
    
    cout << (a & b) << endl;
    cout << (a | b) << endl;
    cout << (a ^ b) << endl;
    cout << ~a << endl;
    cout << ~b << endl;
}
