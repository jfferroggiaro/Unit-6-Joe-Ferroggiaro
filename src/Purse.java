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

    public String findSmallest(){
        String smallCoin = "";
        int smallVal = Integer.MAX_VALUE;
        for(int i = 0; i < purseCoins.size(); i++){
            if(purseCoins.get(i).getValue() < smallVal){
                smallCoin = purseCoins.get(i).getName();
            }
        }
        return smallCoin;
    }

    public double getTotal(){
        double total = 0;
        for (int i = 0; i < purseCoins.size(); i++) {
            total += purseCoins.get(i).getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        String print = "" + purseCoins;
        return print;
    }
}
