class Solution 
{
    public int mySqrt(int x) 
    {
        if (x < 2)
        {
            return x;
        }
        int r = x / 2;
        int l = 1;
        while (l <= r) 
        {
            int m = (r + l) / 2;
            if ((long)m*m > x) 
            {
                r = m - 1;
            } 
            else 
            {
                l = m + 1;
            }
        }
        return r;
    }
}
