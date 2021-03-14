    public class pattern
    {   
    public static void main(String args[])   
    {   
    //i for rows and j for columns      
    //row denotes the number of rows you want to print  
    int i, j, row=6;   
    //outer loop for rows  
    for(i=0; i<6; i++)   
    {   
    //inner loop for columns  
    for(j=0; j<=i; j++)   
    {   
    //prints stars   
    System.out.print(j+" ");   
    }   
    //throws the cursor in a new line after printing each line  
    System.out.println();   
    }   
    }   
    }  
