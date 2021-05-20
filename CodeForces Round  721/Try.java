import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        while (t-- > 0)
        {
            String[] s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int l=Integer.parseInt(s[1]);
            int r=Integer.parseInt(s[2]);
            int size=(int) (((2*Math.pow(10, 5))+1));
            int ans2=0;
            Integer[] le =new Integer[size];
            Integer[] ri =new Integer[size];
            String[] s1=br.readLine().split(" ");
            for(int i=0;i<size;i++)
            {
                le[i]=0;
            }
            for(int i=0;i<size;i++)
                ri[i]=0;
            for(int i=0;i<l;i++)
            {
                int ele=Integer.parseInt(s1[i]);
                le[ele]++;
            }
            for(int i=0;i<r;i++)
            {
                int ele=Integer.parseInt(s1[l+i]);
                ri[ele]++;
            }
            for(int i=1;i<size;i++)
            {
                if(le[i]!=0&&ri[i]!=0)
                {
                    if(le[i]>=ri[i])
                    {
                        le[i]=le[i]-ri[i];
                        ri[i]=0;
                    }
                    else
                    {
                        ri[i]=ri[i]-le[i];
                        le[i]=0;
                    }
                }

            }
            int ll1=0,rr1=0;
            for(int i=1;i<size;i++)
            {
                if(le[i]!=0)
                {
                    ll1+=le[i];
                }
                if(ri[i]!=0)
                {
                    rr1+=ri[i];
                }
            }
            int ans=0;
            for(int i=1;i<size;i++)
            {
                if(le[i]%2==0)
                {
                    ans+=le[i]/2;
                    le[i]=0;
                }
                else
                {
                    ans+=(le[i]-1)/2;
                    le[i]=1;
                }
                if(ri[i]%2==0)
                {
                    ans+=ri[i]/2;
                    ri[i]=0;
                }
                else
                {
                    ans+=(ri[i]-1)/2;
                    ri[i]=1;
                }
            }
            int ll=0,rr=0;
            for(int i=1;i<size;i++)
            {
                if(le[i]==1)
                {
                    ll++;
                }
                if(ri[i]==1)
                {
                    rr++;
                }
            }
            if(ll>rr)
            {
                ans+=rr;
                ll=ll-rr;
                ans+=ll;
            }
            else
            {
                ans+=ll;
                rr=rr-ll;
                ans+=rr;
            }
            if(ll1>rr1)
            {
                ans2+=rr1;
                ll1=ll1-rr1;
                ans2+=ll1;
            }
            else
            {
                ans2+=ll1;
                rr1=rr1-ll1;
                ans2+=rr1;
            }
            System.out.println(Math.min(ans,ans2));
        }
    }
}