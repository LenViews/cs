//Function is a collection of code that performs a specific task

#include <stdio.h>

void sayHi();
int main ()
{
    sayHi("Lenox");//Function call
}
//void - return type
//We can give functions some information - parameters
//Parameter - value given to a function
void sayHi (char name[]) {
    printf("Hello %s!", name);
}