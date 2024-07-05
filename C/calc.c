#include <stdio.h>
int main ()
{
    char name[10];
    double a, b, c;

    printf("What's your name? ");
    fgets(name, 10, stdin);
    printf("Hello %sI want us to do some calculations, Are you in? \n", name);
    
    printf("Enter your first number: ");
    scanf("%lf", &a);
    printf("Enter your second number: ");
    scanf("%lf", &b);

    printf("The product of the numbers is : %f", c = a*b);
}