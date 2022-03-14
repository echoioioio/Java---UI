/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICA2Wenjia;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author apple
 */
public class BBStockTableModel extends AbstractTableModel{

    private List<BBStockItem> bbStockItemList;
    private String[]  columnTitles = {"Code", "Title", "Description", "Unit Price", "Quantity"};

    
    public BBStockTableModel(List<BBStockItem> bBStockItemList){
    
       this.bbStockItemList = bBStockItemList;
    }
    
    @Override
    public int getRowCount() {
       
        if(bbStockItemList == null){
            return 0;
        }
        return bbStockItemList.size();
    }

    @Override
    public int getColumnCount() {
        return columnTitles.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columnTitles[columnIndex];
    }
    
   

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BBStockItem bBStockItem = bbStockItemList.get(rowIndex);
        
        switch(columnIndex){
            case 0: return bBStockItem.getProductCode();
            case 1: return bBStockItem.getProductTitle();
            case 2: return bBStockItem.getProductDescription();
            case 3: return bBStockItem.getUnitPrice();
            case 4: return bBStockItem.getQuantity();
            default:return null;
        }
        
    }
    
}
