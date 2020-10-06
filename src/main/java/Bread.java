/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work PC
 */
import java.time.LocalDate;
public class Bread extends Product
{
    protected String breadType;
    
    public Bread (String name, String breadType)
    {
        super(name);
        this.breadType = breadType;
    }
}
