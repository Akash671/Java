// Java code Showing Tail Recursion
class tailhead {

// Recursion function
static void fun(int n)
{
    if (n > 0) 
    {
        fun(n - 1);   //for head recusion...
    System.out.print(n + " ");

    // Last statement in the function
    //fun(n - 1);  for tail recursion 
    }
}

// Driver Code
public static void main(String[] args)
{
    int x = 4;
    fun(x);
}
}

// This code is contributed by pratham76.
