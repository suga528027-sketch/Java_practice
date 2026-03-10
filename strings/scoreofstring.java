package strings;

public class scoreofstring {
    public static void main(String[] args) {
        String s="code";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int ch1 = s.charAt(i) - 'a';
            int  ch2 =s.charAt(i+1)-'a';
            sum+=Math.abs(ch1-ch2);
        }
        return sum;

    }
    
}
