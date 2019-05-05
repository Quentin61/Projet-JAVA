package petitsChevaux;

public class ConflitDeCouleurException extends Exception
{
    public ConflitDeCouleurException()
    {
        super();
    }
    public ConflitDeCouleurException(String message)
    {
        super(message);
    }
    public ConflitDeCouleurException(String message,Throwable a)
    {
        super(message,a);
    }
    public ConflitDeCouleurException(String message, Throwable a,boolean b,boolean c)
    {
        super(message,a,b,c);
    }
}