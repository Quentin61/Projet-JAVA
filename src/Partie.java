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
    public void initialiserJoueur(int nombreDeJoueurs)
    {
        for(int i=0; i<nombreDeJoueurs;i++)
        {
            this.joueurs.add(new JoueurHumain("joueur", Couleur.values()[i]));
        }
    }
    public void initialiserPlateau()
    {
        this.plateau=new Plateau();
    }
    private int  lanceDe()
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
    private void mangerLesPions(Case CaseManger)
    {
        for(int i=0;i<CaseManger.getChevaux().size();i++)
        {
            if (this.plateau.getEcurie().get(i).getCouleur()==CaseManger.getChevaux().get(i).getCouleur())
            {
                this.plateau.getEcurie().get(i).ajouteCheval(CaseManger.getChevaux().get(i));
            }
            CaseManger.getChevaux().clear();
        }
    }
}