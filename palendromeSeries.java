
import java.util.Scanner;

public class Pallendrone {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        System.out.print("how many number of one's you want");
       
       int n=sc.nextInt();
       int a,b=0,c,ns;
      
       int arr[]=new int[n];
       System.out.print("Enter series upto which you want to eneter");
       ns=sc.nextInt();
       for(int i=0;i<n;i++)
       {
            arr[i]=1;
            
       }
       //printing sum of ones 
       for(int j=0;j<n;j++)
       {
           
           System.out.print(arr[j]);
           b=b+arr[j];
           
       }
       //fonding last ones from array
       a=arr[n-1];
       
       
       System.out.print(b);
       for(int i=0;i<ns;i++)
       {
          c=a+b;
          System.out.print(c);
          a=b;
          b=c;
       }
       
       
       
       
       }
}