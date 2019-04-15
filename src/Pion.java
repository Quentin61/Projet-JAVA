public class Pion
{
    private final String id;
    private Couleur couleur;

    public Pion(String id, Couleur couleur)
    {
        this.id=id;
        this.couleur=couleur;
    }

    public Couleur getCouleur()
    {
        return this.couleur;
    }
    public String getId()
    {
        return this.id;
    }
}