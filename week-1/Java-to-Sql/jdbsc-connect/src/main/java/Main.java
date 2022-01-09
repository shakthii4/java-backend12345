import db.Connectivity;
import service.DbService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connectivity connectivity = new Connectivity();
            DbService service = new DbService(connectivity.getConnection());
            service.findEmployee("Shakthi");
        //    int cnt = service.create(8, "Kubi", Date.valueOf(LocalDate.now()), true);
        //   if (cnt>0)
        //    {
        //       System.out.println("Employee Created Successfully");
       //       }
        //   service.find();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
