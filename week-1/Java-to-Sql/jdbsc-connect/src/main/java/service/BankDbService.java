package service;

import java.sql.*;
import java.util.Scanner;

public class BankDbService {
    private final Connection connection;



    public BankDbService(Connection connection) {
        this.connection = connection;
    }

    public int createAccount(int accNum, String accHldNm, int amt, Date accCrtDate, boolean status) throws SQLException {
        String sql = "insert into Bank_Account values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, accNum);
        ps.setString(2, accHldNm);
        ps.setInt(3, amt);
        ps.setDate(4, accCrtDate);
        ps.setBoolean(5, status);
        int aff = ps.executeUpdate();
        connection.commit();
        return aff;

    }

    public void showAllAccount() throws SQLException {
        String sql = "select * from Bank_Account";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int acnm = rs.getInt("ac_num");
            String name = rs.getString("ac_hld_nm");
            int at = rs.getInt("amt");
            Date dt = rs.getDate("ac_crt_date");
            boolean st = rs.getBoolean("status");
            System.out.println("Hi, :" + name + " Your Account Number is :" + acnm + " and Your Account Balance is " + at + " and Account Opening Date is :" + dt + " and Current Status is " + st);
            connection.commit();
        }
        rs.close();
    }

    public void displayBalance(String name) throws SQLException {
        String sql = "select * from Bank_Account where ac_hld_nm=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int acnm = rs.getInt("ac_num");
            String nm = rs.getString("ac_hld_nm");
            int at = rs.getInt("amt");
            Date dt = rs.getDate("ac_crt_date");
            boolean st = rs.getBoolean("status");
            System.out.println("Hi, :" + nm + " Your Account Number is :" + acnm + " and Your Account Balance is " + at + " and Account Opening Date is :" + dt + " and Current Status is " + st);
            connection.commit();
        }
        rs.close();

    }

    public int moneyTransfer(int ac_num1,int ac_num2,int amt) throws SQLException {
        String sql = "select * from Bank_Account where ac_num=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, ac_num1);
        ResultSet rs = ps.executeQuery();

        ps.setInt(3,amt);
        while (rs.next())
        {
            connection.rollback();
            System.out.println("insufficient bal");
            return 0;
        }
        rs.close();
        String sql1 = "select * from Bank_Account where ac_num=?";
        PreparedStatement ps1 = connection.prepareStatement(sql1);
        ps1.setInt(2, ac_num2);
        ResultSet rs1 = ps1.executeQuery();
        while (rs1.next())
        {

                connection.rollback();
                System.out.println("wrong number");
                return 0;
            }


        rs1.close();
        String sql2 = "update employee set amt=amt-" + amt + "where ac_num=?";
        PreparedStatement ps2 = connection.prepareStatement(sql2);
        ps2.setInt(1, ac_num1);
        int affc = ps2.executeUpdate();
        String sql3 = "update employee set amt=amt+" + amt + "where ac_num=?";
        PreparedStatement ps3 = connection.prepareStatement(sql3);
        ps3.setInt(2, ac_num2);
        int affc1 = ps2.executeUpdate();
        connection.commit();
        System.out.println("Successfull");
        return affc + affc1;
    }

    public void withdraw1(String ac_hld_nm, int amt) throws SQLException {
        String sql = "update Bank_Account set amt=amt-"+amt+" where ac_hld_nm="+ac_hld_nm;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, ac_hld_nm);
        var rs = ps.executeUpdate();
        connection.commit();



    }

    public void deposit(String ac_hld_nm, int amt) throws SQLException {
        String sql = "update Bank_Account set amt=amt+? where ac_num=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, ac_hld_nm);
        ps.setInt(2, amt);
        ps.executeUpdate();
        connection.rollback();
        System.out.println("hi");

        var sql2 = "select ac_hld_nm,amt  from Bank_Account where ac_hld_nm=?";
        var ps2 = connection.prepareStatement(sql2);
        ps2.setString(1, ac_hld_nm);
        ps2.setInt(2, amt);
        var rs = ps2.executeQuery();
        while(rs.next()) {
            var nm = rs.getString("ac_hld_nm");
            var at = rs.getInt("amt");


            System.out.println(" nm : "+nm + " amt : "+at);
        }
        connection.commit();

    }
    public  void withdraw5( int accNum, int amt) throws SQLException {

            String sqlWithdraw = "update p set amt = " +
                    "(select amt from Bank_Account where amt = "+accNum+")-"+amt+" where ac_num = "+accNum;
        PreparedStatement stmt = connection.prepareStatement(sqlWithdraw);
            stmt.executeUpdate(sqlWithdraw);


        }
    }





