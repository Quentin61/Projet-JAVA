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
        String ecurie1="";
        String ecurie2="";
        String ecurie3="";
        String ecurie4="";
        String plateau="";
        String couloir1="";
        String couloir2="";
        String couloir3="";
        String couloir4="";
        for(int i=0;i<this.ecurie.get(0).getChevaux().size();i++)
        {
            if(this.ecurie.get(0).getChevaux().isEmpty())
            {
                ecurie1+="[-]";
            }
            else
            {
                ecurie1+="[P]";
            }
        }
        for(int i=0;i<this.ecurie.get(1).getChevaux().size();i++)
        {
            if(this.ecurie.get(1).getChevaux().isEmpty())
            {
                ecurie2+="[-]";
            }
            else
            {
                ecurie2+="[P]";
            }
        }
        for(int i=0;i<this.ecurie.get(2).getChevaux().size();i++)
        {
            if(this.ecurie.get(2).getChevaux().isEmpty())
            {
                ecurie3+="[-]";
            }
            else
            {
                ecurie3+="[P]";
            }
        }
        for(int i=0;i<this.ecurie.get(3).getChevaux().size();i++)
        {
            if(this.ecurie.get(3).getChevaux().isEmpty())
            {
                ecurie4+="[-]";
            }
            else
            {
                ecurie4+="[P]";
            }
        }
        for(int i=0;i<this.chemin.size();i++)
        {
                if(this.chemin.get(i).getChevaux().isEmpty())
                {
                    plateau+="[-]";
                }
                else
                {
                    plateau+="[P]";
                }
        }
        for(int j=0;j<this.echelles.get(0).size();j++)
        {
            if(this.echelles.get(0).get(j).getChevaux().isEmpty())
            {
                couloir1+="[-]";
            }
            else {
                couloir1+="[P]";
            }
        }
        for(int j=0;j<this.echelles.get(1).size();j++)
        {
            if(this.echelles.get(1).get(j).getChevaux().isEmpty())
            {
                couloir2+="[-]";
            }
            else {
                couloir2+="[P]";
            }
        }
        for(int j=0;j<this.echelles.get(2).size();j++)
        {
            if(this.echelles.get(2).get(j).getChevaux().isEmpty())
            {
                couloir3+="[-]";
            }
            else {
                couloir3+="[P]";
            }
        }
        for(int j=0;j<this.echelles.get(3).size();j++)
        {
            if(this.echelles.get(3).get(j).getChevaux().isEmpty())
            {
                couloir4+="[-]";
            }
            else {
                couloir4+="[P]";
            }
        }
        System.out.println("ecurie 1 : "+ecurie1);
        System.out.println("ecurie 2 : "+ecurie2);
        System.out.println("ecurie 3 : "+ecurie3);
        System.out.println("ecurie 4 : "+ecurie4);
        System.out.println("plateau : "+plateau);
        System.out.println("echelle 1 : "+couloir1);
        System.out.println("echelle 2 : "+couloir2);
        System.out.println("echelle 3 : "+couloir3);
        System.out.println("echelle 4 : "+couloir4);
    }
    public void deplacerPion(Pion pionAdeplacer,Case caseDeDeplacement)
    {
        caseDeDeplacement.ajouteCheval(pionAdeplacer);
    }
}