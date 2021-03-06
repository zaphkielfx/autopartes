
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProviderDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean register(Provider pro){
    
    String sql = "INSERT INTO providers(ruc_provider,name_provider,phone_provider,email_provider,address_provider) values (?,?,?,?,?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getRuc_provider());
            ps.setString(2, pro.getName_provider());
            ps.setString(3, pro.getPhone_provider());
            ps.setString(4, pro.getEmail_provider());
            ps.setString(5, pro.getAddress_provider());
            ps.execute();
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaProviders(String valor){
        
        List<Provider> ListaProviders = new ArrayList();
        String sql = "SELECT * FROM providers ORDER BY status_provider ASC";
        String search = "SELECT *FROM providers where ruc_provider LIKE '%"
                + valor + "%' OR name_provider LIKE'%" + valor + "%'";
        
        try {
            con = cn.getConexion();
            if(valor.equalsIgnoreCase("")){
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
            
            }else{
                
                ps = con.prepareStatement(search);
                rs= ps.executeQuery();
            }
            
            while(rs.next()){
                Provider pro = new Provider();
                pro.setId_provider(rs.getInt("id_provider"));
                pro.setRuc_provider(rs.getString("ruc_provider"));
                pro.setName_provider(rs.getString("name_provider"));
                pro.setPhone_provider(rs.getString("phone_provider"));
                pro.setEmail_provider(rs.getString("email_provider"));
                pro.setAddress_provider(rs.getString("address_provider"));
                pro.setStatus_provider(rs.getString("status_provider"));
                ListaProviders.add(pro);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return ListaProviders;
        
        
    }
    public boolean modify(Provider pro){
        
        String sql = "UPDATE providers SET ruc_provider=?,name_provider=?, phone_provider=?, email_provider=?, address_provider=? where id_provider=?";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getRuc_provider());
            ps.setString(2, pro.getName_provider());
            ps.setString(3, pro.getPhone_provider());
            ps.setString(4, pro.getEmail_provider());
            ps.setString(5, pro.getAddress_provider());
            ps.setInt(6, pro.getId_provider());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    
    }
    
    public boolean accion(String status_provider, int id_provider){
    
        String sql = "UPDATE providers SET status_provider=? where id_provider=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, status_provider);
            ps.setInt(2, id_provider);
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }  
    
      public Provider getData(int id_purchase) {
        String sql = "Select prov.*, c.id_purchase as CodigoCompra, c.id_provider as CodigoProveedor from providers prov INNER JOIN purchase c ON c.id_provider= prov.id_provider WHERE id_purchase=? ";
        Provider prov = new Provider();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_purchase);
            rs = ps.executeQuery();
            if (rs.next()) {
                prov.setName_provider(rs.getString("name_provider"));
                prov.setPhone_provider(rs.getString("phone_provider"));
                prov.setAddress_provider(rs.getString("address_provider"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return prov;
    }
}
