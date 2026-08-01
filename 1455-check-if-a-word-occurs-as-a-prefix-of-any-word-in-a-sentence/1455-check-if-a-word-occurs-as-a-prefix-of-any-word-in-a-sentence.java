class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = 0;
        String arr[] = sentence.split(" ");
        int ind =1;
        for(String i :arr)
        {
            if(i.length() >= searchWord.length() &&  i.substring(0 , searchWord.length()).equals(searchWord))
            {
                return ind;
            }
            ind++;
        }
        return -1;
    }
}