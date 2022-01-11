import db.BankConnectivity;
import service.BankDbService;
import db.Connectivity;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class MainBank
{


    public static void main(String[] args)
    {
        try {
            BankConnectivity connectivity=new BankConnectivity();
            BankDbService service=new BankDbService(connectivity.getConnection());
            //  int cnt=service.createAccount(1117,"Thunai",500, Date.valueOf(LocalDate.now()),true);
            //   if(cnt>0)
           // {
           //     System.out.println("Account Created Successfully");
          //  }
          //  service.showAllAccount();
          //  service.displayBalance("Kubi");
            service.moneyTransfer(12345);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
