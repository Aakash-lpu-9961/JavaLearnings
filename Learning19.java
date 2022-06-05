package com.company;
import java.sql.*;

public class Learning19 {
    public static void main(String[] args) throws SQLException {

        //  STEP -01 : Create a Connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakashdb", "root", "@Aakash9961");

        //  STEP - 02 : Create Statement/Query
        Statement stmt=con.createStatement();
//        String s="INSERT INTO Student VALUES(117, 'Nitin', 20, 'M', 'Delhi', 7554493570)";
        String m = "SELECT SID, SNAME, SAGE, SCITY, SPHN  from student";

        //  STEP - 03 : Execute Statement/Query
//             stmt.execute(s);
        ResultSet rs =stmt.executeQuery(m);

        while (rs.next())
        {
            int sid=rs.getInt("SID");
            String name=rs.getString("SNAME");
            int sage=rs.getInt("SAGE");
//            String sgen=rs.getString("SGEN");
            String scity=rs.getString("SCITY");
            long sphn=rs.getLong("SPHN");

            System.out.println(sid+"  "+name+"  "+sage+"  "+scity+"  "+sphn);
        }


        //4) Close Connection
        con.close();

        System.out.println("Query executed....");

    }
}

//Reference : SQL Tutorial 14: JDBC | Java Database Connectivity with MySQL
// Channel Name - SDET-QA Automation Techie?
// commit