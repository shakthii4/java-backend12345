package factory;

public class CoinFactory
{
    private CoinFactory() {
    }

    public static Factory newInstance() {
        return new CoinFactory();
    }

    public static CoinProvider getCoin(String bank) {
        if(bank.equals("abc")) return new AbcCoin();
        throw new InvalidBankException("Invalid Bank");
    }
}
