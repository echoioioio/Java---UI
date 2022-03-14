/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICA2Wenjia;

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
public class MMStockAdapterTest {
    
    public MMStockAdapterTest() {
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
     * Test of getQuantity method, of class MMStockAdapter.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        MMStockItem test = new MMStockItem(1,"testCode","testTitleAndDescription",2,3,4);
        MMStockAdapter instance = new MMStockAdapter(test);
        int expResult = 4;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitPrice method, of class MMStockAdapter.
     */
    @Test
    public void testGetUnitPrice() {
        System.out.println("getUnitPrice");
        //int departmentId, String code, String titleAndDescription, int unitPricePounds, int unitPricePence, int quantityInStock
        MMStockItem test = new MMStockItem(1,"testCode","testTitleAndDescription",2,3,4);
        MMStockAdapter instance = new MMStockAdapter(test);
        int expResult =203;
        int result = instance.getUnitPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductDescription method, of class MMStockAdapter.
     */
    @Test
    public void testGetProductDescription() {
        System.out.println("getProductDescription");
        MMStockItem test = new MMStockItem(1,"testCode","testTitle                                         testDescription",2,3,4);
        MMStockAdapter instance = new MMStockAdapter(test);
        String expResult = " testDescription";
        String result = instance.getProductDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductTitle method, of class MMStockAdapter.
     */
    @Test
    public void testGetProductTitle() {
        System.out.println("getProductTitle");
        MMStockItem test = new MMStockItem(1,"testCode","testTitle                                         testDescription",2,3,4);
        MMStockAdapter instance = new MMStockAdapter(test);
        String expResult = "testTitle";
        String result = instance.getProductTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProductCode method, of class MMStockAdapter.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        MMStockItem test = new MMStockItem(1,"testCode","testTitle testDescription",2,3,4);
        MMStockAdapter instance = new MMStockAdapter(test);
        String expResult = "testCode";
        String result = instance.getProductCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class MMStockAdapter.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        MMStockItem test = new MMStockItem(1,"testCode","testTitle testDescription",2,3,4);
        MMStockAdapter instance = new MMStockAdapter(test);        
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
