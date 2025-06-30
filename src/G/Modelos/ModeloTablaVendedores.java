package G.Modelos;

import entidades.Vendedor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaVendedores extends AbstractTableModel{
    private ArrayList<Vendedor> listadoVendedores = null;

    public ArrayList getListadoVendedores() {
        return listadoVendedores;
    }

    public void setListadoVendedores(ArrayList listadoVendedores) {
        this.listadoVendedores = listadoVendedores;
    }

    
    
    @Override
    public int getRowCount() {
        int cantFilas = 0;
        if(this.listadoVendedores != null){
             cantFilas = this.listadoVendedores.size();
        }
       
        return cantFilas;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
     @Override
    public String getColumnName(int column) {
        String nombreCol = "";
        switch (column) {
            case 0: nombreCol = "Nombres"; break;
            case 1: nombreCol = "Apellidos"; break;
            case 2: nombreCol = "Dni"; break;
            case 3: nombreCol = "Correo"; break;
        }
        return nombreCol;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object celda = "";
        Vendedor objV = null;
        if(this.listadoVendedores
                != null){
            objV = this.listadoVendedores.get(rowIndex);
            switch (columnIndex) {
            case 0: celda = objV.getNombres(); break;
            case 1: celda = objV.getApellidos(); break;
            case 2: celda = objV.getDni(); break;
            case 3: celda = objV.getCorreo(); break;
            }
            
        }
        
        return celda;
    }
    
}
