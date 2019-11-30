import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card{
    int rank;
    String color;
    Card(int rank,String color){
        this.rank=rank;
        this.color=color;
    }
    @Override
    public String toString( ){
        String q=null;
        if(rank==1){
                q="A";
            }
            else if(rank==11){
                q="J";
            }else if(rank==12){
                q="O";
            }else if(rank==13){
                q="K";
            }
            else{
            q=String.valueOf(rank);
        }
        return String.format("(%s,%s)",q,color);
    }
}
public class DeckDemo {

    public static List<Card> creatCard() {
        String colors[] = {"♥", "♣", "♦", "♠"};
        List<Card> deck = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card card = new Card(i + 1, colors[i]);
                deck.add(card);
            }
        }
        return deck;
    }


    public static void swap(List<Card> des, int i, int j) {
        Card p = des.get(i);
        des.set(i, des.get(j));
        des.set(j, p);
    }

    public static void suffer(List<Card> des) {
        Random random=new Random();
        for(int i=des.size()-1;i>0;i--){
            int r=random.nextInt(i);
            swap(des,i,r);
        }
    }
    public static void person(List<Card> des,int p){
        List<List<Card>> list=new ArrayList<>();
        for(int i=0;i<p;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<p;j++){
                list.get(j).add(des.remove(0));
            }
        }
        System.out.println(des);
        for(int i=0;i<p;i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<Card> deck=creatCard();
        System.out.println(deck);
        suffer(deck);
        System.out.println(deck);
        person(deck,3);
    }

}