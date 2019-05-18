package petitsChevaux;

import java.util.ArrayList;

public class Plateau
{
    /**
     * liste des cases qui composent le tour du plateau (56 case)
     * @see CaseDeChemin
     */
    private ArrayList<CaseDeChemin> chemin = new ArrayList<CaseDeChemin>();

    /**
     * liste des cases d'écurie (4 cases)
     * @see CaseEcurie
     */
    private ArrayList<CaseEcurie> ecurie = new ArrayList<CaseEcurie>();

    /**
     * liste des echelles composées de case (6 cases)
     * @see CaseDEchelle
     */
    private ArrayList<ArrayList<CaseDEchelle>> echelles = new ArrayList<ArrayList<CaseDEchelle>>();

    /**
     * Constructeur de plateau
     */
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

    /**
     * retourne la liste des cases d'écuries
     * @see CaseEcurie
     * @return retourne une ArrayList des cases d'écuries
     */
    public ArrayList<CaseEcurie> getEcurie()
    {
        return this.ecurie;
    }

    /**
     * retourne la liste des cases du chemin
     * @see CaseDEchelle
     * @return retourne une ArrayListe des cases de chemin
     */
    public ArrayList<CaseDeChemin> getChemin()
    {
        return this.chemin;
    }

    /**
     * retourne la liste des echelles composées de cases d'echelles
     * @see CaseDEchelle
     * @return retourne une ArrayList d'ArrayList de cases d'echelles
     */
    public ArrayList<ArrayList<CaseDEchelle>> getEchelles()
    {
        return this.echelles;
    }

    /**
     * affiche le plateau de jeu avec les ecuries de chaques joueurs, le chemin et les echelles de chaques joueurs
     */
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
                ecurie1+="["+this.ecurie.get(0).getChevaux().get(0).getCouleur().getSymbol()+"]";
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
                ecurie2+="["+this.ecurie.get(1).getChevaux().get(0).getCouleur().getSymbol()+"]";
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
                ecurie3+="["+this.ecurie.get(2).getChevaux().get(0).getCouleur().getSymbol()+"]";
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
                ecurie4+="["+this.ecurie.get(3).getChevaux().get(0).getCouleur().getSymbol()+"]";
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
                    plateau+="["+this.chemin.get(i).getChevaux().get(0).getCouleur().getSymbol()+"]";
                }
        }
        for(int j=0;j<this.echelles.get(0).size();j++)
        {
            if(this.echelles.get(0).get(j).getChevaux().isEmpty())
            {
                couloir1+="[-]";
            }
            else {
                couloir1+="["+this.getEchelles().get(0).get(j).getChevaux().get(0).getCouleur().getSymbol()+"]";
            }
        }
        for(int j=0;j<this.echelles.get(1).size();j++)
        {
            if(this.echelles.get(1).get(j).getChevaux().isEmpty())
            {
                couloir2+="[-]";
            }
            else {
                couloir2+="["+this.getEchelles().get(1).get(j).getChevaux().get(0).getCouleur().getSymbol()+"]";
            }
        }
        for(int j=0;j<this.echelles.get(2).size();j++)
        {
            if(this.echelles.get(2).get(j).getChevaux().isEmpty())
            {
                couloir3+="[-]";
            }
            else {
                couloir3+="["+this.getEchelles().get(2).get(j).getChevaux().get(0).getCouleur().getSymbol()+"]";
            }
        }
        for(int j=0;j<this.echelles.get(3).size();j++)
        {
            if(this.echelles.get(3).get(j).getChevaux().isEmpty())
            {
                couloir4+="[-]";
            }
            else {
                couloir4+="["+this.getEchelles().get(3).get(j).getChevaux().get(0).getCouleur().getSymbol()+"]";
            }
        }
        System.out.println("ecurie Jaune : "+ecurie1);
        System.out.println("ecurie Bleu  : "+ecurie2);
        System.out.println("ecurie Rouge : "+ecurie3);
        System.out.println("ecurie Vert  : "+ecurie4);
        System.out.println("plateau : "+plateau);
        System.out.println("echelle Jaune : "+couloir1);
        System.out.println("echelle Bleu  : "+couloir2);
        System.out.println("echelle Rouge : "+couloir3);
        System.out.println("echelle Vert  : "+couloir4);
    }

    /**
     * deplace le pion dans une liste d'une case
     * @see Case
     * @see Pion
     * @param pionAdeplacer elle prend en paramètre le pion a déplacer
     * @param caseDeDeplacement elle prend en paramètre la case qui va acceuillir le pion
     */
    public void deplacerPion(Pion pionAdeplacer,Case caseDeDeplacement)
    {
        try
        {
            if(caseDeDeplacement.getChevaux().size()>=4)
            {
                throw(new CasePleineException("la case est pleine"));
            }
            else
            {
                caseDeDeplacement.ajouteCheval(pionAdeplacer);
            }
        }
        catch (CasePleineException a)
        {
            System.err.println(a);
        }
    }
}