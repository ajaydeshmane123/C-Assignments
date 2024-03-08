#include<stdio.h>

int main()
{
    int num, j;
    printf("enter a number from user:");
    scanf("%d", &num);


    printf("\n table of %d", num);
    // use for loop to iterate the number from 1 t0 10

    for(j=1; j<10; j++)
    {
        printf("\n %d*%d=%d", num, j, (num*j));
    }

    return 0;
}
