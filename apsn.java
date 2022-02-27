public class apsn {
    public static void main(String[] args) {
        String s = "Aditya Pratap Singh Negi";
        s = s.trim();
        s = " " + s;
        int p = s.lastIndexOf(' ');
        String lastname = s.substring(p+1);
        lastname = Character.toUpperCase(lastname.charAt(0)) + lastname.substring(1);
        s = s.substring(0, p);
        s = s.toUpperCase();
        String n = "";
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == ' ')
            {
               n = n + s.charAt(i+1) + ".";
            }
        }
        n = n + " " + lastname;
        System.out.println(n);
    }
}
