//In This Program we Perform the CRUD operation using connection of DBConnection class
//example------>

import java.sql.*;
public class PatientDAO
{
    public void addPatient(Patient p)
    {
        String query="INSERT INTO patient (name,age,eeg,symtoms) VALUES (?,?,?,?)";
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement pst=conn.prepareStatement(query))
        {
            pst.setString(1,p.getName());
            pst.setInt(2,p.getAge());
            pst.setDouble(3,p.getEeg());
            pst.setString(4,p.getSymtoms());

            pst.executeUpdate();
            System.out.println("Patient added Successfully");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void viewPatient()
    {
        String query="SELECT * FROM Patient";
        try(Connection conn=DBConnection.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(query))
        {
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " +
                        rs.getInt("age") + " | " + rs.getDouble("eeg") + " | " +
                        rs.getString("symtoms") + " |");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void updatePatient(Patient p)
    {
        String query="UPDATE patient SET name=?,age=?,eeg=?,symtoms=? WHERE id=?";
        try(Connection conn=DBConnection.getConnection();
        PreparedStatement pst=conn.prepareStatement(query))
        {
            pst.setString(1,p.getName());
            pst.setInt(2,p.getAge());
            pst.setDouble(3,p.getEeg());
            pst.setString(4,p.getSymtoms());
            pst.setInt(5,p.getId());

            int rowsAffected=pst.executeUpdate();
            if(rowsAffected >0)
            {
                System.out.println("DATA Updated Successfully");
            }
            else {
                System.out.println("DATA not Updated ");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void deletePatient(int id)
    {
        String query="DELETE FROM patient WHERE id=?";
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement pst=conn.prepareStatement(query))
        {
            pst.setInt(1,id);
            int rowsAffected=pst.executeUpdate();
            if(rowsAffected >0)
            {
                System.out.println("DATA Deleted Successfully");
            }
            else
            {
                System.out.println("DATA not Updated ");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

