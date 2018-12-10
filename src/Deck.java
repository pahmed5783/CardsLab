import java.util.ArrayList;
import java.util.List;

public class Deck {

    private ArrayList<Card> unDealt, Dealt;

    public Deck(String[] ranks, String[] suits, int[] values){
        List<Card> unDealt = new ArrayList<Card>();
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < ranks.length; j++){
                Card temp = new Card(ranks[j],suits[i],values[j]);
                unDealt.add(temp);
            }
        }
    }

    public boolean isEmpty(){
        if(unDealt.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return unDealt.size();
    }

    public Card deal(){
        if(!unDealt.isEmpty()){
            int x = (int)(Math.random() * unDealt.size());
            Card temp = unDealt.get(x);
            unDealt.remove(x);
            Dealt.add(temp);
            return temp;
        }
        return null;
    }

    public void shuffle(){
        for(int k = 51; k > 0; k--){
            int r = (int)(Math.random()*51);
            Card temp = unDealt.get(r);
            unDealt.set(r, unDealt.get(k));
            unDealt.set(k, temp);
        }
    }
}