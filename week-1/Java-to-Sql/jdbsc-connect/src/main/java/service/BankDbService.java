package service;

import java.sql.*;

public class BankDbService
{
    private final Connection connection;


    public BankDbService(Connection connection) {
        this.connection = connection;
    }
    public int createAccount(int accNum, String accHldNm, int amt, Date accCrtDate,boolean status) throws SQLException {
        String sql="insert into Bank_Account values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,accNum);
        ps.setString(2,accHldNm);
        ps.setInt(3,amt);
        ps.setDate(4,accCrtDate);
        ps.setBoolean(5,status);
        int aff=ps.executeUpdate();
        connection.commit();
        return aff;

    }
    public void showAllAccount() throws SQLException {
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
}
