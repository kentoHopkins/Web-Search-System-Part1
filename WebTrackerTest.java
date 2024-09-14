/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * WebTracker class.
 * @author Kento Hopkins
 * @version 2024.03.20
 */
public class WebTrackerTest
{
    WebTracker wt;
    ComparatorWebTitle comparator;
    WebPage w1;
    WebPage w2;
    WebPage w3;
    WebPage w4;
    
    // ----------------------------------------------------------
    /**
     * Create WebTracker, ComparatorWebTitle and WebPage.
     */
    @Before
    public void setUp()
    {
        wt = new WebTracker();
        comparator = new ComparatorWebTitle();
        w1 = new WebPage("Wake Forest University", "http://www.wfu.edu", 
        "1991/04/23", "2024/03/05");
        w2 = new WebPage("University of North Carolina at Charlotte","http://www.charlotte.edu", 
        "2002/07/12", "2024/02/09");
        w3 = new WebPage("Elizabeth City State University","http://ecsu.edu", 
        "1996/08/17", "2024/02/09");
        w4 = new WebPage("Appalachian State University","http://appstate.edu", 
        "2001/09/17", "2024/03/05");
    }

    // ----------------------------------------------------------
    /**
     * Check getNumPages returns expected value which in total number of pages.
     */
    @Test
    public void testGetNumPages()
    {
        assertEquals(64, wt.getNumPages());
    }

    // ----------------------------------------------------------
    /**
     * Check getPage returns expected value which is page at specific index.
     */
    @Test
    public void testGetPage()
    {
        assertTrue(w1.equals(wt.getPage(0)));
        assertTrue(w2.equals(wt.getPage(19)));
        assertTrue(w3.equals(wt.getPage(63)));
    }

    // ----------------------------------------------------------
    /**
     * Check sort actually sort list.
     */
    @Test
    public void testSort()
    {
        wt.sort(comparator);
        assertTrue(w4.equals(wt.getPage(0)));
    }
}
