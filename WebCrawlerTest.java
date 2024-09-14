/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java
 */
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * WebCrawlerTest class.
 * @author Manuel A. Perez-Quinones <perez.quinones@charlotte.edu>
 */
public class WebCrawlerTest
{

    /**
     * testOne - testing to make sure that the WebCrawler
     * creates a list of WebPages.
     */
    @Test
    public void testOne()
    {
        new WebCrawler(); // for coverage with default constructor
        ArrayList<WebPage> a = WebCrawler.crawlWeb();
        assertNotNull("Not null", a);
        assertEquals("Size of crawl is wrong", 64, a.size());
    }
}
