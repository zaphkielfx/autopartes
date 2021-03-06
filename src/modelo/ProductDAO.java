package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ProductDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean register(Products prod) {

        String sql = "INSERT INTO products(code_product, description_product, purchase_price, sale_price, id_provider, id_category) values (?,?,?,?,?,?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getCode_product());
            ps.setString(2, prod.getDescription_product());
            ps.setDouble(3, prod.getPurchase_price());
            ps.setDouble(4, prod.getSale_price());
            ps.setInt(5, prod.getId_provider());
            ps.setInt(6, prod.getId_category());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString());
            return false;
        }

    }

    public List ListaProductos(String valor) {

        List<Products> ListaProductos = new ArrayList();
        String sql = "SELECT * FROM products ORDER BY status_product ASC";
        String search = "SELECT *FROM products where code_product LIKE '%"
                + valor + "%' OR description_product LIKE'%" + valor + "%'";

        try {
            con = cn.getConexion();
            if (valor.equalsIgnoreCase("")) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

            } else {
                ps = con.prepareStatement(search);
                rs = ps.executeQuery();
            }

            while (rs.next()) {
                Products prod = new Products();
                prod.setId_product(rs.getInt("id_product"));
                prod.setCode_product(rs.getString("code_product"));
                prod.setDescription_product(rs.getString("description_product"));
                prod.setSale_price(rs.getDouble("sale_price"));
                prod.setStatus_product(rs.getString("status_product"));
                ListaProductos.add(prod);
            }

        } catch (Exception e) {
        }

        return ListaProductos;

    }

    public boolean modify(Products prod) {
        String sql = "UPDATE products SET code_product=?, description_product=?, purchase_price=?, sale_price=?, id_provider=?, id_product=? where id_product=?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getCode_product());
            ps.setString(2, prod.getDescription_product());
            ps.setDouble(3, prod.getPurchase_price());
            ps.setDouble(4, prod.getSale_price());
            ps.setInt(6, prod.getId_provider());
            ps.setInt(7, prod.getId_category());
            ps.setInt(8, prod.getId_product());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String status_product, int id_product) {
        String sql = "UPDATE products SET status_product=? where id_product=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, status_product);
            ps.setInt(2, id_product);
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public Products SearchProduct(int id) {
        String sql = "SELECT prod.*, prov.id_provider, prov.name_provider, "
                + "cat.id_category, cat.name_category FROM products prod INNER JOIN providers prov ON "
                + "prod.id_provider=prov.id_provider INNER JOIN categories cat ON "
                + "prod.id_category=cat.id_category WHERE id_product=?";
        Products prod = new Products();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                prod.setCode_product(rs.getString("code_product"));
                prod.setDescription_product(rs.getString("description_PRODUCT"));
                prod.setPurchase_price(rs.getDouble("purchase_price"));
                prod.setSale_price(rs.getDouble("sale_price"));
                prod.setId_provider(rs.getInt("id_provider"));
                prod.setId_category(rs.getInt("id_category"));
                prod.setName_provider(rs.getString("name_provider"));
                prod.setName_category(rs.getString("name_category"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println(e.toString());
        }
        return prod;
    }
    
    public Products SearchIdProduct(int id){
        String sql = "SELECT * FROM products WHERE id_product=?";
        Products prod = new Products();
        try {
           con= cn.getConexion();
           ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           rs=ps.executeQuery();
            if (rs.next()) {
                prod.setQuantity(rs.getInt("quantity"));              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return prod;
    }
    
    public Products SearchCode(String code){
        String sql= "SELECT * FROM products WHERE code_product=?";
        Products prod = new Products();
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, code);
            rs=ps.executeQuery();
            
            if(rs.next()){
                prod.setId_product(rs.getInt("id_product"));
                prod.setDescription_product(rs.getString("description_product"));
                prod.setPurchase_price(rs.getDouble("purchase_price"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return prod;
    }
    
    public Products SerachCodeSale(String code){
         String sql = "SELECT * FROM products WHERE code_product=?";
         Products prod = new Products();
         try {
            con= cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, code);
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
        }
         return prod; 
    }
     
    public boolean RegisterPurchase(int code, String total){
        
        String sql = "INSERT INTO purchase(id_provider, total) VALUES(?,?)";
        
        try {
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, code);
            ps.setString(2, total);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
          
        
    }
    
    public boolean RegisterSale(int codCliente, int codEmpleado, String total){
        
        String sql = "INSERT INTO comprobante (id_cliente, id_empleado, total) VALUES(?,?,?)";
        
        try {
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codCliente);
            ps.setInt(2, codEmpleado);
            ps.setString(3, total);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
          
        
    }
    
    public boolean RegisterPurchaseDetail(int id_purchase, int id_product, double price, int quantity, double igv, double subtotal){
        
        String sql= "INSERT INTO purchase_detail (id_purchase,id_product,price, quantity, igv, subtotal) VALUES (?,?,?,?,?,?)";
        
        try {
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_purchase);
            ps.setInt(2, id_product);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);
            ps.setDouble(5, igv);
            ps.setDouble(6, subtotal);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    
    }
    
    public boolean RegisterSaleDetail(int id_comprobante, int id_product, double price,int quantity, double igv, double subtotal){
        
        String sql= "INSERT INTO purchase_detail (id_comprobante, id_product, price, quantity, subtotal) VALUES (?,?,?,?,?)";
        
        try {
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_comprobante);
            ps.setInt(2, id_product);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);
            ps.setDouble(5, igv);
            ps.setDouble(6, subtotal);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    
    }
    
    public boolean UpdateStock(int quantity, int code){
        
        String sql = "UPDATE products SET quantity=? WHERE id_product=?";
        
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, code);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    
    }
    
    public boolean UpdateStockSale(int quantity, int code) {
        String sql = "UPDATE products SET quantity=? where id_product=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, code);
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
     
    public int CodePurchase(){
        int codigo =0;
        String sql = "SELECT MAX(id_purchase) as code FROM purchase";
        
        try {
            con = cn.getConexion();
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                codigo=rs.getInt("code");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return codigo;
    }
    
    public int CodeSale(){
        int codigo =0;
        String sql = "SELECT MAX(id_comprobante) as code FROM comprobante";
        
        try {
            con = cn.getConexion();
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                codigo=rs.getInt("code");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return codigo;
    }
    
    public List ListaDetalle(int id_purchase){
        List<Products> listaProducts = new ArrayList();
        String sql = "SELECT c.*, dc.*, p.id_product, p.description_product FROM purchase c"
                + "INNER JOIN purchase_detail dc ON dc.id_purchase=c.id_purchase "
                + "INNER JOIN products p ON p.id_product = dc.id_product"
                + "WHERE c.id_purchase=?;";
        
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_purchase);
            rs=ps.executeQuery();
            while(rs.next()){
                Products prod = new Products();
                prod.setQuantity(rs.getInt("quantity"));
                prod.setDescription_product(rs.getString("description_product"));
                prod.setPurchase_price(rs.getDouble("purchase_price"));
                prod.setSale_price(rs.getDouble("sale_price"));
                listaProducts.add(prod);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProducts;
    }
    
    public List ListaDetalleVenta(int id_comprobante){
    
        List<Products> listaProducts = new ArrayList();
        String sql = "SELECT c.*, dc.*, p.id_product, p.description_product FROM comprobante c "
                + "INNER JOIN detalle_comprobante dc ON dc.id_comprobante=c.id_comprobante "
                + "INNER JOIN product p ON p.id_product =dc.id_product "
                + "WHERE c.id_comprobante=?;";
        
        try {
            con = cn.getConexion();
            ps= con.prepareStatement(sql);
            ps.setInt(1, id_comprobante);
            while(rs.next()){
                Products prod = new Products();
                prod.setQuantity(rs.getInt("quantity"));
                prod.setDescription_product(rs.getString("description_product"));
                prod.setPurchase_price(rs.getDouble("purchase_price"));
                prod.setSale_price(rs.getDouble("sale_price"));
                listaProducts.add(prod);
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.toString());

        }
        return listaProducts;
    }
    
}

