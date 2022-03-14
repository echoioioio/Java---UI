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
public class MMStockAdapter extends BBStockItem {

    MMStockItem mMMObject;
   
    public MMStockAdapter(MMStockItem x) {
        super("", "","", 1, 1);
        this.mMMObject = x;    
    }
    
    @Override
    public int getQuantity() {
        return  mMMObject.getQuantityInStock(); 
    }

    @Override
    public int getUnitPrice() {
       int pounds = mMMObject.getUnitPricePounds();
       int pence = mMMObject.getUnitPricePence();
       int totalPrice = (pounds * 100)+ pence;
        
        return totalPrice;
    }

    @Override
    public String getProductDescription() {
        return mMMObject.getDescription(); 
    }

    @Override
    public String getProductTitle() {
        
        String name = mMMObject.getName(); 
        name = name.trim();
       return name;
    }

    @Override
    public String getProductCode() {
        return mMMObject.getCode(); 
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setQuantity(int quantity) {
        mMMObject.setQuanity(quantity); 
    }
    
    

}

