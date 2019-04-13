public class CaseDeChemin extends Case
{
    public CaseDeChemin()
    {
        super();
    }

    @Override
    public boolean peutPasser(Pion pion)
    {
        boolean peutPasser=false;
        for(int i=0;i<this.getChevaux().size();i++)
        {
            if (this.getChevaux().get(i)==null)
            {
                peutPasser=true;
            }
        }
        return peutPasser;
    }

    @Override
    public boolean peutSArreter(Pion pion)
    {
        boolean peutSArreter=false;
        for(int i=0;i<this.getChevaux().size();i++)
        {
            if(this.getChevaux().get(i)==null)
            {
                peutSArreter=true;
            }
            else if (this.getChevaux().get(i).getCouleur()==pion.getCouleur())
            {
                peutSArreter=true;
            }
        }
        return peutSArreter;
    }
}