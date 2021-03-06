package service;



import java.sql.*;

public class DbService
{
    private final Connection connection;

    public DbService(Connection connection)
    {
        this.connection = connection;
    }
    public int create(int empId, String empNm, Date dob, boolean isManager) throws SQLException {
        String sql="insert into emp_info values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,empId);
        ps.setString(2,empNm);
        ps.setDate(3,dob);
        ps.setBoolean(4,isManager);
        int affected = ps.executeUpdate();
        return affected;
    }
    public int update()
    {
        return 10;
    }
    public void find() throws SQLException {
        String sql="select * from emp_info";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt("emp_id");
            String name=rs.getString("emp_name");
            Date dob=rs.getDate("dob");
            boolean isManager=rs.getBoolean("is_manager");
            System.out.println("Id :"+id+" Name :"+name+" Dob :"+dob+" isManager :"+isManager);
        }
        rs.close();

    }
    public void findEmployee(String name) throws SQLException {
        String sql="select * from emp_info where emp_name=?";
        PreparedStatement ps=connection.prepareStatement(sql);
        ps.setString(1,name);
        ResultSet rs = ps.executeQuery();

        while (rs.next())
        {
            int id=rs.getInt("emp_id");
            String nm=rs.getString("emp_name");
            Date dob=rs.getDate("dob");
            boolean isManager=rs.getBoolean("is_manager");
            System.out.println("Id :"+id+" Name :"+nm+" Dob :"+dob+" isManager :"+isManager);

        }
        rs.close();
    }

}
