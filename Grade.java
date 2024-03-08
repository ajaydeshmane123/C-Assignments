#include<stdio.h>

int main()
{
    int Marathi, Hindi, English, Math, Histroy;
    float total, per;

// Enter of five sub marks from user
    printf("Enter of five subject marks from user");
    scanf("%d%d%d%d%d", &Marathi, &Hindi, &English, &Math, &Histroy);

// calculate percentage
    total = Marathi+Hindi+English+Math+Histroy;
    per=(Marathi+Hindi+English+Math+Histroy)/5.0;

    printf("Percentage= %2f\n", per);

// find grade according to the percentage
    if(total >= 90)
    {
        printf("grade Ex");
    }
   else if(90>total>=80)
    {
        printf("grade A");
    } 
   else if(80>total>=70)
    {
        printf("grade B");
    }
   else if(70>total>=60)
    {
        printf("grade C");
    }
   else if(60>total)
    {
        printf("grade F");
    }
}
