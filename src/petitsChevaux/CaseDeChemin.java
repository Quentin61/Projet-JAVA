package petitsChevaux;

public class CaseDeChemin extends Case
{
    /**
     * constructeur qui hérite de Case
     * @see Case
     */
    public CaseDeChemin()
    {
        super();
    }

    @Override
    public boolean peutPasser(Pion pion) throws CasePleineException
    {
        boolean peutPasser=false;
        if(this.getChevaux().isEmpty())
        {
            peutPasser=true;
        }
        else
        {
            throw(new CasePleineException("Une case du chemin n'est pas vide !"));
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion) throws CasePleineException
    {
        boolean peutSArreter=false;
        if(this.getChevaux().isEmpty())
        {
            peutSArreter=true;
        }
        for(int i=0;i<this.getChevaux().size();i++)
        {
            if (this.getChevaux().get(i).getCouleur()==pion.getCouleur())
            {
                peutSArreter=true;
            }
            else
            {
                throw(new CasePleineException("Un autre cheval de couleur est sur la case !"));
            }
        }
        return peutSArreter;
    }
}