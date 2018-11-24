
package prototypepatten;

public class Liquid extends MedicineType {

   public Liquid(){
     type = "Liquid";
   }

   @Override
   public void draw() {
      System.out.println("Inside Liquid::draw() method.");
   }
}