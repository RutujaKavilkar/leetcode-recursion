//Better

class Main {

    public static int countGoodNumbers(long n)
    {
        long mod=1000000007;
        long even=(n+1)/2;
        long odd=n/2;
        long a=1;
        for(int i=0;i<even;i++)
        {
            a=(a*5)%mod;
        }
        long b=1;
        for(int i=0;i<odd;i++)
        {
            b=(b*4)%mod;
        }
        return (int)((a*b)%mod);

    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(countGoodNumbers(n));
    }
}


//optimal
class Main {

    static long mod=1000000007;
    public static int countGoodNumbers(long n)
    {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=(power(5,even)*power(4,odd))%mod;
        return (int) ans;

    }
    public static long power(long x,long n)
    {
        long ans=1;
        while(n>0)
        {
            if(n%2==1)
            {
                ans=(ans*x)%mod;
                n--;
            }
            else
            {
                x=(x*x)%mod;
                n/=2;

            }
        } return ans;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(countGoodNumbers(n));
    }
}


