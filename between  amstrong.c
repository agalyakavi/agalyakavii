#include<stdio.h>
int main()
{
int a,c=0,r,n,n1,i,temp;
printf("enter the two numbers\n");
scanf("%d %d",&n,&n1);
for(i=n;i<=n1;i++)
{
    temp=i;
while(i!=0)
{
r=i%10;
i=i/10;
c=c+(r*r*r);
}
if(temp==c)
printf("%d ",temp);
else
printf("");

}
return 0;
}

