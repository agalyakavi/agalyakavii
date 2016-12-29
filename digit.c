#include<stdio.h>
#include<conio.h>
void main()
{
int n,a,r=0;
printf("enter the number");
scanf("%d",&n);
while(n!=0)
{

    a=n%10;
    n=n/10;
    r=r+1;
}
printf("%d",r);
}
