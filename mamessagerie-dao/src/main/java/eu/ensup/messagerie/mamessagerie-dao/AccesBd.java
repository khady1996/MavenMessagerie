package eu.ensup.messagerie.mamessageriedao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class AccesBd {
	public Connection cn;
	public Statement st;
	public Connection seConnecter() {
		System.out.println("Connexion en cours...");
		String url = "jdbc:mysql://localhost/userweb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String login = "root";
		String passwd = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			System.out.println("Connecter.");
		}
		catch (SQLException e) {
			System.out.println("hello sql");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("hello");
			e.printStackTrace();
		}
		return cn;
	}
	public void seDeconnecter() {
		try {
			cn.close();
			st.close();
			System.out.println("Deconnecter.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}