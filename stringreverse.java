public class stringrevall 
{
    public static void main(String[] args) 
    {
       String s = "we are the world";
       s = s + " ";
       String n = "";
       int pri = 0;
       for(int i = 0; i < s.length(); i++)
       {
           if(s.charAt(i) == ' ')
           {
               for (int j = i - 1; j >=  pri; j--) 
               {
                   n = n + s.charAt(j);
               }
               pri = i+1;
               n = n + " ";
           }
       }
       System.out.println(n);
    }
}
