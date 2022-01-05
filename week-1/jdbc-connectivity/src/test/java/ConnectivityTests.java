import org.junit.jupiter.api.Assertions;

public class ConnectivityTests
{
    void testConnectivity()
    {
        Assertions.assertDoesNotThrow(() -> {
            Connectivity con=new Connectivity();
            Assertions.assertNotNull(con.getConnection());
        });


    }
}
