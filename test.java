import CIE.internals;
import SEE.externals;
import java.util.Scanner;

public class test{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int cmarks [] = new int[5];
        int smarks [] = new int[5];
 System.out.println("enter the num of students");
 int n = sc.nextInt();
for(int k=0;k<n;k++){

  System.out.println("enter the name of the student");
        String name = sc.next();
        System.out.println("enter the usn of the student");
        int usn = sc.nextInt();
        System.out.println("enter the sem of the student");
        int sem = sc.nextInt();


        System.out.println(" enter the cie marks of 5 subjects");

        for(int i=0;i<5;i++){
            cmarks[i] = sc.nextInt();
        }

        System.out.println(" enter the see marks of 5 subjects");

        for(int i=0;i<5;i++){
            smarks[i] = sc.nextInt();
        }

       



        internals o1 = new internals(name,usn,sem,cmarks);
        externals o2 = new externals(name,usn,sem,smarks);


        for(int i=1;i<=5;i++){
            System.out.println("the total marks of student in sub" + i);

            System.out.println(o1.marks[i-1] + (o2.smarks[i-1])*0.5);

        }}
    }
}