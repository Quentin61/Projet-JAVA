package petitsChevaux;

import java.util.ArrayList;

public class JoueurBot extends Joueur
{
    public JoueurBot(String nom,Couleur couleur)
    {
        super(nom,couleur);
    }

    @Override
    public Pion choisirPion(int valeurDe, Plateau plateau)
    {
        ArrayList<Pion> pionBougeables= new ArrayList<Pion>();
        Pion pionjouer=null;
        try
        {
            for(int i=0;i<this.getChevaux().size();i++) // on recherche pour chaque pions du joueur si il est déplaçable dans les 3 parties du plateau//
            {
                //recherche dans l'écurie//
                for(int j=0;j<plateau.getEcurie().size();j++)
                {
                    if(valeurDe==6 && plateau.getEcurie().get(j).getChevaux().contains(this.getChevaux().get(i)))
                    {
                        pionBougeables.add(this.getChevaux().get(i));
                    }
                }
                //recherche dans le plateau//
                for(int k=0;k<plateau.getChemin().size();k++)
                {
                    for(int l=0;l<plateau.getChemin().get(k).getChevaux().size();l++)
                    {
                        if(plateau.getChemin().get(k).getChevaux().contains(this.getChevaux().get(i)))
                        {
                            if(plateau.getChemin().get((k+1)%56)==this.getCaseDeDepart() && plateau.getChemin().get(k%56).getChevaux().contains(this.getChevaux().get(i)) && valeurDe==1)
                            {
                                for(int p=0;p<plateau.getEchelles().size();p++)
                                {
                                    if(this.getCouleur()==plateau.getEchelles().get(p).get(0).getCouleur() && plateau.getEchelles().get(p).get(0).getChevaux().isEmpty())
                                    {
                                        pionBougeables.add(this.getChevaux().get(i));
                                    }
                                }
                            }
                            for(int m=1;m<valeurDe+1;m++) //boucle qui vérifie que toutes les cases traversées sont traversables//
                            {
                                if(m==valeurDe && plateau.getChemin().get((k+m)%56)!=this.getCaseDeDepart())
                                {
                                    pionBougeables.add(this.getChevaux().get(i));
                                }
                                if (!plateau.getChemin().get((k+m)%56).peutPasser(this.getChevaux().get(i)) || plateau.getChemin().get((k+m)%56)==this.getCaseDeDepart())
                                {
                                    break;
                                }
                            }
                        }
                    }
                }
                //recherche dans les échelles//
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
        }
        catch (CasePleineException a)
        {
            System.err.println(a);
        }
        if(pionBougeables.isEmpty())
        {
            return null;
        }
        else
        {
            return pionBougeables.get(0);
        }
    }
}
