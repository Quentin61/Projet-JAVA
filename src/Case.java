import java.util.ArrayList;

public abstract class Case
{
    ArrayList<Pion> chevaux;
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
    public boolean peutPasser(Pion pion)
    {

    }
    public boolean peutSarreter(Pion pion)
    {

    }

}