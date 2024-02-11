/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etudiant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Soxna Maguette
 */
public class  connecterDB {

          private static final  String url ="jdbc:mysql://localhost:3306/gestion_etudiant";
          private static final  String user= "root";
          private static final  String password= "";
           
   
    public static Connection connecterDB() {
        
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            
            Connection cnx= DriverManager.getConnection(url,user,password);
            System.out.println("la connexion est bien etablie");
            return cnx;
        }catch (ClassNotFoundException | SQLException e) {
            return null;

    
        }
    }
    
    
     public static void fermerConnexion(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
        }
    }
}
    

