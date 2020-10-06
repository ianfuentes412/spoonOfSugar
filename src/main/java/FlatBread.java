
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
public class FlatBread extends Bread {
    int diameter;
    public FlatBread(String name,String breadType, int diameter)
    {
    super(name, breadType);    
    this.diameter = diameter;    
    }
    
}
