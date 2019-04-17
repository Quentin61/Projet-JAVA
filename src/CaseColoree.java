public abstract class CaseColoree extends Case
{
    /**
     * La couleur de case pour les cases echelle et les cases ecurie
     */
    private Couleur couleur;

    /**
     * Constructeur qui prend les mêmes attributs que Case avec un la couleur en paraètre suplémentaire
     * @see Case
     * @see Couleur
     * @param couleur elle prend en paramètre une couleur de l'enumeration Couleur
     */
    public CaseColoree(Couleur couleur)
    {
        super();
        this.couleur=couleur;
    }

    /**
     * retourne la couleur de la case
     * @see Couleur
     * @return retourne un type couleur venant de l'énumeration Couleur
     */
    public Couleur getCouleur()
    {
        return this.couleur;
    }

    @Override
    public abstract boolean peutPasser(Pion pion);

    @Override
    public abstract boolean peutSArreter(Pion pion);
}