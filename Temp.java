import java.util.*;

public class Temp 
{
    void sort(int a[],int n)
    {
        // logic here...........
        for(int j=1;j<n;j++)
        {
            int key=a[j];
            int i=j-1;
            while(i>=0 && a[i]>key)
            {
                a[i+1]=a[i];
                i--;
            }
            a[i+1]=key;
        }
    }

    static void printarray(int a[],int n)
    {
        for(int i=0;i<n;++i)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;++i)
            {
                a[i]=sc.nextInt();
            }
            Temp ob = new Temp();
	        ob.sort(a,n);
	      	printarray(a,n);
         t--;
        }
    }
}
