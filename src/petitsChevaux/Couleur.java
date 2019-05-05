package petitsChevaux;

public enum Couleur
{
    JAUNE('J'),
    BLEU('B'),
    ROUGE('R'),
    VERT('V');

    /**
     * le lettre attribuée à chaque couleur
     */
    private char symbol;

    /**
     * constructeur de Couleur
     * @param symbol elle prend en paramètre une lettre (char) qui va être ajoutée à un element de l'énumeration
     */
    private Couleur(char symbol)
    {
        this.symbol=symbol;
    }

    /**
     * retourne la lettre attribué à chaque element de Couleur
     * @return elle retourne la lettre de l'élément (char)     */
    public char getSymbol()
    {
        return this.symbol;
    }

}