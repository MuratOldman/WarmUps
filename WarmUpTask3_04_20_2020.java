package WarmUps;

public class WarmUpTask3_04_20_2020 {
   /*
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can
    return the frequency of characters as a string from any given string

        Ex:
            FrequencyOfChars("ABABCB"); ==> "A2B3C1";

            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"

    */





    public static void main(String[] args) {
        String removeDup=WarmUpTask1_04_20_2020.removeDuplicate("AAABCCCDD");

        int frequency_A=WarmUpTask2_04_20_2020.frequency("AAABCCCDD","A");
        int frequency_B=WarmUpTask2_04_20_2020.frequency("AAABCCCDD","B");
        int frequency_C=WarmUpTask2_04_20_2020.frequency("AAABCCCDD","C");
        int frequency_D=WarmUpTask2_04_20_2020.frequency("AAABCCCDD","D");
        System.out.println("A"+frequency_A+"B"+frequency_B+"C"+frequency_C+"D"+frequency_D);
    }


















}
