import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VariableTests
{
    @DisplayName("Check correct value")
    @Test
    void learnTheVariables()
    {
        int actualnum=12;
        int expectednum=12;
        Assertions.assertEquals(expectednum,actualnum);
    }
    @DisplayName("check incorrect valeue")
    @Test
    void learnTheVariableCase()
    {
        int actual=12;
        int expectedvalue=13;
        Assertions.assertEquals(expectedvalue,actual);
    }
}
