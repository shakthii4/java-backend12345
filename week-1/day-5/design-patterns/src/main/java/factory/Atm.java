package factory;

public class Atm
{
    public CardProvider swipe(String bank)
    {
        CardProvider Card=CardFactory.getCard(bank);
        Card.Swipe(150);
        return Card;


    }
}
