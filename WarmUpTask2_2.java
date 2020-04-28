package Methods;

public class WarmUpTask2_2 {

    public static void main(String[] args) {

        String str1="write a return method that accepts a String and removes duplicate values from the String";
        String str2="String";
        int count=0;
        while (str1.contains(str2)) {

                str1=str1.replaceFirst(str2, "");
                count++;


        }

        System.out.println(count);

       // str1.replaceFirst()

    }

}
