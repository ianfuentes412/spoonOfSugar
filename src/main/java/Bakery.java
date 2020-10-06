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
    public class Bakery {

        public static void main (String args[])
        {
            boolean ending = false;
            
            while (ending == false)
            {
            Scanner scan = new Scanner(System.in);
            Stack<Product> st = new Stack<>();
            boolean isDone = false;
            int count = 0;
            String newbread;
            Bread addbread;
            boolean glutenfree = false;
            System.out.println("Welcome to Chaldea Bakery!");
               
            while(isDone == false)
            {
                System.out.println("What Bread would you like stocked?");
                newbread = scan.nextLine();
                System.out.println("What type of bread is it?(Cake, Flatbread or Other)");
                String newbreadtype = scan.nextLine();
                
                if (newbreadtype.equalsIgnoreCase("Cake"))
                {
                    
                    System.out.println("How much sugar does it have?");
                    int sugar = scan.nextInt();
                    System.out.println("Is this Gluten free?(Y/N)");
                    scan.nextLine();
                    
                    while(true)
                    {
                    String gluten = scan.nextLine();
                    if(gluten.equalsIgnoreCase("Y"))
                    {
                         glutenfree = true;
                         break;
                    }
                    else if (gluten.equalsIgnoreCase("N"))
                    {
                         glutenfree = false;
                         break;
                    }
                    else
                    {
                        System.out.println("Please Enter Y or N");
                    }
                    }
                    
                    Cake addcake = new Cake(newbread,sugar,glutenfree);
                    Shelf.showpush(st, addcake);
                }
                else if (newbreadtype.equalsIgnoreCase("FlatBread"))
                {
                    System.out.println("What type of FlatBread is it?");
                    String breadtypes = scan.nextLine();
                    System.out.println("What's the Flatbread's Diameter?");
                    int diam = scan.nextInt();
                    FlatBread addflat = new FlatBread(newbread,breadtypes,diam);
                    Shelf.showpush(st, addflat);
                }
                else
                {
                addbread = new Bread(newbread,newbreadtype);
                System.out.println(addbread.name);
                Shelf.showpush(st,addbread);
                }

                
                  System.out.println (st.peek().name + " is now on the shelf!");
                  System.out.println("It was made on " + st.peek().bakedtoString());
                  System.out.println("It will go bad on " +st.peek().ExpiredtoString());
                

                System.out.println("Do you want to add another product? (Y/N)");

                while(true)
                {
                    String ask = scan.nextLine();
                    if (ask.equalsIgnoreCase("N"))
                    {
                        isDone = true;
                        break;
                    }
                    else if (ask.equalsIgnoreCase("Y"))
                    {
                        isDone = false;
                        break;
                    }
                    else
                    {
                        System.out.println("Please Enter Y or N");
                    }
                }

            }
                if(Product.getProductCount() == 1 )
                    System.out.println("There is " + Product.getProductCount() + " product in the shelf.");
                   else
                   {
                    System.out.println("There are " + Product.getProductCount() + " products in the shelf.");
                   }
              Cake cake1 = new Cake("carrot",12, true );
              st.push(cake1);
              System.out.println(st.lastElement().name + " has been added to the shelf");

              FlatBread flat1 = new FlatBread("Grain","Sesame", 50);
              st.push(flat1);
              //flat1.getName();
              //flat1.bakedtoString();
              System.out.println(st.lastElement().name + " has been added to the shelf");
             
              
              for(int i =0; i < 3; i++)
             {
              System.out.println(st.peek().name + " has been removed from the Shelf.");
              st.lastElement().isItSold();
              Shelf.showpop(st);
              
             }
             
             System.out.println("There are " + Product.getProductCount() + " products in the count.");
             System.out.println("There are " +st.size() + " products in the stack");
            System.out.println("Do you want to run the program again?");
             while(true)
             {
                  String ends = scan.nextLine();
                    if(ends.equalsIgnoreCase("Y"))
                    {
                         ending = false;
                         break;
                    }
                    else if (ends.equalsIgnoreCase("N"))
                    {
                         ending = true;
                         break;
                    }
                    else
                    {
                        System.out.println("Please Enter Y or N");
                    }
             }
            }
        }

    }
