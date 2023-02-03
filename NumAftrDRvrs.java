class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=reverse(num);
        if (num==reverse(n))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int reverse(int n)
    {
        int r=0;
        while(n!=0)
        {
            int d=n%10;
            r= r*10+d;
            n=n/10;
        }
        return r;
    }
}
