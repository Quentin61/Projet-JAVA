public class CaseEcurie extends CaseColoree
{
    public CaseEcurie(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean peutPasser(Pion pion)
    {
        Boolean peutPasser=false;
        if(this.getCouleur()==pion.getCouleur())
        {
            peutPasser=true;
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion)
    {
        Boolean peutPasser=false;
        if(this.getCouleur()==pion.getCouleur())
        {
            peutPasser=true;
        }
        return peutPasser;
    }
}