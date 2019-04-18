import java.util.ArrayList;

public class JoueurHumain extends Joueur
{
    /**
     * Constructeur de JoueurHumain
     * @param nom il prend en paramètre un String
     * @param couleur il prend en paramètre un type Couleur
     * @see Couleur
     */
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
                    if(valeurDe==6 && plateau.getEcurie().get(j).getChevaux().contains(this.getChevaux().get(i)))
                    {
                        pionBougeables.add(this.getChevaux().get(i));
                    }
                }
            }
            for(int k=0;k<plateau.getChemin().size();k++)
            {
                for(int l=0;l<plateau.getChemin().get(k).getChevaux().size();l++)
                {
                    if(plateau.getChemin().get(k).getChevaux().contains(this.getChevaux().get(i)))
                    {
                        if(k+1<=55)
                        {
                            if(plateau.getChemin().get(k+1)==this.getCaseDeDepart() && plateau.getChemin().get(k).getChevaux().contains(this.getChevaux().get(i)) && valeurDe==1)
                            {
                                for(int p=0;p<plateau.getEchelles().size();p++)
                                {
                                    if(this.getCouleur()==plateau.getEchelles().get(p).get(0).getCouleur() && plateau.getEchelles().get(p).get(0).getChevaux().isEmpty())
                                    {
                                        pionBougeables.add(this.getChevaux().get(i));
                                    }
                                }
                            }
                        }
                        else
                        {
                            if(plateau.getChemin().get(0)==this.getCaseDeDepart() && plateau.getChemin().get(k).getChevaux().contains(this.getChevaux().get(i)) && valeurDe==1)
                            {
                                for(int p=0;p<plateau.getEchelles().size();p++)
                                {
                                    if(this.getCouleur()==plateau.getEchelles().get(p).get(0).getCouleur() && plateau.getEchelles().get(p).get(0).getChevaux().isEmpty())
                                    {
                                        pionBougeables.add(this.getChevaux().get(i));
                                    }
                                }
                            }
                        }
                        for(int m=1;m<valeurDe+1;m++)
                        {

                            if(k+m<=55)
                            {
                                if(m==valeurDe && plateau.getChemin().get(k+1)!=this.getCaseDeDepart())
                                {
                                    pionBougeables.add(this.getChevaux().get(i));
                                }
                                else if (!plateau.getChemin().get(k+m).peutPasser(this.getChevaux().get(i)) || plateau.getChemin().get(k+m)==this.getCaseDeDepart())
                                {
                                    break;
                                }
                            }
                            if(k+m>55)
                            {
                                if(m==valeurDe && plateau.getChemin().get(0)!=this.getCaseDeDepart())
                                {
                                    pionBougeables.add(this.getChevaux().get(i));
                                }
                                else if (!plateau.getChemin().get(k+m-56).peutPasser(this.getChevaux().get(i)) || plateau.getChemin().get(k+m-56)==this.getCaseDeDepart())
                                {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
             for(int m=0;m<plateau.getEchelles().size();m++)
            {
                if(plateau.getEchelles().get(m).get(0).getCouleur()==this.getChevaux().get(i).getCouleur())
                {
                    for(int n=0;n<plateau.getEchelles().get(m).size()-1;n++)
                    {
                        if(!plateau.getEchelles().get(m).get(n).getChevaux().isEmpty())
                        {
                            if(plateau.getEchelles().get(m).get(n).getChevaux().get(0)==this.getChevaux().get(i) && plateau.getEchelles().get(m).get(n+1).peutSArreter(this.getChevaux().get(i)) && valeurDe==n+2)
                            {
                                pionBougeables.add(this.getChevaux().get(i));
                            }
                        }
                    }
                }
            }
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