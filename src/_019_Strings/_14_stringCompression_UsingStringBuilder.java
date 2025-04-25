package _019_Strings;
// String Compression using of StringBuilder
public class _14_stringCompression_UsingStringBuilder {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbccdddd";
        System.out.println(compress(str));
    }
}
/*
Output:
a3b3c2d4
 */