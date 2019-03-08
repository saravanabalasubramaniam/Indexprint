import java.io.*;
import java.util.*;
class Index
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=input.nextInt();
		System.out.println();
	}
	int j=0;
	int n=0;
	int temp=0;
	while(j < a)
	{
		 temp=arr[j];
		int k=0+j;                                                         
		for(k=k;k<a;k++)
		{
			if(temp>arr[k])	
			{
			    n=k-1;
			    break;
			}
		}
	j++;
	
	}
	if(n>=0)
	{
		System.out.println(n);
	}
   }
}				
