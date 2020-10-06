
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work PC
 */

public class Cake extends Product {
    public int sugarContent;
    public boolean glutenFree;
    
    public Cake (String name, int sugarContent, boolean glutenFree)
    {
        super(name);
        this.sugarContent = sugarContent;
        this.glutenFree = glutenFree;
    }
}
