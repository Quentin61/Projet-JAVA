package petitsChevaux;

public class PasDeJoueursException extends Exception
{
    public PasDeJoueursException()
    {
        super();
    }
    public PasDeJoueursException(String message)
    {
        super(message);
    }
    public PasDeJoueursException(String message,Throwable a)
    {
        super(message,a);
    }
    public PasDeJoueursException(String message, Throwable a,boolean b,boolean c)
    {
        super(message,a,b,c);
    }
}