public class BooleanGames
{
    private int number;

    public BooleanGames(int number)
    {
        this.number = number;
    }

    public boolean isNegative()
    {
        return(number < 0);
    }

    public boolean exceeds(int num)
    {
        return(number > num);
    }

    public boolean isEven()
    {
        int remainder = number % 2;
        return(remainder == 0);
    }

    public boolean isOdd()
    {
        int remainder = number % 2;
        return(remainder != 0);
    }

    public boolean isMultipleOf(int x)
    {
        return((number % x) == 0);
    }

    public boolean isOnesDigit(int num)
    {
        
    }
}