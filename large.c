#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("enter the numbers");
scanf("%d%d%d",&a,&b,&c);
if((a>b)&&(a>c))
printf("a is large");
 else if(b>c)
printf("b is large");
else
printf("c is large");
}
