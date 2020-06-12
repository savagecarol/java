import java.util.*;
class tomandjerry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x>0)
        {
            int p=sc.nextInt();
            Game obj=new Game();
            System.out.println(obj.play(p)); 
            x--;
        }
    }
}
class Game
{
    public int play(int n)
    {
          if(n%2 == 0)
        { 
            while(n>0)
            {
                if(n%2==0)    
                    n=n/2;
            
                else
                    return n/2;
            }     
        }
        else     
            return n/2;
        return 0;
    }
}