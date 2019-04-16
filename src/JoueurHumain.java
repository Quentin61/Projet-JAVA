import java.util.ArrayList;

public class JoueurHumain extends Joueur
{
    public JoueurHumain(String nom,Couleur couleur)
    {
        super(nom,couleur);
    }

    @Override
    public Pion choisirPion(int valeurDe, Plateau plateau)
    {
        ArrayList<Pion> pionBougeables= new ArrayList<Pion>();
        Pion pionjouer=null;
        for(int i=0;i<this.getChevaux().size();i++)
        {
            for(int j=0;j<plateau.getEcurie().size();j++)
            {
                for(int e=0;e<plateau.getEcurie().get(j).getChevaux().size();e++)
                {
                    if(plateau.getEcurie().get(j).peutPasser(this.getChevaux().get(i)) && valeurDe==6 && this.getChevaux().get(i)==plateau.getEcurie().get(j).getChevaux().get(e))
                    {
                        pionBougeables.add(this.getChevaux().get(i));
                    }
                }
            }
            /*for(int k=0;k<plateau.getChemin().size();k++)
            {
                for(int l=0;l<plateau.getChemin().get(k).getChevaux().size();l++)
                {
                    if(plateau.getChemin().get(k).getChevaux().get(l)==this.getChevaux().get(i))
                    {
                        while()
                        {
                            if()
                        }
                        if(plateau.getChemin().get(k+valeurDe).peutSArreter(this.getChevaux().get(i)))
                        {

                        }
                    }
                }
            }
            for(int m=0;m<plateau.getEchelles().size();m++)
            {
                if(plateau.getEchelles().get(m).get(1).getCouleur()==this.getChevaux().get(i).getCouleur())
                {
                    for(int n=0;n<plateau.getEchelles().get(m).size()-1;n++)
                    {
                        if(plateau.getEchelles().get(m).get(n).getChevaux().get(1)==this.getChevaux().get(i) && plateau.getEchelles().get(m).get(n+1).peutSArreter(this.getChevaux().get(i)))
                        {
                            pionBougeable.add(this.getChevaux().get(i));
                        }
                    }
                }
            }*/
        }
        if(pionBougeables.isEmpty())
        {
            return null;
        }
        else
        {
            pionjouer=pionBougeables.get(0);
            pionBougeables.clear();
            return pionjouer;
        }
    }
}