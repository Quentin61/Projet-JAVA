public class CaseDEchelle extends CaseColoree
{
    /**
     * contructeur qui hérite de CaseColoree
     * @see CaseColoree
     * @see Couleur
     * @param couleur prend en paramètre un type Couleur
     */
    public CaseDEchelle(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean peutPasser(Pion pion)
    {
        Boolean peutPasser=false;
        if(this.getChevaux().isEmpty())
        {
            peutPasser=true;
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion)
    {
        Boolean peutSArreter=false;
        if(this.getChevaux().isEmpty())
        {
            peutSArreter=true;
        }
        return peutSArreter;
    }
}