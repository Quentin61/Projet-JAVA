public class Pion
{
    /**
     * id du pion qui ne pas être null
     */
    private final String id;

    /**
     * couleur du pion qui ne paut pas être null
     * @see Couleur
     */
    private Couleur couleur;

    /**
     * Constructeur de Pion
     * @param id elle prend un paramètre un id (String) qui ne peut pas être null
     * @param couleur elle prend en paramètre un type couleur
     * @see Couleur
     */
    public Pion(String id, Couleur couleur)
    {
        this.id=id;
        this.couleur=couleur;
    }

    /**
     * retourne la couleur du pion
     * @see Couleur
     * @return elle retourne un type Couleur
     */
    public Couleur getCouleur()
    {
        return this.couleur;
    }
}