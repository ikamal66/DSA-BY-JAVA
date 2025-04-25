package _019_Strings;

public class _16_reverseWord {
//    public static String reverseWord(String str){
//        String[] words = str.trim().split(" ");
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=words.length-1; i>=0; i--){
//            if(words[i].length() > 0){
//                sb.append(words[i]);
//                sb.append(' ');
//            }
//        }
//        return sb.toString();
//    }

    public static String revWord(String s){
        String ans = "";
        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder();
            while(i<s.length() && s.charAt(i)!=' '){
                sb.append(s.charAt(i));
                i++;
            }
            if(sb.length() != 0){
                ans = " " + sb + ans;
            }

        }
        return ans.substring(1);
    }
    public static void main(String[] args) {
        String str = "He is  a  boy   ";
//        System.out.println(reverseWord(str));
        System.out.println(revWord(str));

    }
}
/*
Output:
boy a is He
 */
