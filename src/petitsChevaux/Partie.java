package petitsChevaux;

import java.util.Scanner;

import java.util.ArrayList;

public class Partie
{
    /**
     * le dé de la partie
     */
    private int de;

    /**
     * le joueur qui va jouer un tour
     * @see Joueur
     */
    private Joueur joueurCourant;

    /**
     * le plateau de la partie
     * @see Plateau
     */
    private Plateau plateau;

    /**
     * la liste des joueurs de la partie
     * @see Joueur
     */
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    /**
     * COnstructeur de la partie
     */
    public Partie()
    {
        this.de=(int)(Math.random()*6+1);
    }

    /**
     * initialise tous les joueurs de la partie (instanciation) et leurs chevaux
     * @param nombreDeJoueurs elle prend en paramètre le nombre de joueurs humains à instancier
     */
    public void initialiserJoueur(int nombreDeJoueurs) throws PasDeJoueursException
    {
        try
        {
            if(nombreDeJoueurs<=0)
            {
                throw(new PasDeJoueursException());
            }
            for (int i = 0; i < nombreDeJoueurs; i++) {
                Scanner scJoueur = new Scanner(System.in);
                System.out.print("Entrer votre nom du joueur " + (i + 1) + " : ");
                String nomJoueur = scJoueur.nextLine();
                this.joueurs.add(new JoueurHumain(nomJoueur, Couleur.values()[i]));
                this.joueurs.get(i).setCaseDeDepart(this.plateau.getChemin().get(i * 13));
                for (int k = 0; k < this.plateau.getEcurie().size(); k++) {
                    for (int j = 0; j < this.joueurs.get(i).getChevaux().size(); j++) {
                        if (this.plateau.getEcurie().get(k).getCouleur() == this.joueurs.get(i).getCouleur()) {
                            this.plateau.getEcurie().get(k).ajouteCheval(this.joueurs.get(i).getChevaux().get(j));
                        }
                    }
                }
            }
        }
        catch (PasDeJoueursException a)
        {
            System.out.println("Il n'y a pas de joueur");
            throw a;
        }
        setJoueurCourant(this.joueurs.get((int)(Math.random()*(this.joueurs.size()))));
    }

    /**
     * initialise un nouveau plateau (instanciation)
     */
    public void initialiserPlateau()
    {
        this.plateau=new Plateau();
    }

    /**
     * tire un chiffre entre 1 et 6 inclus
     * @return elle retourne la valeur du de
     */
    private int  lanceDe()
    {
        this.de=(int)(Math.random()*6+1);
        return this.de;
    }

    /**
     * méthode qui permet de jouer un tour et qui gère le déplacement des pions
     */
    public void JouerUnTour()
    {
        System.out.println(this.joueurCourant.getNom()+" joue !");
        lanceDe();
        System.out.println(this.joueurCourant.getNom()+" joue et fait un "+this.de);
        Pion pionJouer=this.joueurCourant.choisirPion(this.de,this.plateau);

        int endroitPionJouer=0;
        Boolean pionDejaJouer=false;

        for(int i=0;i<this.plateau.getEcurie().size();i++)
        {
            if(this.plateau.getEcurie().get(i).getChevaux().contains(pionJouer))
            {
                endroitPionJouer=1;
            }
        }
        for(int i=0;i<this.plateau.getChemin().size();i++)
        {
            if(this.plateau.getChemin().get(i).getChevaux().contains(pionJouer))
            {
                endroitPionJouer=2;
            }
        }
        for(int i=0;i<this.plateau.getEchelles().size();i++)
        {
            for(int j=0;j<this.plateau.getEchelles().get(i).size();j++)
            {
                if(this.plateau.getEchelles().get(i).get(j).getChevaux().contains(pionJouer))
                {
                    endroitPionJouer=3;
                }
            }
        }
        switch(endroitPionJouer)
        {
            case (0):
            {
                System.out.println("Vous ne pouvez pas jouer de pions");
                break;
            }
            case (1):
            {
                try
                {
                    for (int j = 0; j < this.plateau.getEcurie().size(); j++) {
                        for (int k = 0; k < this.plateau.getEcurie().get(j).getChevaux().size(); k++) {
                            if (pionJouer == this.plateau.getEcurie().get(j).getChevaux().get(k)) {
                                this.plateau.getEcurie().get(j).getChevaux().remove(k);
                                if (!this.joueurCourant.getCaseDeDepart().peutSArreter(pionJouer)) {
                                    mangerLesPions(this.joueurCourant.getCaseDeDepart());
                                }
                                this.plateau.deplacerPion(pionJouer, this.joueurCourant.getCaseDeDepart());
                            }
                        }
                    }
                }
                catch(CasePleineException a)
                {
                    System.err.println(a);
                }
                break;
            }
            case (2):
            {
                for(int l=0;l<this.plateau.getChemin().size();l++) {
                    if(pionDejaJouer)
                    {
                        break;
                    }
                    for (int m = 0; m < this.plateau.getChemin().get(l).getChevaux().size(); m++) {
                        if (this.plateau.getChemin().get(l).getChevaux().contains(pionJouer)) {
                            this.plateau.getChemin().get(l).getChevaux().remove(m);
                            if(l+1<55)
                            {
                                if(this.getJoueurCourant().getCaseDeDepart()==this.plateau.getChemin().get(l+1))
                                {
                                    for(int o=0;o<this.plateau.getEchelles().size();o++)
                                    {
                                        if(this.plateau.getEchelles().get(o).get(0).getCouleur()==this.joueurCourant.getCouleur())
                                        {
                                            this.plateau.getEchelles().get(o).get(0).ajouteCheval(pionJouer);
                                            pionDejaJouer=true;
                                        }
                                    }
                                }
                            }
                            if (l+1>55)
                            {
                                if(this.getJoueurCourant().getCaseDeDepart()==this.plateau.getChemin().get(0))
                                {
                                    for(int o=0;o<this.plateau.getEchelles().size();o++)
                                    {
                                        if(this.plateau.getEchelles().get(o).get(0).getCouleur()==this.joueurCourant.getCouleur())
                                        {
                                            this.plateau.getEchelles().get(o).get(0).ajouteCheval(pionJouer);
                                            pionDejaJouer=true;
                                        }
                                    }
                                }
                            }
                            if (l + this.de > 55 && !pionDejaJouer) {
                                if (!this.plateau.getChemin().get(l + this.de - 55).getChevaux().isEmpty()) {
                                    mangerLesPions(this.plateau.getChemin().get(l + this.de - 55));
                                }
                                this.plateau.getChemin().get(l + this.de - 55).ajouteCheval(pionJouer);
                                pionDejaJouer=true;
                            } else if(l +this.de<=55 && !pionDejaJouer){
                                if (!this.plateau.getChemin().get(l + this.de).getChevaux().isEmpty()) {
                                    mangerLesPions(this.plateau.getChemin().get(l + this.de));
                                }
                                this.plateau.getChemin().get(l + this.de).ajouteCheval(pionJouer);
                                pionDejaJouer=true;
                            }
                        }
                    }
                }
                break;
            }
            case (3):
            {
                for(int i=0;i<this.plateau.getEchelles().size();i++)
                {
                    for(int j=0;j<this.plateau.getEchelles().get(i).size();j++)
                    {
                        if(this.plateau.getEchelles().get(i).get(j).getChevaux().contains(pionJouer) && !pionDejaJouer)
                        {
                            this.plateau.getEchelles().get(i).get(j).getChevaux().remove(pionJouer);
                            this.plateau.getEchelles().get(i).get(j+1).ajouteCheval(pionJouer);
                            if(this.plateau.getEchelles().get(i).get(j+1)==this.plateau.getEchelles().get(i).get(5))
                            {
                                this.plateau.getEchelles().get(i).get(j+1).getChevaux().remove(pionJouer);
                                this.joueurCourant.getChevaux().remove(pionJouer);
                                System.out.println("le pion a été retiré du jeu !");
                            }
                            pionDejaJouer=true;
                        }
                    }
                }
                break;
            }
        }
        this.plateau.afficher();
        if(this.de!=6)
        {
            for(int i=0;i<joueurs.size();i++)
            {
                if(this.joueurCourant==joueurs.get(i))
                {
                    if(i==this.joueurs.size()-1)
                    {
                        this.joueurCourant=joueurs.get(0);
                        break;
                    }
                    else {
                        this.joueurCourant=joueurs.get(i+1);
                        break;
                    }
                }
            }
        }
    }

    /**
     * verifie si la partie est terminée (si un joueur n'a plus de pion)
     * @return elle retourne un boolean
     */
    public boolean estPartieTermine()
    {
        boolean partieTerminer=false;
        for(int i=0;i<this.joueurs.size();i++)
        {
            if(this.joueurs.get(i).getChevaux().isEmpty())
            {
                partieTerminer=true;
                System.out.println("le "+this.joueurs.get(i).getNom()+" a gagné !");
            }
        }
        return partieTerminer;
    }

    /**
     * retourne le joueur qui joue le tour actuel
     * @see Joueur
     * @return elle retourne un type Joueur
     */
    public Joueur getJoueurCourant()
    {
        return this.joueurCourant;
    }

    /**
     * méthode qui permet de mofifier le joueur qui joue le tour
     * @param joueurCourant elle prend en paramètre un type Joueur
     * @see Joueur
     */
    public void setJoueurCourant(Joueur joueurCourant)
    {
        this.joueurCourant=joueurCourant;
    }

    /**
     * retourne le plateau de la partie
     * @return elle retourne un type Plateau
     * @see Plateau
     */
    public Plateau getPlateau()
    {
        return this.plateau;
    }

    /**
     * retourne la liste des joueurs de la partie
     * @return elle retourne une ArrayList de Joueurs
     * @see Joueur
     */
    public ArrayList<Joueur> getJoueurs()
    {
        return this.joueurs;
    }

    /**
     *  méthode qui permet de renvoyer à l'écurie tous les pions d'une case
     * @param CaseManger elle prend en paramètre la case à laquelle on retire tous les pions
     * @see Case
     */
    private void mangerLesPions(Case CaseManger)
    {
        for(int j=0;j<plateau.getEcurie().size();j++)
        {
            for(int i=0;i<CaseManger.getChevaux().size();i++)
            {
                if (this.plateau.getEcurie().get(j).getCouleur()==CaseManger.getChevaux().get(i).getCouleur())
                {
                    this.plateau.getEcurie().get(j).ajouteCheval(CaseManger.getChevaux().get(i));
                }
            }
        }
        CaseManger.getChevaux().clear();
    }
}