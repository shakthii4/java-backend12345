package service;

import java.sql.*;

public class DbService
{
    private final Connection connection;

    public DbService(Connection connection) {
        this.connection = connection;
    }

    public int createNewAccount(int acNum, double amt, String acHldNm, Date crDt, boolean status) throws SQLException, SQLException {
        var sql = "insert into New_Banking values (?, ?, ?, ?, ?)";
        var ps1 = connection.prepareStatement(sql); // here you are creating sql
        ps1.setInt(1, acNum);
        ps1.setDouble(2, amt);
        ps1.setString(3, acHldNm);
        ps1.setDate(4, crDt);
        ps1.setBoolean(5, status);

        var affected = ps1.executeUpdate();
        connection.commit();

        return affected;
    }

    public void showAllAccounts() throws SQLException {

        String sql="select * from Bank_Account";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int acnm = rs.getInt("ac_num");
            String name=rs.getString("ac_hld_nm");
            int at=rs.getInt("amt");
            Date dt=rs.getDate("ac_crt_date");
            boolean st=rs.getBoolean("status");
            System.out.println("Hi, :"+name+" Your Account Number is :"+acnm+" and Your Account Balance is "+at+" and Account Opening Date is :"+dt+" and Current Status is "+st);
            connection.commit();
        }
        rs.close();

    }

    public void moneyTransfer(int srcAct, int destAct, double amt) {
        // deduct amount from src -> update
        // add amount to dest -> update
        // commit
    }
    public void activateAccount()

}
