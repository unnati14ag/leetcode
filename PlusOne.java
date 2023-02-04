class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < digits.length; i++)
            list.add(digits[i]);
        int index= list.size() - 1;
        while ((index >= 0) && (list.get(index) == 9))
        {
            list.set(index, 0);
            index -= 1;
        }
        if (index < 0)
        {
            list.set(0, 1);
            list.add(list.size(),0);
        }
        else
            list.set(index, list.get(index) + 1);
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }
}
