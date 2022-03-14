/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICA2Wenjia;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apple
 */
public class BBStockItemTest {
    
    public BBStockItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProductCode method, of class BBStockItem.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        String expResult = "testCode";
        String result = instance.getProductCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductTitle method, of class BBStockItem.
     */
    @Test
    public void testGetProductTitle() {
        System.out.println("getProductTitle");
        //String productCode, String productTitle, String productDescription, int unitPrice, int quantity
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        String expResult = "testTitle";
        String result = instance.getProductTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductDescription method, of class BBStockItem.
     */
    @Test
    public void testGetProductDescription() {
        System.out.println("getProductDescription");
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        String expResult = "testDescription";
        String result = instance.getProductDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitPrice method, of class BBStockItem.
     */
    @Test
    public void testGetUnitPrice() {
        System.out.println("getUnitPrice");
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        int expResult = 1;
        int result = instance.getUnitPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class BBStockItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        int expResult = 2;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProductTitle method, of class BBStockItem.
     */
    @Test
    public void testSetProductTitle() {
        System.out.println("setProductTitle");
        String productTitle = "";
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        instance.setProductTitle(productTitle);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProductDescription method, of class BBStockItem.
     */
    @Test
    public void testSetProductDescription() {
        System.out.println("setProductDescription");
        String productDescription = "";
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        instance.setProductDescription(productDescription);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUnitPrice method, of class BBStockItem.
     */
    @Test
    public void testSetUnitPrice() {
        System.out.println("setUnitPrice");
        int unitPrice = 0;
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        instance.setUnitPrice(unitPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class BBStockItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stringToInt method, of class BBStockItem.
     */
    @Test
    public void testStringToInt() {
        System.out.println("stringToInt");
        String s = "1";
        Integer expResult = 1;
        Integer result = BBStockItem.stringToInt(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOpenCSV() {

        BBStockItem instance = new BBStockItem("testCode","testTitle","testDescription",1,2);
        BBStockItem test = new BBStockItem("EVE1234567","An elegant red dress"," Perfect for those evening parties",10000,10);
        List<BBStockItem> result = BBStockItem.openCSV("test/BBStock.csv");

        assertEquals(test.getProductCode(), result.get(0).getProductCode());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
    * Test of writeStock method, of class BBStockItem.
    */
    @Test
    public void testWriteStock() {
        System.out.println("writeStock");
        String csvFilePath = "test/BBStockTest.csv";
        List<BBStockItem> listOfItems = null;
        int expResult = 1;
        int result = BBStockItem.writeStock(csvFilePath, listOfItems);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
    * Test of writeSales method, of class BBStockItem.
    */
    @Test
    public void testWriteSales() {
        System.out.println("writeSales");
        String csvFilePath = "test/BBSsalesTest.csv";
        List<Transactions> listOfItems = null;
        int expResult = 5;
        int result = BBStockItem.writeSales(csvFilePath, listOfItems);
        assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }

}

 