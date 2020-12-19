/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Lenovo
 */
class Connectionr {
    public static Connection con;
    public static String dbFile = "C://Users//Lenovo//Documents//Database1.accdb";
    public static String dbUrl = "jdbc:ucanaccess://"+dbFile.trim()+";memory=true";
    public static Connection getConnection() {
   try{
       con = DriverManager.getConnection(dbUrl,"","");
   } catch (Exception ex){
       System.out.println(""+ex);
       
   }
   return con;
       
       
       
    
   }
    /*public String updateId;
    public void update(String name,String address,String contact,String date,String previous,String present,String bill ){
        try{
            Connection con=newConnection();
            PreparedStatement ps =(PreparedStatement) con.prepareStatement("Update E_BILL SET   ADDRESS =?, CONTACT=?, DATE = ?, PREVIOUS=?, PRESENT=?, BILL=? WHERE NAME =?" );
             ps.setString(1, name);
           ps.setString(2, address);
           ps.setString(3, contact);
           ps.setString(4, date);
           ps.setString(5, previous);
           ps.setString(6, present);
           ps.setString(7, bill);
           ps.executeUpdate();
           ps.close();
    } catch (Exception e){
       System.out.println(e);
       
        }
}

    private Connection newConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private void setString(int i, String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }*/
    }

