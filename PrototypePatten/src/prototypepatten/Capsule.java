
package prototypepatten;

public class Capsule extends MedicineType {

   public Capsule(){
     type = "Capsule";
   }

   @Override
   public void draw() {
      System.out.println("Inside Capsules::draw() method.");
   }
}