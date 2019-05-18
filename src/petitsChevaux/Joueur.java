package petitsChevaux;

import java.util.ArrayList;

public abstract class Joueur
{
    /**
     * le nom du joueur (String)
     */
    private String nom;

    /**
     * La liste de pions du joueur
     */
    private ArrayList<Pion> chevaux = new ArrayList<Pion>();

    /**
     * la case de depart propre à chaque joueur
     */
    private Case caseDeDepart;

    /**
     * la couleur propre à chaque joueur
     */
    private Couleur couleur;

    /**
     * Constructeur de joueur
     * @param nom il prend un type String
     * @param couleur il prend un type Couleur
     * @see Couleur
     */
    public Joueur(String nom,Couleur couleur)
    {
        this.nom=nom;
        this.couleur=couleur;
        for(int i=0;i<4;i++)
        {
            String id="pion "+(i+1);
            this.chevaux.add(new Pion(id,this.couleur));
        }
    }

    /**
     * retourne la case de depart du joueur
     * @return retourne un type case
     * @see Case
     */
    public Case getCaseDeDepart()
    {
        return this.caseDeDepart;
    }

    /**
     * méthode qui changer/initialiser la case de depart
     * @param caseDeDepart elle prend en paramètre un type Case
     * @see Case
     */
    public void setCaseDeDepart(Case caseDeDepart)
    {
        this.caseDeDepart = caseDeDepart;
    }

    /**
     * retourne la liste des chevaux du joueur
     * @return retourne une ArrayList de Pions
     * @see Pion
     */
    public ArrayList<Pion> getChevaux()
    {
        return this.chevaux;
    }

    /**
     * retourne le nom du joueur
     * @return elle retourne un type String
     */
    public String getNom()
    {
        return this.nom;
    }

    /**
     * méthode qui permet de mettre/initialiser le nom du joueur
     * @param nom prend en paramètre le nouveau nom du joueur
     */
    public void setNom(String nom)
    {
        this.nom=nom;
    }

    /**
     * retourne la couleur du joueur
     * @return retourne un type Couleur
     * @see Couleur
     */
    public Couleur getCouleur()
    {
        return this.couleur;
    }

    /**
     * méthode qui permet de montrer et de faire choisir au joueur les pions bougeables
     * @param valeurDe elle prend en paramètre un int qui est la valeur du dé
     * @param plateau elle prend en paramètre un type Plateau
     * @return elle retourne un type pion (pion joué par le joueur)
     * @see Plateau
     * @see Pion
     */
    public abstract Pion choisirPion(int valeurDe,Plateau plateau);
}
