class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class maxmin
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        int l = (int)n;
        long mi = a[0];
        long mx = a[0];
        for(int i = 0;i<n;i++){
            if(mi > x)
                mi = x;
            if(mx < x)
                mx = x;
        }
        Pair p = new Pair(mi,mx);
        return p;
    }
}