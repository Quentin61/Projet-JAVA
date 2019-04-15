import java.util.ArrayList;

public abstract class Joueur
{
    private String nom;
    private ArrayList<Pion> chevaux = new ArrayList<Pion>();
    private Case caseDeDepart;
    private Couleur couleur;

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
    public Case getCaseDeDepart()
    {
        return this.caseDeDepart;
    }
    public void setCaseDeDepart(Case caseDeDepart)
    {
        this.caseDeDepart = caseDeDepart;
    }
    public ArrayList<Pion> getChevaux()
    {
        return this.chevaux;
    }
    public String getNom()
    {
        return this.nom;
    }
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public Couleur getCouleur()
    {
        return this.couleur;
    }
    public abstract Pion choisirPion(int numeroPion,Plateau plateau);
}
