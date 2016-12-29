#include<stdio.h>
#include<conio.h>
void main()
{
int n;
printf("enter the year");
scanf("%d",&n);
if((n%400==0)||(n%100!=0&&n%4==0))

printf("leap year");

else
 printf("not leap year");

}
