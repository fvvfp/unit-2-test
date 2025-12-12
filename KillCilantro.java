public class KillCilantro {
   public static void main(String[] args) {
      String str1 = "abcdefcilantrozxcv cilantroCilantro poiu";
      String str2 = "CiLAntrocilantrocilantro12468cilantroooooooo  t   tcilantro";
      System.out.println(killCilantro(str1));
      System.out.println(killCilantro(str2));
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
