public class PetitsChevaux
{
    public PetitsChevaux()
    {

    }
    public static void main(String argc[])
    {
        Partie partie= new Partie();
        partie.initialiserPlateau();
        partie.initialiserJoueur(4);
        while (!partie.estPartieTermine())
        {
            partie.JouerUnTour();
        }
    }

}