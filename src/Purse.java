import java.util.ArrayList;

public class Purse {
    ArrayList<Coin> purseCoins = new ArrayList<>();

    public void add(Coin coin){
        purseCoins.add(coin);
    }

    public int count(Coin coin){
        int coinCount = 0;
        for(int i = 0; i < purseCoins.size(); i++){
            if(purseCoins.get(i).getName().equals(coin.getName())){
                coinCount++;
            }
        }
        return coinCount;
    }
}
