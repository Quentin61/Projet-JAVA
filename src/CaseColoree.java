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
    public boolean peutPasser(Pion pion)
    {
        return super.peutPasser(pion);
    }

    @Override
    public boolean peutSarreter(Pion pion)
    {
        return super.peutSarreter(pion);
    }
}