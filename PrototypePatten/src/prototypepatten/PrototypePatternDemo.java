
package prototypepatten;

public class PrototypePatternDemo {
   public static void main(String[] args) {
      MedicineTypeCache.loadCache();

      MedicineType clonedMedicineType = (MedicineType) MedicineTypeCache.getMedicineType("1");
      System.out.println("Type : " + clonedMedicineType.getType());		

      MedicineType clonedMedicineType2 = (MedicineType) MedicineTypeCache.getMedicineType("2");
      System.out.println("Type : " + clonedMedicineType2.getType());		

      MedicineType clonedMedicineType3 = (MedicineType) MedicineTypeCache.getMedicineType("3");
      System.out.println("Type : " + clonedMedicineType3.getType());		
   }
}


