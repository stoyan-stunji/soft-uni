import java.util.Scanner;

public class pet_shop {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double var2 = Double.parseDouble(var1.nextLine());
      double var4 = Double.parseDouble(var1.nextLine());
      var2 *= 2.5D;
      var4 *= 4.0D;
      double var6 = var2 + var4;
      System.out.println(var6 + " lv.");
      var1.close();
   }
}
