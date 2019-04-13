public enum Couleur
{
    JAUNE('J'),
    BLEU('B'),
    VERT('V'),
    ROUGE('R');

    private char symbol;

    private Couleur(char symbol)
    {
        this.symbol=symbol;
    }
    public char getSymbol()
    {
        return this.symbol;
    }

}