/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class datatable extends AbstractTableModel {
             private ResultSet rs;

    public datatable(ResultSet rs) {
        this.rs = rs;
        fireTableDataChanged();
    }

    public int getColumnCount() {
        try {
            if (rs == null) {
                return 0;
            } else {
                return  rs.getMetaData().getColumnCount();
            }
        } catch (SQLException e) {
            System.out.println("Erreur de : calcul des colonnes");
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public int getRowCount() {
        try {
            if (rs == null) {
                return 0;
            } else {
                rs.last();
                return rs.getRow();
            }
        } catch (SQLException e) {
            System.out.println("Erreur de : calcul des colonnes");
            System.out.println(e.getMessage());
            return 0;
        }
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > getRowCount()
                || columnIndex < 0 || columnIndex > getColumnCount()) {
            return null;
        }
        try {
            if (rs == null) {
                return null;
            } else {
                rs.absolute(rowIndex + 1);
                return rs.getObject(columnIndex + 1);
            }
        } catch (SQLException e) {
            System.out.println("Erreur de : valeurs");
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        try {
            return rs.getMetaData().getColumnName(columnIndex + 1);
        } catch (SQLException e) {
            System.out.println("Erreur de : noms des colonnes");
            System.out.println(e.getMessage());
        }
        return super.getColumnName(columnIndex);
    }
    
}
