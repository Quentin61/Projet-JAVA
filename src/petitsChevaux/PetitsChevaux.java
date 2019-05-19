package petitsChevaux;

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
     * @param argc peut prendre des arguments
     * @throws PasDeJoueursException lève une exception lorsque il n'y a pas de joueur
     */
    public static void main(String argc[]) throws PasDeJoueursException {
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
            while(NombreDeJoueurs<0 || NombreDeJoueurs>4)
            {
                System.out.println("le nombre de joueurs n'est pas compris entre 0 et 4");
                System.out.print("Entrer le nombre de joueurs : ");
                NombreDeJoueurs = scNombreJoueur.nextInt();
            }
            partie.initialiserJoueur (NombreDeJoueurs);
            while (!partie.estPartieTermine())
            {
                partie.JouerUnTour();
            }
        }
    }

}