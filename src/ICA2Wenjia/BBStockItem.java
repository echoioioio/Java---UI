/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICA2Wenjia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apple
 */
public class BBStockItem {

    private final String productCode;
    private String productTitle;
    private String productDescription;
    private int unitPrice;
    private int quantity;

    public BBStockItem(String productCode, String productTitle, String productDescription, int unitPrice, int quantity) {

        this.productCode = productCode;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    public String getProductCode() {
        return productCode;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
     public static Integer stringToInt(String s){
        Integer n;
        try{
           n = Integer.parseInt(s);
        }
        catch (Exception e){
           System.out.print(e);
           s = s.replaceAll("\\s+","");
           n = Integer.parseInt(s);

        }
        return n;
    }
       
    @Override
    public String toString() {
        return String.format("-%s -%s -%s -UNIT PRICE: %d pence -QTY: %d",
                getProductCode(),
                getProductTitle(),
                getProductDescription(),
                getUnitPrice(),
                getQuantity());
    }
    
    public static List<BBStockItem> openCSV(String csvFilePath) {
        final List<BBStockItem> loadedStock = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
              String line;
              while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                BBStockItem tempStock = new BBStockItem(values[0], values[1], values[2],stringToInt(values[3]),stringToInt(values[4]));
                loadedStock.add(tempStock);
              }

            } catch (Exception e) {
              //System.out.print(e);
            }

                return loadedStock;
    }
    
            public static int writeStock(String csvFilePath, List<BBStockItem> listOfItems) {
              
                try (PrintWriter writer = new PrintWriter(csvFilePath)) {
                  StringBuilder sb = new StringBuilder();
                  for (BBStockItem item : listOfItems) {

                    sb.append(item.getProductCode());
                    sb.append(",");
                    sb.append(item.getProductTitle());
                    sb.append(",");
                    sb.append(item.getProductDescription());
                    sb.append(",");
                    sb.append(item.getUnitPrice());
                    sb.append(",");
                    sb.append(item.getQuantity());
                    sb.append("\n");
                  }
                  writer.write(sb.toString());

                  System.out.println("done!");

                } catch (Exception e) {
                  System.out.println(e.getMessage());
                }
                return 1;
            }
            
        public static int writeSales(String csvFilePath, List<Transactions> listOfItems) {
        
            try (PrintWriter writer = new PrintWriter(csvFilePath)) {
                  StringBuilder sb = new StringBuilder();
                  sb.append("Date and Time" + ',' + "Product Code" + ',' + "Quantity Sold" + ',' + "Unit Price" + '\n');

                  for (Transactions item : listOfItems) {
                    sb.append(item.getDate());
                    sb.append(",");
                    sb.append(item.getProductCode());
                    sb.append(",");               
                    sb.append(item.getQuantitySold());
                    sb.append(",");
                    sb.append(item.getUnitPrice());
                    sb.append("\n");
                  }
                  writer.write(sb.toString());
                } catch (Exception e) {
                  System.out.println(e.getMessage());
                  return 5;
                }
            return 1;
        }  



}
