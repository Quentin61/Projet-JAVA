public abstract class CaseColoree extends Case
{
    private Couleur couleur;
    public CaseColoree(Couleur couleur)
    {
        super();
        this.couleur=couleur;
    }
    public Couleur getCouleur()
    {
        return this.couleur;
    }

    @Override
    public abstract boolean peutPasser(Pion pion);

    @Override
    public abstract boolean peutSArreter(Pion pion);
}