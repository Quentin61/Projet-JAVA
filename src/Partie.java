import java.util.ArrayList;

public class Partie
{
    private int de;
    private Joueur joueurCourant;
    private Plateau plateau;
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
    public Partie()
    {
        this.de=(int)(Math.random()*7);
    }
    public void initialiserJoueur(int nombreDeJoueurs)
    {
        for(int i=0; i<nombreDeJoueurs;i++)
        {
            this.joueurs.add(new JoueurHumain("joueur "+(i+1), Couleur.values()[i]));
            this.joueurs.get(i).setCaseDeDepart(this.plateau.getChemin().get(i*14));
            for(int k=0;k<this.plateau.getEcurie().size();k++)
            {
                for(int j=0;j<this.joueurs.get(i).getChevaux().size();j++)
                {
                    if(this.plateau.getEcurie().get(k).getCouleur()==this.joueurs.get(i).getCouleur())
                    {
                        this.plateau.getEcurie().get(k).ajouteCheval(this.joueurs.get(i).getChevaux().get(j));
                    }
                }
            }
        }
        setJoueurCourant(this.joueurs.get((int)(Math.random()*(this.joueurs.size()))));
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
    {/*
        lanceDe();
        Pion pionJouer=this.joueurCourant.choisirPion(this.de,this.plateau);
        if(pionJouer==null)
        {
            System.out.println("Vous ne pouvez pas bouger de pions");
            for(int i=0;i<joueurs.size();i++)
            {
                if(this.joueurCourant==joueurs.get(i))
                {
                    if(i==4)
                    {
                        this.joueurCourant=joueurs.get(1);
                    }
                    else
                    {
                        this.joueurCourant=joueurs.get(i+1);
                    }
                }
            }

        }
        else
        {
            for(int j=0;j<this.plateau.getEcurie().size();j++)
            {
                for(int k=0;k<this.plateau.getEcurie().get(j).getChevaux().size();k++)
                {
                    if(pionJouer==this.plateau.getEcurie().get(j).getChevaux().get(k))
                    {
                        this.plateau.getEcurie().get(j).getChevaux().remove(k);
                        this.plateau.deplacerPion(pionJouer,this.joueurCourant.getCaseDeDepart());
                    }
                }
            }

        }*/
    }
    public boolean estPartieTermine()
    {
        boolean partieTerminer=false;
        for(int i=0;i<this.joueurs.size();i++)
        {
            if(this.joueurs.get(i).getChevaux().isEmpty())
            {
                partieTerminer=true;
            }
        }
        return partieTerminer;
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