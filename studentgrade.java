import java.util.*;

//  STDENT GRADE CALCULATOR CLASS
class gradecalculator {
    public static void main(String[] args) {
        int mat, phy, eng, hin, chem;
        System.out.println(" enter the  all subject name and  obtained (out of 100 )marks in each subjects :");
        System.out.println(" MATH\n PHYSICS \n ENGLISH \n HINDI\n chemistry");
        while (true) { 

            // INPUT OF SUBJECT MARKS

            Scanner sc = new Scanner(System.in);
            mat = sc.nextInt();
            phy = sc.nextInt();
            eng = sc.nextInt();
            hin = sc.nextInt();
            chem = sc.nextInt();

            //  CHEK FAIL OR PASS
            int sum = mat + phy + eng + hin + chem;
            if (sum < 165) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is F");
            } else if (sum < 180) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is D");

            } else if (sum < 250) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is C");
            } else if (sum < 300) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is B");
            } else if (sum < 350) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is B+");
            } else if (sum < 400) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is A");
            } else if (sum > 401) {
                System.out.println(" the total obatined marks (out of 500) is " + sum + "and grade is A+");
                System.out.println(" you are pass with honours");
            }
//  AVERAGE OF RESULT
            int avg = (sum / 5);
            System.out.println(" total persentage " + avg + "%");

        }

    }
}