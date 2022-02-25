/**
 * stringrev
 */
public class stringrev {

    public static void main(String[] args){
        String s = "we are the world";
        s = " " + s + " ";
        String n = "";
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)==' ')
            {
                n = n + s.substring(i+1);
                s = s.substring(0,i+1);
            }
        }
        System.out.println(n);
    }
}
