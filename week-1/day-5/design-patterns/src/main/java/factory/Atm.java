package factory;

public class Atm {
    public CardProvider swipe(String bank) {
        CardProvider Card = CardFactory.getCard(bank);
        Card.Swipe(150);
        return Card;


    }

    public CoinProvider pay(String bank) {
        CoinProvider coin = CoinFactory.getCoin("abc");
        coin.currentPrice();
        return coin;
    }

    public void usingAppFactory() {

        AppFactory factory = new AppFactory();

        CardFactory cardFactory = (CardFactory) factory.getFactory("cord");

        CoinFactory coinFactory = (CoinFactory) factory.getFactory("coin");

    }
}
