import db.BankConnectivity;
import service.BankDbService;
import db.Connectivity;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class MainBank {


    public static void main(String[] args) {


        try {
            BankConnectivity connectivity = new BankConnectivity();
            BankDbService service = new BankDbService(connectivity.getConnection());
          /*  int cnt = service.createAccount(1128, "SHannU", 500, Date.valueOf(LocalDate.now()), true);
            if (cnt > 0) {
                System.out.println("Account Created Successfully");
            }*/


          //  service.showAllAccount();
           // service.displayBalance("Kubi");
           // service.moneyTransfer(1111, 1112, 500);
             service.withdraw5(1111,50);
             service.deposit("Shakthi",500);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
