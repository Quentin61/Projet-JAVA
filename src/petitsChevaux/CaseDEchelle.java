package petitsChevaux;

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
    public boolean peutPasser(Pion pion) throws CasePleineException
    {
        Boolean peutPasser=false;
        if(this.getChevaux().isEmpty())
        {
            peutPasser=true;
        }
        else
        {
            throw(new CasePleineException("Une case sur le chemin n'est pas vide !"));
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion) throws CasePleineException
    {
        Boolean peutSArreter=false;
        if(this.getChevaux().isEmpty())
        {
            peutSArreter=true;
        }
        else
        {
            throw(new CasePleineException("La case n'est pas vide !"));
        }
        return peutSArreter;
    }
}