package SEE;
import CIE.Student;


public class externals extends Student{
   public int smarks [] = new int[5];

   public externals(String name,int usn,int sem,int [] marks){
        super(name,usn,sem);
        this.smarks= marks;
    }
}