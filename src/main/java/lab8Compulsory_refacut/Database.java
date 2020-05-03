package lab8Compulsory_refacut;


import java.sql.*;

public class Database {
	public ResultSet rs;
    private Connection con;

    private static Database ourInstance = new Database();

    public static Database getInstance() {
        return ourInstance;
    }

    private Database() { //establishes a connection
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicalbums4", "root","stefan123");
            System.out.println("Connected to MusicAlbums");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet setResultSet(String query) { //will execute any query
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public void doUpdate(String update) { //will execute updates
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(update);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
