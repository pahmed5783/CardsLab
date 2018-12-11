public class DeckTester
{
    public static void main(String[] args)
    {
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        String[] ranks = {"1","2","3","4"};
        int[] pointValues = {1,2,3,4};
        Deck x = new Deck(suits,ranks,pointValues);
        System.out.println(x.getUnDealt());
        System.out.println(x.getDealt());
        x.shuffle();
        while(x.size()>0)
        {
            System.out.println(x.deal());
        }
    }
}