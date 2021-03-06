import java.util.Iterator;
import java.util.Enumeration;
import java.util.ArrayList;

/**
 * This class represents a furniture manufacturing company
 *
 * @author POO teaching staff
 * @version 1.0
 * @since Autumn 2016
 * @modified David Doblas Jiménez
 */

public class Factory{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * This attribute stores the list of materials
    */
   private ArrayList<Material> materials;

   /**
    * This attribute stores the list of colors
    */
   private ArrayList<Color> colors;

   /**
    * This attribute stores the list of products
    */
   private ArrayList<Furniture> furniture;

   /**
    * This attribute stores the list of orders
    */
   private ArrayList<Order> orders;

   /**
    * Constructor method
    */
   public Factory() {
		 this.materials = new ArrayList<Material>();
     this.colors = new ArrayList<Color>();
     this.furniture = new ArrayList<Furniture>();
     this.orders = new ArrayList<Order>();
   }

   /**
    * This method adds an element to the list of materials
    * @param m
    */
	public void add(Material m) {
		this.materials.add(m);
	}

  /**
   * This method adds an element to the list of colors
   * @param c
   */
 public void add(Color c) {
	 this.colors.add(c);
 }

   /**
    * This method adds an element to the list of furniture
    * @param f
    */
	public void add(Furniture f) {
		this.furniture.add(f);
	}

   /**
    * This method adds an element to the list of orders
    * @param o
    */
	public void add(Order o) {
		this.orders.add(o);
	}

   /**
    * This method generates and returns the information of every element in the materials list of the factory, in
    * the order they were introduced.
    */
   public String listOfMaterials() {
		 StringBuilder sb = new StringBuilder();
     for (Iterator<Material> it = materials.iterator(); it.hasNext();) {
			 Material m = (Material) it.next();
       sb.append(m.toString());
     }
     return sb.toString();
   }

   /**
    * This method generates and returns the information of every element in the colors list of the factory, in
    * the order they were introduced.
    */
   public String listOfColors() {
		 StringBuilder sb = new StringBuilder();
     for (Iterator<Color> it = colors.iterator(); it.hasNext();){
			 Color c = (Color) it.next();
    	 sb.append(c.toString() + NL);
     }
     return sb.toString();
   }

   /**
    * This method generates and returns the information of every element in the products list of the factory, in
    * the order they were introduced.
    */
   public String listOfFurniture() {
		 StringBuilder sb = new StringBuilder();
     for (Iterator<Furniture> it = furniture.iterator(); it.hasNext();){
			 Furniture f = (Furniture) it.next();
    	 sb.append(f.toString() + NL);
     }
     return sb.toString();
   }

   /**
    * This method generates and returns the information of every element in the orders list of the factory, in
    * the order they were introduced.
    */
   public String listOfOrders() {
		 StringBuilder sb = new StringBuilder();
     for (Iterator<Order> it = orders.iterator(); it.hasNext();){
			 Order o = (Order) it.next();
    	 sb.append(o.toString() + NL);
     }
     return sb.toString();
   }

   /**
    * This method generates and returns the information of those elements in the furniture list of the factory,
    * whose price is comprised between a minimum and a maximum values (both included).
    * @param min
    *             minimum price
    * @param max
    *             maximum price
    */
   public String listFurnitureInPriceRange(double min, double max) {
		 StringBuilder sb = new StringBuilder();
     for (Iterator<Furniture> it = furniture.iterator(); it.hasNext();) {
			 Furniture f = (Furniture) it.next();
       if ((f.price() >= min) && (f.price() <= max))
				 sb.append(f.toString() + NL);
     }
     return sb.toString();
   }

   /**
    * This method removes an Order object from the list orders by using the appropriate method of ArrayList class.
    * To do that, it is necessary to redefine the equals method on class Order, to define whether two Order
    * objects are equals (see description of equals method in class Order)
    */
   public boolean removeOrder(Order order) {
	   for(Iterator it = this.orders.iterator(); it.hasNext();) {
		   Order myOrder = (Order)it.next();
		   if(myOrder.equals(order))
			   return this.orders.remove(order);
	   }
	   return false;
   }
}
