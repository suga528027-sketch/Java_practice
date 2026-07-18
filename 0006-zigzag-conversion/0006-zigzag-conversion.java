class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<numRows)
        {
            return s;
        }
        StringBuilder rows[] = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i]=new StringBuilder();
        }
            int cur=0;
            boolean b=false;
            for(char c : s.toCharArray())
            {
                rows[cur].append(c);

                if(cur==0  || cur==numRows-1)
                {
                    b=!b;
                }
                if(b){
                    cur++;
                }
                else
                {
                    cur--;
                }
            }
        
        StringBuilder sb=new StringBuilder();
        for(StringBuilder row : rows)
        {
            sb.append(row);

        }
        return sb.toString();
    }
}