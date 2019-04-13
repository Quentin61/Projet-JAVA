import java.util.ArrayList;

public class Plateau
{
    private ArrayList<CaseDeChemin> chemin;
    private ArrayList<CaseEcurie> ecurie;
    private ArrayList<ArrayList<CaseDEchelle>> echelles;

    public Plateau()
    {
        this.chemin= new ArrayList<CaseDeChemin>();
        this.ecurie= new ArrayList<CaseEcurie>();
        this.echelles= new ArrayList<ArrayList<CaseDEchelle>>();
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

    }
    public void deplacerPion(Pion pionAdeplacer,Case caseDeDeplacement)
    {

    }
}