/* athor akash kumar  */

// Fibonacci Series using Dynamic Programming
class fibonacciDynamic
{
static void fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
    
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
    System.out.print(f[0]+" ");
    System.out.print(f[1]+" ");
    for (i = 2; i <= n; i++)
    {
    /* Add the previous 2 numbers in the series
        and store it */
        f[i] = f[i-1] + f[i-2];
        System.out.print(f[i]+" ");
    }
    
    //return f[n];
    }
    
    public static void main (String args[])
    {
        int n = 9;
        fib(n);
    }
}
/* This code is contributed by Rajat Mishra */
