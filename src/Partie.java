import java.util.ArrayList;

public class Partie
{
    private int de;
    private Joueur joueurCourant;
    private Plateau plateau;
    private ArrayList<Joueur> joueurs;
    public Partie()
    {
        this.de=(int)(Math.random()*7);
        this.joueurs=new ArrayList<Joueur>();
    }
    public void initialiserJoueur(int nombreDeJoueursHumain)
    {

    }
    public void initialiserPlateau()
    {

    }
    public int  lanceDe()
    {
        this.de=(int)(Math.random()*7);
        return this.de;
    }
    public void JouerUnTour()
    {

    }
    public boolean estPartieTermine()
    {

    }
    public Joueur getJoueurCourant()
    {
        return this.joueurCourant;
    }
    public void setJoueurCourant(Joueur joueurCourant)
    {
        this.joueurCourant=joueurCourant;
    }
    public Plateau getPlateau()
    {
        return this.plateau;
    }
    public ArrayList<Joueur> getJoueurs()
    {
        return this.joueurs;
    }
    public void mangerLesPions(Case CaseManger)
    {

    }
}