
package Database;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import static java.lang.System.err;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbcnx {
    
      Connection connexion;
    Statement statement;
    String sql;
    Socket client;
    String db;
    String username;
    String password;
    int port;
    String host;
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public dbcnx(String db, String username, String password ,String host,int port) {
        this.db = db;
        this.username = username;
        this.password = password;
        this.port = port;
        this.host = host;
    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Connection opencnx(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connexion=(Connection) DriverManager.getConnection(db,username,password);
        }catch(Exception e)
        {System.err.println(e);}
        return connexion;
    }
    
 ///////////////////////////////////////////////////////////////////////////////////////////   
    
    public Connection closecnx(){
     try{
         connexion.close();
     }catch(Exception e){
         System.err.println(e);
     }
     return connexion;
     
    }
    
 /////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ResultSet executionQuery(String sql){
        opencnx();
        ResultSet reponse =null;
        try{
            statement = (Statement) connexion.createStatement();
        reponse = statement.executeQuery(sql);
        System.out.println(sql);
        }
        catch(SQLException ex){System.err.println(ex);}
        return reponse;
    }
    
 ////////////////////////////////////////////////////////////////////////////////////////// 
    
    public ResultSet SelectALL(String nomTable){
        //create la requete
        sql="SELECT*FROM"+nomTable;
        //afficher la requete
        System.out.println(sql);
        //envoyer la requete
        return this.executionQuery(sql);
    }
    
 ////////////////////////////////////////////////////////////////////////////////////////
    
    public ResultSet SelectALL(String nomTable,String Nom){
       // create la requete
        sql="SELECT * FROM "+nomTable+" WHERE "+Nom;
        //envoyer la requete
        return this.executionQuery(sql);
    }
    
/////////////////////////////////////////////////////////////////////////

    public ResultSet SelectSome(String[] nomColone,String nomTable){
        //indice du tableau nomColone
        int i;
        sql= "SELECT ";
          for(i=0;i<=nomColone.length-1;i++){
              sql +=nomColone[i];
              if(i<nomColone.length-1){
                  sql+=",";
          }
          }
              sql += " FROM " + nomTable;
             
              return this.executionQuery(sql);
       
    }
    
/////////////////////////////////////////////////////////////////////////////

  public ResultSet SelectSome(String[] nomColone,String nomTable,String nom){
        //indice du tableau nomColone
        int i;
        sql=" SELECT ";
          for(i=0;i<=nomColone.length-1;i++){
              sql +=nomColone[i];
              if(i<nomColone.length-1){
                  sql+=",";
          }
          }
              sql +=" FROM "+nomTable+"WHERE"+nom;
              return this.executionQuery(sql);
       
    }    
 //////////////////////////////////////////////////////////////////////////////////////////////
  
        public String executionUpdate(String sql) {
        opencnx();
        String reponse = "";
        try {
         statement = (Statement) connexion.createStatement();
         statement.executeUpdate(sql);
         reponse = sql;
        } catch (SQLException ex) {
           reponse =    ex.toString();
        }
        return reponse;
    }

///////////////////////////////////////////////////////////////////////////////////////    
     public String Insertdata(String nomTable,String[] contenuTableau){
      int i;
      sql="INSERT INTO " + nomTable + "VALUES(";
       for(i=0;i<=contenuTableau.length -1;i++){
       sql+= "'"+contenuTableau[i]+ "'";
       if(i<contenuTableau.length -1){
        sql+=",";
     }
   }
       sql+=")";
       return this.executionUpdate(sql);
       
     }
///////////////////////////////////////////////////////////////////////////////////////////////////////
     
     public String Insertdata(String nomTable, String[] nomColonne,String[] contenuTableau) {
       int i;
      sql = "INSERT INTO " + nomTable + "(";
        for (i = 0; i <= nomColonne.length - 1; i++) {  
                 sql += nomColonne[i];  if (i < nomColonne.length - 1) { sql += ","; }
         }
          sql += ")VALUES(";
        for (i = 0; i <= contenuTableau.length - 1; i++) {
            sql += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {sql += ","; }
        }
       sql += ")";
     return this.executionUpdate(sql);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String DeleteData(String nomtable) {
    sql ="DELETE FROM "+nomtable;
    return this.executionUpdate(sql);
   }
//////////////////////////////////////////////////////////////////////////////////////////////////// 
   public String DeleteData(String nomTable, String etat) {
   sql = "DELETE FROM "+ nomTable+" WHERE " + etat;
   return this.executionUpdate(sql);
   }
///////////////////////////////////////////////////////////////////////////////////////////////
   
   public String Updatedata(String nomTable, String[] nomColonne, String[] contenuTableau, String etat) {
     int i;
    sql = "UPDATE "+nomTable+" SET ";
    for (i = 0; i <= nomColonne.length - 1; i++) {
          sql += nomColonne[i] + "='" + contenuTableau[i] + "'";
          if (i < nomColonne.length - 1) {
          sql += ",";
            }
         }
        sql += " WHERE "+ etat;
    return this.executionUpdate(sql);
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public ResultSet SelectALL(String[] t, String vente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
