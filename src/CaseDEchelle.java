public class CaseDEchelle extends CaseColoree
{
    /**
     * contructeur qui hérite de CaseColoree
     * @see CaseColoree
     * @see Couleur
     * @param couleur prend en paramêtre un type Couleur
     */
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