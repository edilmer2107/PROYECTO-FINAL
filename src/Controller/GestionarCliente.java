
package Controller;

import BaseDatos.Conexion;
import BaseDatos.ICRUD;
import Entidades.Cliente;
import java.sql.*;
import java.util.ArrayList;


public class GestionarCliente implements ICRUD{
       private Connection con = null;
       
    @Override
    public ArrayList listar() throws Exception{
        ArrayList arrClientes = new ArrayList();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM cliente";
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            Cliente objC = null;
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telef");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                objC = new Cliente(nombre, apellidos, dni, telefono, direccion, correo);
                objC.setId(id);
                arrClientes.add(objC);
            }
        }catch (Exception e){
           // e.printStackTrace();
            throw e;
        } 
        return arrClientes;
    }
    
    @Override
    public int crear(Object obj) throws SQLException{
        Cliente objC = (Cliente) obj;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int idGenerado = -1;
        try {
             this.con = Conexion.conectar();
            String sql = "INSERT INTO  cliente(nombre, apellidos, dni, telef, direccion, correo)" 
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            
            ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, objC.getNombre());
            ps.setString(2, objC.getApellidos());
            ps.setString(3, objC.getDni());
            ps.setString(4, objC.getTelef());
            ps.setString(5, objC.getDireccion());
            ps.setString(6, objC.getCorreo());
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
    public void actualizar(int id, Object obj) throws Exception{
        Cliente objC = (Cliente) obj;
    PreparedStatement ps = null;

    try {
        this.con = Conexion.conectar();
        String sql = "UPDATE cliente SET nombre = ?, apellidos = ?, dni = ?, telef = ?, direccion = ?, correo = ? WHERE id = ?";

        ps = this.con.prepareStatement(sql);
        ps.setString(1, objC.getNombre());
        ps.setString(2, objC.getApellidos());
        ps.setString(3, objC.getDni());
        ps.setString(4, objC.getTelef());
        ps.setString(5, objC.getDireccion());
        ps.setString(6, objC.getCorreo());
        ps.setInt(7, id);
        ps.executeUpdate();
    } catch (SQLException e) {
        throw e;
    } finally {
       
    }
    }

   @Override
    public void eliminar(int id) throws Exception{
        
        String sql =  "DELETE FROM CLIENTE WHERE id=? ";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Object get(int id) throws Exception{
 
        Cliente objC = new Cliente();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM cliente WHERE id = ?";
            ps = this.con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                objC.setId(rs.getInt("id"));
                objC.setNombre(rs.getString("nombre"));
                objC.setApellidos(rs.getString("apellidos"));
                objC.setDni(rs.getString("dni"));
                objC.setTelef(rs.getString("telef"));
                objC.setDireccion(rs.getString("direccion"));
                objC.setCorreo(rs.getString("correo"));
                
            }else{
                objC = null;
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;}
            return objC;
        
    }
       
}