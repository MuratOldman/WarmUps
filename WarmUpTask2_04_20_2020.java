package WarmUps;

public class WarmUpTask2_04_20_2020 {
 /*
 2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        EX:
            Frequency("AAABB", "A");  ==> 3

            Frequency("ABAB", "B"); ==> 2
  */


public static int frequency(String str1,String str2){
    int frequencyOf_str2=0;

       while (str1.contains(str2)){
            str1=str1.replaceFirst(str2," ");
             frequencyOf_str2++;
          }

       System.out.println(frequencyOf_str2);
       return frequencyOf_str2;
}

    public static void main(String[] args) {
        frequency("Muhtar java Batch18 java java javaaa","java");
    }

















}
