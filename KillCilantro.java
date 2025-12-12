public class KillCilantro {
   public static void main(String[] args) {
      String str = "abcdefcilantrozxcv cilantroCilantro poiu";
      System.out.println(killCilantro(str));
   }
   
   public static String killCilantro(String recipe) {
      String returning = "";
      int len = recipe.length();
      for (int i = 0; i < len; i++) {
         if (i <= len - 8 && recipe.substring(i, i+8).equals("cilantro")) {
            returning += "parsley";
            i += 7;
         } else {
            returning += recipe.substring(i, i+1);
         }
      }
      return returning;
      
   }
   
}
