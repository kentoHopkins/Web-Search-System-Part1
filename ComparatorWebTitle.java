/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
import java.util.Comparator;

/**
 * ComparatorWebTitle class.
 * @author Kento Hopkins
 * @version 2024.03.20
 */
public class ComparatorWebTitle implements Comparator<WebPage>
{

    /**
     * Constructor, with no parameters.
     */
    public ComparatorWebTitle(){}
    
    /**
     * Compare title of two web pages.
     * @param o1 one of WebPage to compare
     * @param o2 one of WebPage to compare
     * @return integer based on which title is bigger
     */
    public int compare(WebPage o1, WebPage o2)
    {
        //Check web pages are null or not.
        if(o1 == null && o2 == null){
            return 0;
        }
        //If there is any null web pages, it will be considered as a smaller domain.
        else if((o1 != null) && o2 == null){
            return 1;
        }
        else if(o1 == null && (o2 != null)){
            return -1;
        }
        //This program start actually compareing domains when both are not null.
        else{
            String title1 = o1.getTitle();
            String title2 = o2.getTitle();
            if((title1 == null) && (title2 == null)){return 0;}
            else if((title1 == null) && (title2 != null)){return -1;}
            else if((title1 != null) && (title2 == null)){return 1;}
            else{
                if(title1.equals(title2)){
                    return 0;
                }
                else if(title1.compareTo(title2) > 0){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
    }
}
