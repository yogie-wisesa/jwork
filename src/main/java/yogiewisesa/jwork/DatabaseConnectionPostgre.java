/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class database connection postgre
 * untuk melakukan koneksi ke database postgresql 
 */
package yogiewisesa.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.Statement;

public class DatabaseConnectionPostgre {

    /**
     * method connection untuk menginisiasi koneksi
     * @return data koneksi ke postgre
     */
    public static Connection connection() {
        Connection c = null;
        // Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "root";

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+db_name, db_user, db_password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
