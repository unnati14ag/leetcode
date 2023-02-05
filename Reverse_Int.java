class Solution 
{
    public int reverse(int n) 
    {
        int rev=0;
        final int top_limit = Integer.MAX_VALUE/10;
        final int bottom_limit = Integer.MIN_VALUE/10;
        while(n!=0)
        {
            if (rev > top_limit || rev < bottom_limit)
                return 0;
            int d=n%10;
            rev= d+rev*10;
            n=n/10;
        }
        return rev;
    }
}
