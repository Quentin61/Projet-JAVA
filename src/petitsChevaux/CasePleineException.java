package petitsChevaux;

public class CasePleineException extends Exception
{
    public CasePleineException()
    {
        super();
    }
    public CasePleineException(String message)
    {
        super(message);
    }
    public CasePleineException(String message,Throwable a)
    {
        super(message,a);
    }
    public CasePleineException(String message, Throwable a,boolean b,boolean c)
    {
        super(message,a,b,c);
    }
}