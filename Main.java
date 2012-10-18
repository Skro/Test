import java.sql.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new AjouterPilotes();
		
		
		Connection con = null; 
		Statement st = null;
		try { 
			Class.forName("org.postgresql.Driver") ; 
		 	con = DriverManager.getConnection("jdbc:postgresql:dbfougereux", "rfougereux", "172539281300"); 
		 	Statement nom_Statement = con.createStatement();
		 	st.executeUpdate ("INSERT INTO Pilotes (nomPilote, prenomPilote) VALUES ('" + nom + "','" + prenom + "'");
		} 
		catch(ClassNotFoundException erreur) { 
			System.out.println("Driver non chargé !"+erreur); 
		} 
		
		
		catch(SQLException erreur) { 
			System.out.println("Erreur" + erreur);
		} 

	}

}
