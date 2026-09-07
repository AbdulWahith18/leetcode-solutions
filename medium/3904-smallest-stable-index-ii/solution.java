        int m = nums[0];
        for(int i = 0; i < l; i++) 
        {
            m = Math.max(m, nums[i]);
            max[i] = m;
        }
        int n = nums[l - 1];
        for(int i = l - 1; i >= 0; i--)
        {
            n = Math.min(n, nums[i]);
            min[i] = n;
        }
        int res=-1,com=Integer.MAX_VALUE;
        for(int i = 0; i < l; i++) 
        {
            if(max[i] - min[i] <= k&&max[i]-min[i]<com)
            {
                com=max[i]-min[i];
                res=i;
            }       
        }
        return res;
    }
}
