package factory;

public abstract class CardFactory {
    public static CardProvider getCard(String bank)
    {
        if (bank.equals("pqr")) return new PqrCard();
        if (bank.equals("abe")) return new AbcCard();
        if (bank.equals("xyz")) return new XyzCArd();
        throw new InvalidBankException("ATM card Facility is not provided by"+bank);


    }
}
