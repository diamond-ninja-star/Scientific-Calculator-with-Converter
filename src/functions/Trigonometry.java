package functions;

public class Trigonometry 
{
    public double asinh(double x)
    {
    return Math.log(x + Math.sqrt(x*x + 1.0));
    }

    public double acosh(double x)
    {
        return Math.log(x + Math.sqrt(x*x - 1.0));
    }

    public double atanh(double x)
    {
        return 0.5*Math.log( (x + 1.0) / (x - 1.0) );
    } 
}
