import java.util.ArrayList;

public class Plateau
{
    private ArrayList<CaseDeChemin> chemin = new ArrayList<CaseDeChemin>();
    private ArrayList<CaseEcurie> ecurie = new ArrayList<CaseEcurie>();
    private ArrayList<ArrayList<CaseDEchelle>> echelles = new ArrayList<ArrayList<CaseDEchelle>>();

    public Plateau()
    {
        for(int i=0;i<56;i++)
        {
            this.chemin.add(new CaseDeChemin());
        }
        for(int i=0;i<4;i++)
        {
            this.ecurie.add(new CaseEcurie(Couleur.values()[i]));
        }
        for(int i=0;i<4;i++)
        {
            this.echelles.add(new ArrayList<CaseDEchelle>());
            for(int j=0;j<6;j++)
            {
                this.echelles.get(i).add(new CaseDEchelle(Couleur.values()[i]));
            }
        }
    }

    public ArrayList<CaseEcurie> getEcurie()
    {
        return this.ecurie;
    }
    public ArrayList<CaseDeChemin> getChemin()
    {
        return this.chemin;
    }
    public ArrayList<ArrayList<CaseDEchelle>> getEchelles()
    {
        return this.echelles;
    }
    public void afficher()
    {
        System.out.println(this.ecurie);
        System.out.println(this.chemin);
        System.out.println(this.echelles);
    }
    public void deplacerPion(Pion pionAdeplacer,Case caseDeDeplacement)
    {
        caseDeDeplacement.ajouteCheval(pionAdeplacer);
    }
}