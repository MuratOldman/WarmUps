package Methods;

public class countOfCharacters {

    public static void main(String[] args) {
        CountOfCharacter("aaabbbcccdd");

    }


    public static int CountOfCharacter(String word){
        int count=0;
        word="aaabbbcccdd";
        String removeDuplicate="";
        for(int i=0; i<word.length();i++){
            if(!removeDuplicate.contains(""+word.charAt(i))){
                removeDuplicate+=word.charAt(i);
            }
        }


        for(int i=0;i<removeDuplicate.length();i++){
            count=0;
            for(int j=0;j<word.length();j++){
                if(removeDuplicate.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            System.out.print(""+removeDuplicate.charAt(i)+count);
        }

        return count;
    }








}
