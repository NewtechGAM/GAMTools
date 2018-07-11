import java.util.*;
class FlamesPlay
{
	public static void main(String[] args)
	{
		String x= "gnan";
		String y= "thanu";
		String t = "N";
	    int xInd = 0, yInd = 0, unMatchCount=0, flameLetter = 0, fCnt=0;	
	    System.out.println("Are you here to play Flames with me?? Enter y to proceed. enter any key to get ignored");
		t=new Scanner(System.in).nextLine();
		if ((t.charAt(0))=='y') {
			System.out.println("Uh Okay! Give the name first");
			x=new Scanner(System.in).nextLine();
			System.out.println("pfff! Why don't you give one more name now");
			y = new Scanner(System.in).nextLine();
			StringBuilder a= new StringBuilder(x);
			StringBuilder b = new StringBuilder(y);
			reset1:
			for (int i=0;xInd<x.length();i++)
			{
				yInd = 0;
				for(int j=0;yInd<y.length();j++)
				{
					if (x.charAt(xInd)==y.charAt(yInd))
					{ 
						x = a.deleteCharAt(xInd).toString();
						y = b.deleteCharAt(yInd).toString();
						xInd = 0; yInd = 0;
						continue reset1;	
					}
					yInd++;	
				}
				xInd++;
			}
			unMatchCount= x.length()+y.length();
			x="flames";
			flameLetter = unMatchCount%x.length();  
			
			StringBuilder fA = new StringBuilder(x);
			fReset:
			for (int i=0;x.length()>1;i++)
			{
				fA = new StringBuilder(x);			
				x = fA.deleteCharAt(flameLetter-1).toString();
				x = x.substring(flameLetter-1,x.length())+x.substring(0,flameLetter-1);
				if (unMatchCount%x.length() != 0)
				{
					flameLetter=unMatchCount%x.length();
				}
				continue fReset;			
			}	
			char z =(x.trim()).charAt(0);
			System.out.println(z);
			if (z=='f')
			{
				System.out.println("As Per My Bot, Both Of You Guys are Friends");
			}
			else if (z=='l')
			{
				System.out.println("As Per My Bot, Both Of You Guys are Lovers");
			}
			else if (z=='a')
			{
				System.out.println("Both Of You Guys are Admired towards each other this is just a speculation from my Bot");
			}
			else if (z=='m')
			{
				System.out.println("As Per My Bot, Both Of You Guys are going to get Married");
			}
			else if (z=='e')
			{
				System.out.println("As Per My Bot, Both Of You Guys are damn enemies");
			}
			else if (z=='s')
			{
				System.out.println("As Per My Bot, Both Of You Guys are So supportive against each other");
			}
		}
	}
}