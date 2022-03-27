/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noodles_is;

/**
 *
 * @author MANSUK SHANKAR
 */
public class Tabledata {
    private String  bnumber,name,  company, type,mdatey,mdatem, mdated,edatey,edatem,edated;
    private int price;

   
    
    
    public String getbnumber(){
        return bnumber;
    }
    public String getname(){
        return name;
    }
    public int getprice(){
        return price;
    } 
    public String getStringprice(){
        return String.valueOf(price);
    }
    public String getcompany(){
        return company;
    }
    public String gettype(){
        return type;
    }
    public String getmdatey(){
        return mdatey;
    }
    public String getmdatem(){
        return mdatem;
    }
    public String getmdated(){
        return mdated;
    }
    public  String getedatey(){
        return edatey;
    }
    public String getedatem(){
        return edatem;
    }
    public String getedated(){
        return edated;
    }
    Tabledata(String bnumber, String name, String price, String company, String type, String mdatey, String mdatem, String mdated, String edatey, String edatem,String edated) {
        this.bnumber = bnumber;
        this.name = name;
        this.price = Integer.parseInt(price);
        this.company = company;
        this. type = type;
        this.mdatey = mdatey;
        this.mdatem = mdatem;
        this.mdated = mdated;
        this.edatey = edatey;
        this.edatem = edatem;
        this.edated = edated;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return "Tabledata{" + "bnumber=" + bnumber + ", name=" + name + ", company=" + company + ", type=" + type + ", mdatey=" + mdatey + ", mdatem=" + mdatem + ", mdated=" + mdated + ", edatey=" + edatey + ", edatem=" + edatem + ", edated=" + edated + ", price=" + price + '}';
    }
}

