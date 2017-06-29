#include<stdio.h>
int main()
{
int n,n1,i;
printf("enter the two numbers\n");
scanf("%d %d",&n,&n1);
for(i=n;i<=n1;i++)
{
if(i%2==0)
printf("%d even\n",i);

}
return 0;
}
