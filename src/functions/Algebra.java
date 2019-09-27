package functions;
public class Algebra 
{
    //function to calculate factorial
    public int factorial(int x)
    {
        if(x==0)
        {
            return 1;
        }
        if(x==1)
        {
            return 1;
        }
        return x* factorial(x-1);
    }
}
