
package G.Modelos;

import Entidades.Producto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaProductos extends AbstractTableModel{
    
    private ArrayList<Producto> listadoProducto = null;

    public ArrayList getListadoProducto() {
        return listadoProducto;
    }

    public void setListadoProducto(ArrayList listadoProductos) {
        this.listadoProducto = listadoProductos;
    }

    @Override
    public int getRowCount() {
        int cantFilas = 0;
        if(this.listadoProducto != null){
             cantFilas = this.listadoProducto.size();
        }
       
        return cantFilas;
    }
    
    @Override
    public int getColumnCount() {
         return 2;
    }
    
     @Override
    public String getColumnName(int column) {
        String nombreCol = "";
        switch (column) {
            case 0: nombreCol = "Nombre"; break;
            case 1: nombreCol = "Precio"; break;
        }
        return nombreCol;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Object celda = "";
        Producto objP = null;
        if(this.listadoProducto != null){
            objP = this.listadoProducto.get(rowIndex);
            switch (columnIndex) {
            case 0: celda = objP.getNombre(); break;
            case 1: celda = objP.getPrecio(); break;
            }
            
        }
        
        return celda;
    
    }
    
    
}
