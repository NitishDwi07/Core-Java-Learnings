class nestedcatchdemo
{
    public static void main(String[] args) 
    {
        int []A={0,1,2,3,4,5,6};
        try
        {
            try
            {
            System.out.println("Array of index 7="+A[7]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
            System.out.println("Please use correct index number");
            }

            int c=A[4]/A[0];
            System.out.println("Division is="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator cannot be zero try again");
        }
        
        System.out.println("Bye see you soon!!");
        

    }
}