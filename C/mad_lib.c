#include <stdio.h>
#include <string.h>
int main ()
{
    char color[20];
    char noun[20];
    char celebrity[20];

    printf("Enter a color: ");
    fgets(color, 20, stdin);
    printf("Enter a Noun: ");
    if (fgets(noun, 20, stdin))
    {
        noun[strcspn(noun, "\n")] = '\0';
    }
    printf("Enter a celebrity: ");
    fgets(celebrity, 20, stdin);
    printf("\n");

    printf("Roses are %s", color);
    printf("%s are Blue\n", noun);
    printf("I love %s", celebrity);

}