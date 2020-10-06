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
public abstract class Product 
{
    protected String name;
    //Use Current Date data type
    private static int totalProductCount; 
    private boolean isSold;
    private LocalDate dateofBaking;
    private LocalDate dateofExpiry;


public Product(String name)
{
       this.dateofBaking = LocalDate.now();
       this.dateofExpiry = dateofBaking.plusDays(30);
       this.name = name;
       this.isSold = false;
       NewProduct();
}

public static int NewProduct()
{
       totalProductCount = totalProductCount + 1;
       return totalProductCount;
}

public static int LostProduct()
{
    totalProductCount = totalProductCount - 1;
    return totalProductCount;
}

public static int getProductCount()
{
    return totalProductCount;
}

public boolean isItSold()
{
    if (isSold == false)
    {
        isSold = true;
        LostProduct();
    }
    else
    {
        System.out.println("The product is already sold.");
    }
    return isSold;
}

public String getName()
{
    return this.name;
}

public boolean getSold()
{
    return this.isSold;
}

public String bakedtoString()
{
    return dateofBaking.toString();
}

public String ExpiredtoString()
{
    return dateofExpiry.toString();
}
}