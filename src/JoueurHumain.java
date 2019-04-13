public class JoueurHumain extends Joueur
{
    public JoueurHumain(String nom,Couleur couleur)
    {
        super(nom,couleur);
    }

    @Override
    public Pion choisirPion(int numeroPion, Plateau plateau)
    {
        return super.choisirPion(numeroPion, plateau);
    }
}