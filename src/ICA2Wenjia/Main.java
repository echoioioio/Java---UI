/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICA2Wenjia;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

/**
 *
 * @author apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MainWindow frame = new MainWindow();
        frame.setPreferredSize(new Dimension(600, 300));
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // write new MM
                BBStockItem.writeStock("mead_modernity_stock_list_example_updated.csv", frame.bBBStockItemList);
                // write transaction records
                BBStockItem.writeSales("barkers_boutique_sales_transactions.csv", frame.tTransactions);
            }           
        });
        frame.pack();
        frame.setVisible(true);
    }  
}
