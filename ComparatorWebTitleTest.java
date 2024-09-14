/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * ComparatorWebTitleTest class.
 * @author Kento Hopkins
 * @version 2024.03.20
 */
public class ComparatorWebTitleTest
{
    private ComparatorWebTitle cw;
    private WebPage wp1;
    private WebPage wp2;
    private WebPage wp3;
    private WebPage wp4;
    private WebPage wp5;
    private WebPage wp6;
    private WebPage wp7;

    // ----------------------------------------------------------
    /**
     * Create WebPage and ComparatorWebTitle.
     */
    @Before
    public void setUp()
    {
        cw = new ComparatorWebTitle();
        wp1 = new WebPage("Wake Forest University","http://www.wfu.edu", 
        "1991/04/23", "2024/03/05");
        wp2 = new WebPage("University of North Carolina at Chapel Hill","http://unc.edu", 
        "1995/07/27", "2024/02/01");
        wp3 = new WebPage(null,"http://www.wfu.edu", 
        "1991/04/23", "2024/03/05");
        wp4 = new WebPage("University of North Carolina at Chapel Hill","http://unc.edu", 
        "1995/07/27", "2024/02/01");
        wp5 = new WebPage(null,"http://unc.edu", 
        "1995/07/27", "2024/02/01");
        wp6 = null;
        wp7 = null;
    }
    
    // ----------------------------------------------------------
    /**
     * Check compare returns expected value 0, 1 or -1.
     */
    @Test
    public void testCompare()
    {
        assertEquals(0,cw.compare(wp6, wp7));
        assertEquals(1,cw.compare(wp1, wp7));
        assertEquals(-1,cw.compare(wp6, wp1));
        assertEquals(0,cw.compare(wp3, wp5));
        assertEquals(1,cw.compare(wp1, wp5));
        assertEquals(-1,cw.compare(wp3, wp1));
        assertEquals(0,cw.compare(wp2, wp4));
        assertEquals(1,cw.compare(wp1, wp2));
        assertEquals(-1,cw.compare(wp2, wp1));
    }
}
