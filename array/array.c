#include  <stdio.h>
int main ()
{
    int num[] = {4, 6, 3, 12, 99, 20};
    //modify fifth element
    num[4] += 1;
    for(int i=0; i < sizeof(num) / sizeof(num[0]); i++)
    {
        printf("%d", num[i]);
    }
}