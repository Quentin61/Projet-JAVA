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
    public boolean peutPasser(Pion pion)
    {
        boolean peutPasser=false;
        if(this.getChevaux().isEmpty())
        {
            peutPasser=true;
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion)
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
        }
        return peutSArreter;
    }
}