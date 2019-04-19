import java.util.Scanner;

public class PetitsChevaux
{
    /**
     * Constructeur vide du jeu
     */
    public PetitsChevaux()
    {

    }

    /**
     * méthode main du programme
     * @param argc
     */
    public static void main(String argc[])
    {
        Joueur JoueurQuiRejoue;
        Partie partie= new Partie();
        partie.initialiserPlateau();
        Scanner scChoix = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("|  Jeux des petits chevaux  |");
        System.out.println("|                           |");
        System.out.println("-----------------------------");
        System.out.println(" ");
        System.out.println("1 - Commencer ");
        System.out.println(" ");
        System.out.println("2 - Quitter ");
        System.out.println(" ");
        System.out.print("Votre choix : ");
        int choix = scChoix.nextInt();
        while(choix<1 || choix>2)
        {
            System.out.println("Ce choix est indisponible");
            System.out.println(" ");
            System.out.print("Votre choix : ");
            choix = scChoix.nextInt();
        }
        if(choix==1)
        {
            Scanner scNombreJoueur = new Scanner(System.in);
            System.out.print("Entrer le nombre de joueurs : ");
            int NombreDeJoueurs = scNombreJoueur.nextInt();
            while(NombreDeJoueurs<1 || NombreDeJoueurs>4)
            {
                System.out.println("le nombre de joueurs n'est pas compris entre 0 et 4");
                System.out.print("Entrer le nombre de joueurs : ");
                NombreDeJoueurs = scNombreJoueur.nextInt();
            }
            partie.initialiserJoueur(NombreDeJoueurs);
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

}