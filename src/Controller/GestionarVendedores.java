package Controller;

import BaseDatos.Conexion;
import BaseDatos.ICRUD;
import entidades.Vendedor;
import java.sql.*;
import java.util.ArrayList;

public class GestionarVendedores implements ICRUD {
private Connection con = null;
    @Override
    public ArrayList listar() throws Exception {
        ArrayList arrVendedores = new ArrayList();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM vendedor";
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();
            Vendedor objV = null;
            while(rs.next()){
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dni = rs.getString("dni");
                String correo = rs.getString("correo");
                objV = new Vendedor(nombres, apellidos, dni, correo);
                objV.setId(id);
                arrVendedores.add(objV);
            }
        }catch (Exception e){
           // e.printStackTrace();
            throw e;
        } 
        return arrVendedores;
    }

    @Override
    public int crear(Object obj) throws SQLException {
        Vendedor objV = (Vendedor) obj;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int idGenerado = -1;
        try {
             this.con = Conexion.conectar();
            String sql = "INSERT INTO  vendedor(nombres, apellidos, dni, correo)" 
                    + "VALUES (?, ?, ?, ?)";
            
            ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, objV.getNombres());
            ps.setString(2, objV.getApellidos());
            ps.setString(3, objV.getDni());
            ps.setString(6, objV.getCorreo());
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
         Vendedor objV = (Vendedor) obj;
    PreparedStatement ps = null;

    try {
        this.con = Conexion.conectar();
        String sql = "UPDATE vendedor SET nombres = ?, apellidos = ?, dni = ?, correo = ? WHERE id = ?";

        ps = this.con.prepareStatement(sql);
        ps.setString(1, objV.getNombres());
        ps.setString(2, objV.getApellidos());
        ps.setString(3, objV.getDni());
        ps.setString(4, objV.getCorreo());
        ps.setInt(5, id);
        ps.executeUpdate();
    } catch (SQLException e) {
        throw e;
    } finally {
       
    }
    }

    @Override
    public void eliminar(int id) throws Exception {
        String sql =  "DELETE FROM VENDEDOR WHERE id=? ";
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
        Vendedor objV = new Vendedor();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            this.con = Conexion.conectar();
            String sql = "SELECT * FROM vendedor WHERE id = ?";
            ps = this.con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                objV.setId(rs.getInt("id"));
                objV.setNombres(rs.getString("nombres"));
                objV.setApellidos(rs.getString("apellidos"));
                objV.setDni(rs.getString("dni"));
                objV.setCorreo(rs.getString("correo"));
                
            }else{
                objV = null;
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;}
            return objV;
        
    
    }
    
}
