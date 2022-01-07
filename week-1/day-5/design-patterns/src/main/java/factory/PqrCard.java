package factory;

public class PqrCard implements CardProvider
{

    @Override
    public void Swipe(float amt) {

    }

    @Override
    public String getBank() {
        return "pqr";
    }
}
