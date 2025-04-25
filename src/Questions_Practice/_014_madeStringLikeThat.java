package Questions_Practice;
/*
    Problem : Write a java program to fill in a letter template which looks like below:
                letter = "Dear<|name|>, Thanks a lot"
                Replace <\name\> with a String (some name)
 */
public class _014_madeStringLikeThat {
    public static void main(String[] args) {
        String str = "Dear<|name|>, Thanks a lot";
        System.out.println(str.replace("<|name|>"," kamal"));
    }
}
/*
Output:
Dear kamal, Thanks a lot
 */