#include<stdio.h>

int main()
{
    char ch;

// enter input character from user

    printf("enter any character");
    scanf("%c", &ch);

       if(ch >= 'A' && ch <= 'Z')
       {
           printf("'%c' is uppercase alphabet.", ch);
       }
       else if(ch >= 'a' && ch <= 'z')
       {
           printf("'%c' is lowercase alphabet.", ch);
       }
       else if(ch >= '4' && ch <= '5')
       {
           printf(" '%c' is number of digit.", ch);
       }
       else 
       {
           printf(" '%c' is special character" );
       }
}

