package yogiewisesa.jwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static yogiewisesa.jwork.DatabaseConnectionPostgre.connection;

public class DatabaseJobseekerPostgre {
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<>();

    /**
     * Get Jobseeker database
     * @return JOBSEEKER_DATABASE
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {

        JOBSEEKER_DATABASE.clear();
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Jobseeker jobseeker = null;
        try {
            String sql = "SELECT * FROM Jobseeker;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name").stripTrailing();
                email = rs.getString("email");
                password = rs.getString("password");
                jobseeker = new Jobseeker(id, name, email, password);
                JOBSEEKER_DATABASE.add(jobseeker);
            }
            stmt.close();
            c.close();
            //Jobseeker = new Jobseeker(id, name, email, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return JOBSEEKER_DATABASE;
    }

    /**
     * Insert Jobseeker
     * @param name name
     * @param email email
     * @param password password
     * @return Jobseeker
     */
    public static Jobseeker insertJobseeker(String name, String email, String password) {
        Connection c = connection();
        PreparedStatement stmt;
        Jobseeker Jobseeker = null;
        try {
            String sql = "INSERT INTO Jobseeker (name, email, password) VALUES (?,?,?) RETURNING id;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            ResultSet rs = stmt.executeQuery();
            int id = 1;
            while (rs.next()) {
                id = rs.getInt(1);
            }
            Jobseeker = new Jobseeker(id, name, email, password);
            stmt.close();
            c.close();
            return Jobseeker;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Jobseeker;
    }

    /**
     * Get last Jobseeker
     * @return Jobseeker
     */
    public static int getLastJobseekerId() {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        try {
            String sql = "SELECT id FROM Jobseeker;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            stmt.close();
            c.close();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    /**
     * Get Jobseeker by id
     * @param id_cust Jobseeker id
     * @return Jobseeker
     */
    public static Jobseeker getJobseeker(int id_cust) {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Jobseeker Jobseeker = null;
        try {
            String sql = "SELECT * FROM Jobseeker WHERE id=?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id_cust);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name").stripTrailing();
                email = rs.getString("email");
                password = rs.getString("password");
            }
            stmt.close();
            c.close();
            Jobseeker js = new Jobseeker(id, name, email, password);
            return js;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get Jobseeker
     * @param email_cust Jobseeker emial
     * @param password_cust Jobseeker password
     * @return Jobseeker
     */
    public static Jobseeker getJobseeker(String email_cust, String password_cust) {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Jobseeker Jobseeker = null;
        try {
            String sql = "SELECT id, name, email, password FROM Jobseeker WHERE email=? AND password=?;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, email_cust);
            stmt.setString(2, password_cust);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name").stripTrailing();
                email = rs.getString("email");
                password = rs.getString("password");
            }
            stmt.close();
            c.close();
            Jobseeker = new Jobseeker(id, name, email, password);
            return Jobseeker;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Jobseeker;
    }

    /**
     * Remove Jobseeker boolean.
     * @param id the id
     * @return the boolean
     */
    public static boolean removeJobseeker(int id) {
        Connection c = connection();
        PreparedStatement stmt;
        try {
            String sql = "DELETE FROM Jobseeker WHERE id=?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
