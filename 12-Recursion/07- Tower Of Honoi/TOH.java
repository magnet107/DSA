import java.lang.constant.Constable;

public class TOH {
    public static void main(String[] args) {
        toh(3,'A','B','C');
        }
    public static void toh(int n,char Source,char aux,char dest)
    {
        if(n==1)
        {
            System.out.println("Moving disk 1 from "+Source+" to "+dest);
            return;
        }
        toh(n-1,Source,dest,aux);
        System.out.println("Moving "+n+" from "+Source+" to "+dest);
        toh(n-1,aux,Source,dest);
    }
}
