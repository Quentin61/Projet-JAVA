public class CaseDEchelle extends CaseColoree
{
    public CaseDEchelle(Couleur couleur)
    {
        super(couleur);
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