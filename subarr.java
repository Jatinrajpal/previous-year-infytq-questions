import java.util.*;
class subarr
{
public static void main(String[] args) 
    { 
    
        ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >(); 
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
  	int t,n=0;
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	while(t-->0)
	{
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			a1.add(x);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
					ArrayList<Integer> s1=new ArrayList<Integer>();
	        			s1.add(a1.get(j));
					aList.add(s1);
			}	
		}	
    System.out.println(aList.size());
	}
       
     }
}
