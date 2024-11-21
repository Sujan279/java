package CIE;
import CIE.Student;

public class internals extends Student {

    public int marks [] = new int [5];

    public internals(String name,int usn,int sem,int [] marks){
        super(name,usn,sem);
        this.marks= marks;
    }
}

