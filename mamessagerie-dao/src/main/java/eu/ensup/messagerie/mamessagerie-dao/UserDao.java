package eu.ensup.messagerie.mamessageriedao;

import java.sql.ResultSet;
import java.sql.SQLException;
import eu.ensup.messagerie.mamessageriedao.AccesBd;
import eu.ensup.messagerie.mamessageriedomaine.User;

public class UserDao {
	AccesBd bd = new AccesBd();	
	public User readUserbyId(int index){
		User utilisateur = null;
		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `User` WHERE `Iduser` = '" + index + "';";
			ResultSet rs = bd.st.executeQuery(requete);
			while (rs.next()) {
				utilisateur = new User(rs.getString("name"), rs.getString("mail"), rs.getString("message"));
			}
		} catch (SQLException e) {
			System.out.println("WOWOOWOW");
			e.printStackTrace();
		}
		bd.seDeconnecter();
		return utilisateur;
	}	
}
