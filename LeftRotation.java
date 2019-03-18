
package practice;
import java.util.Scanner;
public class Rotation {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter rotate number of times");
        int rotate=sc.nextInt();
        int temp,k=0;
        
        
            for(i=0;i<rotate;i++)
            {
            temp=arr[k];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
                
            }
            arr[n-1]=temp;
            k=0;
            
            }
            
        
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]);
        }
        
    }
    
}
