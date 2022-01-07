package factory;

public class InvalidBankException extends RuntimeException
{
    public InvalidBankException(String messages)
    {
        super(messages);
    }
}
