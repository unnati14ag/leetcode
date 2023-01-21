class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int s = strs.length;
        if (s == 0)
            return "";
  
        if (s == 1)
            return strs[0];

        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[s-1].length());
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[s-1].charAt(i))
            i++;
        String pf = strs[0].substring(0, i);
        return pf;
    }
}
