class fibonacci
 {  
    public static void main(String args[]) 
      {    
         int n1=0,n2=1,n3,i,count=10;    
         System.out.print(n1+" "+n2);
         for(i=2;i<count;++i)
           {    
              n3=n1+n2;    
              System.out.print(" "+n3);    
              n1=n2;    
              n2=n3;    
            }    
      
       }
 }  
/*


class fibonacci
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    
    public static void main (String args[])
    {
    int n = 9;
    System.out.println(fib(n));
    }
}
*/
