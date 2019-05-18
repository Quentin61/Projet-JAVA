package petitsChevaux;

import java.util.ArrayList;

public abstract class Case
{
    /**
     *  La liste contenant tous les pions de la case
     * @see Pion
     */
    protected ArrayList<Pion> chevaux;
    public Case()
    {
        this.chevaux=new ArrayList<Pion>();
    }

    /**
     * retourne un tableau contenant tous les chevaux de la classe
     * @see Pion
     * @return  elle retourne un arrayList de Pion
     */
    public ArrayList<Pion> getChevaux()
    {
        return this.chevaux;
    }

    /**
     * ajoute un cheval à la case dans un tableau de Pion
     * @see Pion
     * @param nouveauCheval elle prend en paramêtre un Pion
     */
    public void ajouteCheval(Pion nouveauCheval)
    {
        this.chevaux.add(nouveauCheval);
    }

    /**
     * indique si un pion peut passer par la case
     * @see Pion
     * @param pion elle prend en paramètre un pion
     * @return elle retourne un boolean qui indique si le pion peut passer par la case ou non
     * @throws CasePleineException peut lever un exception si la case est pleine (plus de 4 joueurs)
     */
    public abstract boolean peutPasser(Pion pion) throws CasePleineException;

    /**
     * indique si un pion peut s'arreter sur la case (être stoké)
     * @see Pion
     * @param pion elle prend en paramètre un pion
     * @return elle retourne un boolean qui indique si le pion peut s'arreter sur la case (être stocké)
     * @throws CasePleineException peut lever un exception si la case est pleine (plus de 4 joueurs)
     */
    public abstract boolean peutSArreter(Pion pion) throws CasePleineException;

}