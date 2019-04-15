public class JoueurHumain extends Joueur
{
    public JoueurHumain(String nom,Couleur couleur)
    {
        super(nom,couleur);
    }

    @Override
    public Pion choisirPion(int valeurDe, Plateau plateau)
    {/**
        for(int i=0;i<this.getChevaux().size();i++)
        {
            for(int j=0;j<plateau.getEcurie().size();j++)
            {
                if(plateau.getEcurie().get(j).peutPasser(this.getChevaux().get(i)) && valeurDe==6)
                {
                    ////afficher joueur////
                }
            }
            for(int k=0;k<plateau.getChemin().size();k++)
            {
                for(int l=0;l<plateau.getChemin().get(k).getChevaux().size();l++)
                {
                    if(plateau.getChemin().get(k).getChevaux().get(l)==this.getChevaux().get(i) && plateau.getChemin().get(k+valeurDe).peutSArreter(this.getChevaux().get(i)))
                    {

                    }
                }
            }
        }**/
        return null;
    }
}