
package Controller;

import BaseDatos.Conexion;
import BaseDatos.ICRUD;
import Entidades.Producto;
import java.sql.*;
import java.util.ArrayList;


public class GestionarProductos implements ICRUD{
        private Connection con = null;
        
    @Override
    public ArrayList listar() throws Exception {
        ArrayList arrProductos = new ArrayList();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM producto";
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            Producto objP = null;
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");
                objP = new Producto(nombre, categoria, precio, stock);
                objP.setId(id);
                arrProductos.add(objP);
            }
        }catch (Exception e){
           e.printStackTrace();
            throw e;
        } 
        return arrProductos;
    }

    @Override
    public int crear(Object obj) throws SQLException {
        Producto objP = (Producto) obj;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int idGenerado = -1;
        try {
             this.con = Conexion.conectar();
            String sql = "INSERT INTO  producto(nombre, categoria, precio, stock)" 
                    + "VALUES (?, ?, ?, ?)";
            
            ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, objP.getNombre());
            ps.setString(2, objP.getCategoria());
            ps.setDouble(3, objP.getPrecio());
            ps.setInt(4, objP.getStock());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if(rs.next()){
                idGenerado = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return idGenerado;
    }

    @Override
    public void actualizar(int id, Object obj) throws Exception {
       Producto objP = (Producto) obj;
    PreparedStatement ps = null;

    try {
        this.con = Conexion.conectar();
        String sql = "UPDATE producto SET nombre = ?, categoria = ?, precio = ?, stock = ? WHERE id=?";

        ps = this.con.prepareStatement(sql);
        ps.setString(1, objP.getNombre());
        ps.setString(2, objP.getCategoria());
        ps.setDouble(3, objP.getPrecio());
        ps.setInt(4, objP.getStock());
        ps.setInt(5, id);
        ps.executeUpdate();
    } catch (SQLException e) {
        throw e;
    } finally {
       
    }
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql =  "DELETE FROM PRODUCTO WHERE id=? ";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
      
    }

    @Override
    public Object get(int id) throws Exception {
       Producto objP = new Producto();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM producto WHERE id = ?";
            ps = this.con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                objP.setId(rs.getInt("id"));
                objP.setNombre(rs.getString("nombre"));
                objP.setCategoria(rs.getString("categoria"));
                objP.setPrecio(rs.getDouble("precio"));
                objP.setStock(rs.getInt("stock"));
               
                
            }else{
                objP = null;
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;}
            return objP;
    }
    
}
