/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

/**
 *
 * @author kentohopkins
 */
import java.util.ArrayList;

/**
 * WebCrawler class that emulates a real web crawler.
 * @author Manuel A. Perez-Quinones <perez.quinones@charlotte.edu>
 */
public class WebCrawler
{

    /**
     * Creates a list of page objects and returns them in an
     * array list. This is a simulation of a webcrawler. The
     * dataset used is for a set of university WebPages for
     * intitutions in NC. The URLs have randomly added a www.
     * in front (not sure if that makes them invalid). The
     * created and visit date are fake, created randomly for
     * this simulation.
     *
     * @return list of pages "crawled"
     */
    public static ArrayList<WebPage> crawlWeb()
    {
        ArrayList<WebPage> pages = new ArrayList<>();
        pages.add(new WebPage("Wake Forest University",
                "http://www.wfu.edu", "1991/04/23", "2024/03/05"));
        pages.add(new WebPage("Warren Wilson College",
                "http://warren-wilson.edu", "2001/02/15", "2024/02/06"));
        pages.add(new WebPage("North Carolina Wesleyan University",
                "http://ncwu.edu", "1997/09/23", "2024/03/02"));
        pages.add(new WebPage("Davidson College",
                "http://www.davidson.edu", "2001/07/24", "2024/02/01"));
        pages.add(new WebPage("Barber-Scotia College",
                "http://b-sc.edu", "1999/03/15", "2024/03/09"));
        pages.add(new WebPage("Shaw University",
                "http://www.shawu.edu", "1991/02/18", "2024/03/06"));
        pages.add(new WebPage("Southeastern Free Will Baptist College",
                "http://www.sfwbc.edu", "1997/09/13", "2024/02/09"));
        pages.add(new WebPage("University of North Carolina at Greensboro",
                "http://uncg.edu", "1991/01/13", "2024/02/03"));
        pages.add(new WebPage("Gardner-Webb University",
                "http://www.gardner-webb.edu", "2003/07/16", "2024/03/02"));
        pages.add(new WebPage("Guilford College",
                "http://www.guilford.edu", "2002/09/13", "2024/02/03"));
        pages.add(new WebPage("University of North Carolina at Asheville",
                "http://www.unca.edu", "2004/05/19", "2024/03/08"));
        pages.add(new WebPage("Carolina College of Biblical Studies",
                "http://ccbs.edu", "1992/08/12", "2024/03/02"));
        pages.add(new WebPage("University of North Carolina at Pembroke",
                "http://www.uncp.edu", "1991/06/12", "2024/02/01"));
        pages.add(new WebPage("Campbell University",
                "http://www.campbell.edu", "1992/04/24", "2024/02/07"));
        pages.add(new WebPage("North Carolina A&T State University",
                "http://ncat.edu", "2000/05/23", "2024/03/05"));
        pages.add(new WebPage("North Carolina Central University",
                "http://nccu.edu", "1999/09/21", "2024/03/02"));
        pages.add(new WebPage("Lees-McRae College",
                "http://www.lmc.edu", "1998/07/12", "2024/02/03"));
        pages.add(new WebPage("Mid-Atlantic Christian University",
                "http://macuniversity.edu", "2003/05/19", "2024/02/04"));
        pages.add(new WebPage("Saint Augustine's University",
                "http://www.st-aug.edu", "1995/06/16", "2024/03/06"));
        pages.add(new WebPage("University of North Carolina at Charlotte",
                "http://www.charlotte.edu", "2002/07/12", "2024/02/09"));
        pages.add(new WebPage("Methodist University",
                "http://www.methodist.edu", "2002/04/13", "2024/02/08"));
        pages.add(new WebPage("North Carolina State University",
                "http://www.ncsu.edu", "1990/02/12", "2024/03/03"));
        pages.add(new WebPage("University of North Carolina at Chapel Hill",
                "http://unc.edu", "1995/07/27", "2024/02/01"));
        pages.add(new WebPage("Montreat College",
                "http://www.montreat.edu", "2000/02/25", "2024/03/09"));
        pages.add(new WebPage("High Point University",
                "http://www.highpoint.edu", "1996/03/15", "2024/02/02"));
        pages.add(new WebPage("Chowan University",
                "http://chowan.edu", "1991/02/15", "2024/03/03"));
        pages.add(new WebPage("Catawba College",
                "http://www.catawba.edu", "1999/04/26", "2024/02/01"));
        pages.add(new WebPage("Pfeiffer University",
                "http://pfeiffer.edu", "1995/07/12", "2024/03/01"));
        pages.add(new WebPage("Western Carolina University",
                "http://www.wcu.edu", "1991/02/12", "2024/02/05"));
        pages.add(new WebPage("Meredith College",
                "http://www.meredith.edu", "2003/07/17", "2024/03/06"));
        pages.add(new WebPage("Wingate University",
                "http://www.wingate.edu", "1998/05/22", "2024/03/02"));
        pages.add(new WebPage("University of North Carolina School of the Arts",
                "http://www.uncsa.edu", "1997/04/26", "2024/03/04"));
        pages.add(new WebPage("Heritage Bible College",
                "http://heritagebiblecollege.edu", "1994/07/18", "2024/03/05"));
        pages.add(new WebPage("Duke University",
                "http://duke.edu", "1990/01/17", "2024/03/06"));
        pages.add(new WebPage("Carolina University",
                "http://carolinau.edu", "2002/04/24", "2024/02/08"));
        pages.add(new WebPage("Hood Theological Seminary",
                "http://hoodseminary.edu", "1999/07/21", "2024/02/02"));
        pages.add(new WebPage("Bennett College",
                "http://www.bennett.edu", "2004/01/19", "2024/02/09"));
        pages.add(new WebPage("St. Andrews University",
                "http://sa.edu", "1998/03/17", "2024/02/03"));
        pages.add(new WebPage("Belmont Abbey College",
                "http://belmontabbeycollege.edu", "1996/07/15", "2024/02/02"));
        pages.add(new WebPage("East Carolina University",
                "http://www.ecu.edu", "1991/07/13", "2024/02/08"));
        pages.add(new WebPage("Southeastern Baptist Theological Seminary",
                "http://sebts.edu", "2002/01/15", "2024/02/02"));
        pages.add(new WebPage("Salem College",
                "http://salem.edu", "2003/01/15", "2024/02/05"));
        pages.add(new WebPage("William Peace University",
                "http://www.peace.edu", "2001/03/12", "2024/03/04"));
        pages.add(new WebPage("Cabarrus College of Health Sciences",
                "http://www.cabarruscollege.edu", "2000/09/24", "2024/02/05"));
        pages.add(new WebPage("Lenoir–Rhyne University",
                "http://lr.edu", "1994/04/15", "2024/02/09"));
        pages.add(new WebPage("Manna University",
                "http://www.manna.edu", "1992/05/19", "2024/02/08"));
        pages.add(new WebPage("Shepherds Theological Seminary",
                "http://www.shepherds.edu", "1993/05/19", "2024/02/01"));
        pages.add(new WebPage("Winston-Salem State University",
                "http://wssu.edu", "1993/02/13", "2024/03/07"));
        pages.add(new WebPage("University of North Carolina at Wilmington",
                "http://www.uncw.edu", "2003/02/15", "2024/03/03"));
        pages.add(new WebPage("Greensboro College",
                "http://greensboro.edu", "1994/06/13", "2024/03/06"));
        pages.add(new WebPage("Charlotte Christian College and Theological Seminary",
                "http://www.charlottechristian.edu", "1994/07/13", "2024/03/01"));
        pages.add(new WebPage("Johnson & Wales University - Charlotte",
                "http://www.jwu.edu", "1998/07/20", "2024/02/09"));
        pages.add(new WebPage("Barton College",
                "http://barton.edu", "2002/03/22", "2024/03/05"));
        pages.add(new WebPage("Queens University of Charlotte",
                "http://queens.edu", "1998/08/15", "2024/02/09"));
        pages.add(new WebPage("Livingstone College",
                "http://www.livingstone.edu", "2001/06/19", "2024/03/03"));
        pages.add(new WebPage("Carolina Christian College",
                "http://carolina.edu", "1993/08/22", "2024/03/01"));
        pages.add(new WebPage("University of Mount Olive",
                "http://umo.edu", "2000/05/16", "2024/03/01"));
        pages.add(new WebPage("Brevard College",
                "http://brevard.edu", "2000/06/27", "2024/02/02"));
        pages.add(new WebPage("Johnson C. Smith University",
                "http://www.jcsu.edu", "1995/03/19", "2024/03/08"));
        pages.add(new WebPage("Fayetteville State University",
                "http://uncfsu.edu", "2003/04/14", "2024/02/07"));
        pages.add(new WebPage("Appalachian State University",
                "http://appstate.edu", "2001/09/17", "2024/03/05"));
        pages.add(new WebPage("Elon University",
                "http://www.elon.edu", "1998/03/12", "2024/02/05"));
        pages.add(new WebPage("Mars Hill University",
                "http://www.mhu.edu", "1996/07/21", "2024/03/02"));
        pages.add(new WebPage("Elizabeth City State University",
                "http://ecsu.edu", "1996/08/17", "2024/02/09"));
        return pages;
    }
}
