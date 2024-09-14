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
public class ComparatorDomain implements Comparator<WebPage>
{

    /**
     * Constructor, with no parameters.
     */
    public ComparatorDomain(){}
    
    /**
     * Compare domain of two web pages.
     * @param o1 one of WebPage to compare
     * @param o2 one of WebPage to compare
     * @return integer based on which domain is bigger
     */
    public int compare(WebPage o1, WebPage o2)
    {
        //Check web pages are null or not.
        if((o1 == null) && (o2 == null)){
            return 0;
        }
        //If there is any null web pages, it will be considered as a smaller domain.
        else if((o1 != null) && (o2 == null)){
            return 1;
        }
        else if((o1 == null) && (o2 != null)){
            return -1;
        }
        //This program start actually compareing domains when both are not null.
        else{
            String domain1 = o1.getDomain();
            String domain2 = o2.getDomain();
            if((domain1 == null) && (domain2 == null)){return 0;}
            else if((domain1 == null) && (domain2 != null)){return -1;}
            else if((domain1 != null) && (domain2 == null)){return 1;}
            else{
                if(domain1.equals(domain2)){
                    return 0;
                }
                else if(domain1.compareTo(domain2) > 0){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
    }
}
