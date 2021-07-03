/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CASPER
 */
public class Books {
    
    private String title;
    private String pages;
    private String year;

    public Books(String title, String pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    public String getName() {
        return title;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
    
}
