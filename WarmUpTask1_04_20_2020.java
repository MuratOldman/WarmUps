package Methods;



public class WarmUpTask1_04_20_2020 {

/*
 write a return method that accepts a String and removes duplicate values from the String

        Ex:
                RemoveDuplicate("aaabbbccc");  ==> "abc"
 */

  public static String removeDuplicate(String str){

      String removeDuplicated="";
      for(int i=1;i<str.length();i++){
          if(!removeDuplicated.contains(""+str.charAt(i))){
              removeDuplicated+=str.charAt(i);
          }
      }
      System.out.println(removeDuplicated);


      return removeDuplicated;
  }


    public static void main(String[] args) {
        removeDuplicate("");
    }





}
