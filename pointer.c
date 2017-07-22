#include<stdio.h>
#include<conio.h>
int main(){
int *ptr,*ptr1;
int num;
printf("Enter the two numbers");
Scanf("%d %d",ptr,ptr1);
    num=*ptr + *ptr1;
printf("sum=%d",num);
return (0);
}
