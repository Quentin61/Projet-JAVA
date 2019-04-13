import java.util.ArrayList;

public abstract class Case
{
    protected ArrayList<Pion> chevaux;
    public Case()
    {
        this.chevaux=new ArrayList<Pion>();
    }

    public ArrayList<Pion> getChevaux()
    {
        return this.chevaux;
    }
    public void ajouteCheval(Pion nouveauCheval)
    {
        this.chevaux.add(nouveauCheval);
    }
    public abstract boolean peutPasser(Pion pion);

    public abstract boolean peutSArreter(Pion pion);

}