class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<Integer>();
        for(int text1:nums1)
        {
            list1.add(text1);
        }
        List<Integer> list2 = new ArrayList<Integer>();
        for(int text2:nums2)
        {
            list2.add(text2);
        }
        List<Integer> merge = new ArrayList<Integer>();
        merge.addAll(list1);
        merge.addAll(list2);
        Collections.sort(merge);

        int[] arr = new int[merge.size()];
        for (int i = 0; i < merge.size(); i++)
        {
            arr[i]=merge.get(i);
        }
        int n=arr.length;
        double m=median(arr,n);
        return m;   
    }
    public double median(int a[], int n)
    {
        if (n % 2 != 0)
        {
            return (double)a[n / 2];
        }
        return (double)(a[(n-1)/2] + a[n/2])/2.0;
    }
}
