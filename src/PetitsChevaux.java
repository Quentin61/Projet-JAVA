public class PetitsChevaux
{
    public PetitsChevaux()
    {

    }
    public static void main(String argc[])
    {
        Joueur JoueurQuiRejoue;
        Partie partie= new Partie();
        partie.initialiserPlateau();
        partie.initialiserJoueur(4);
        while (!partie.estPartieTermine())
        {
            JoueurQuiRejoue=partie.getJoueurCourant();
            partie.JouerUnTour();
            if(JoueurQuiRejoue==partie.getJoueurCourant())
            {
                System.out.println(partie.getJoueurCourant().getNom()+" rejoue !");
                partie.JouerUnTour();
                if(JoueurQuiRejoue==partie.getJoueurCourant())
                {
                    for(int i=0;i<partie.getJoueurs().size();i++)
                    {
                        if(partie.getJoueurCourant()==partie.getJoueurs().get(i))
                        {
                            if(i==partie.getJoueurs().size()-1)
                            {
                                partie.setJoueurCourant(partie.getJoueurs().get(0));
                                break;
                            }
                            else {
                                partie.setJoueurCourant(partie.getJoueurs().get(i+1));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

}