public class Card {
    public String suit;
    public String rank;
    public String color;
    public int value;
    public final String[] SUITS = {"Clubs", "Spades","Diamonds", "Hearts", ""};

    public Card( String color, String suit, String rank, int value){
        this.suit = suit;
        this.rank = rank;
        this.color = color;
        this.value = value;
    }

    public int compareValue(Card card){
        int val1 = getCardValue(this, card);
        int val2 = getCardValue(card, this);

        if( val1 < val2){
            return -1;
        } else if ( val1 > val2){
            return 1;
        }
        return 0;
    }

    private int getCardValue(Card c1, Card c2){
        return (c1.value == 14 && c2.value == 2) ? 1 : c1.value;
    }

    public boolean compareSuit(Card card){
        return suit.equals(card.suit);
    }

    public int suitValue(){
        for( int i = 0; i < SUITS.length; i++) {
            if (suit.equals(SUITS[i])) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public String toString() {
        final String[] SUITS_UNICODE = {"\u2663", "\u2660", "\u2666", "\u2665", "\uD83C\uDCCF"};
        int index = 0;
        for(int i = 0; i < SUITS_UNICODE.length; i++){
            if( this.suit.equals(SUITS[i])){
                index = i;
            }
        }
        return this.rank + SUITS_UNICODE[index];
    }
}
