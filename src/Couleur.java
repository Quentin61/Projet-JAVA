public enum Couleur
{
    JAUNE('J'),
    BLEU('B'),
    ROUGE('R'),
    VERT('V');


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