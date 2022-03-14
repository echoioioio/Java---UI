/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICA2Wenjia;

/**
 *
 * @author apple
 */
public class Transactions {
    
    String date;
    String productCode;
    int quantitySold;
    int unitPrice;

    public Transactions(String date, String productCode, int quantitySold, int unitPrice) {
        this.date = date;
        this.productCode = productCode;
        this.quantitySold = quantitySold;
        this.unitPrice = unitPrice;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    
    public String getDate() {
        return date;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
    
    
    
}
