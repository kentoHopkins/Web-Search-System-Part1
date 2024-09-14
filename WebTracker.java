/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 */
import java.util.*; 

/**
 * WebTracker class.
 * @author Kento Hopkins
 * @version 2024.03.20
 */
public class WebTracker
{
    private ArrayList<WebPage> pages;

    /**
     * Constructor, with no parameters.
     */
    public WebTracker()
    {
        WebCrawler webCrawler = new WebCrawler();
        pages = webCrawler.crawlWeb();
    }

    /**
     * Get number of pages.
     * @return number of elements in the ArrayList.
     */
    public int getNumPages()
    {
        return pages.size();
    }

    /**
     * Get specific page at a index.
     * @param index index of page that you want to get.
     * @return title of web page
     */
    public WebPage getPage(int index)
    {
        WebPage returnPage = pages.get(index);
        return returnPage;
    }

     /**
     * Sort ArrayList page.
     * @param c Comparator for WebPage class.
     */
    void sort(Comparator<WebPage> c)
    {
        Collections.sort(pages, c);
    }

}
