#include <stdio.h>
int main ()
{
    //format specifiers - define type of data to be displayed

    //%c = char
    //%s = string
    //%f = float
    //%d = integer
    //%lf = double

    float a = 5.75;
    float b = 10.00;
    float c = 100.99;

    //constant - fixed values, can't be altered during execution
    const double PI = 3.14159;

    //%.1 = decimal precision
    //%1 = minimum field width
    //%- = left align

    printf("a is %10.4f\n", a);
    printf("b is %8.3lf\n", b);
    printf("c is %.1f\n", c);
    printf("PI : %.3f", PI);


    return 0;
}