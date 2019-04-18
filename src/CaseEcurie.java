public class CaseEcurie extends CaseColoree
{
    /**
     * constructeur qui hérite de CaseColoree
     * @see CaseColoree
     * @see Couleur
     * @param couleur prend en paramètre un type couleur
     */
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