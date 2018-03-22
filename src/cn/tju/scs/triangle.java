package cn.tju.scs;

public class triangle {

	public static int check(int a,int b,int c)
	{
		if(!(a>=0&&b>=0&&c>=0))
		{
			return 0;//不成三角
		}
		
		int maxn=Math.max(c,Math.max(a,b));
		int sum=(a+b+c);
		
		if(!(sum>2*maxn))
		{
			return 0;//不成三角
		}
		if(a==b&&b==c)
		{
			return 1;//等边
		}
		else if(a==b||b==c||a==c)
		{
			return 2;//等腰
		}
		else 
		{
			return 3;//普通
		}
	}
}
