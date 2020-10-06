/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work PC
 */
import java.util.*;
public class Shelf {
    public static void showpush(Stack st,Product name)
    {
        st.push(name);
        System.out.println("A new Product has been added. ");
    }
    
    public static Stack showpop(Stack st)
    
    {
        //Bread addbreads = new Bread (st.peek);
        st.pop();
        System.out.println("A product has been taken out. ");
        return st;
    }
    
    
    
}
