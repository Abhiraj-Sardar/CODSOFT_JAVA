import java.util.Scanner;
public class GradeCalculator {
    public static void main(String args[])
    {
        System.out.println("--------------------------------");
        System.out.println("Student Grade Calculator");
        System.out.println("--------------------------------");
        System.out.println("Enter The Number Of Subjects:");
        Scanner sc = new Scanner(System.in);
        int sub=sc.nextInt();
        System.out.println("--------------------------------");
        int tot=0;
        String grade;
        int marks[] = new int[sub];
        for(int i=0;i<sub;i++)
        {
            System.out.println("Enter The Marks (out of 100) for Subject "+(i+1)+":");
            marks[i]=sc.nextInt();
            tot=tot+marks[i];
            System.out.println("--------------------------------");
        }
        int avg=tot/sub;
        if(avg>90)
        {
            grade="A+";
        }
        else if(avg>=80 && avg<90 )
        {
            grade="A";
        }
        else if(avg>=70 && avg<80)
        {
            grade="B";
        }
        else if(avg>=60 && avg<70)
        {
            grade="C";
        }
        else if(avg>=50 && avg<60)
        {
            grade="D";
        }
        else if(avg>40 && avg<50)
        {
            grade="F";
        }
        else
        {
            grade="FAIL";
        }
        System.out.println("Your Total Marks : "+tot);
        System.out.println("Your Average Percentage : "+avg+"%");
        System.out.println("Your Grade : "+grade);
        System.out.println("--------------------------------");
    }
}
