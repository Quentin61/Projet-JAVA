public class CaseDEchelle extends CaseColoree
{
    public CaseDEchelle(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean peutPasser(Pion pion)
    {
        Boolean peutPasser=false;
        if(this.getChevaux().get(1)==null)
        {
            peutPasser=true;
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion)
    {
        Boolean peutSArreter=false;
        if(this.getChevaux().get(1)==null)
        {
            peutSArreter=true;
        }
        return peutSArreter;
    }
}