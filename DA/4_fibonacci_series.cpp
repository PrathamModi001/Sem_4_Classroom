// write a program to generate a fibonacci series of n terms. Implement both the iterative and recursive approach.

#include <iostream>
using namespace std;

void fib_iterative(int num)
{
    int x = 0, y = 1, z = 0;
    for (int i = 0; i < num; i++)
    {
        cout << x << " ";
        z = x + y;
        x = y;
        y = z;
    }
}

int fib_recursive(int x)
{
    if ((x == 1) || (x == 0))
    {
        return (x);
    }
    else
    {
        return (fib_recursive(x - 1) + fib_recursive(x - 2));
    }
}

int main()
{
    int num;
    cout << "Enter the number : ";
    cin >> num;
    cout << "\nThe fibonacci series : ";

    cout << fib_recursive(num);
    return 0;
}
