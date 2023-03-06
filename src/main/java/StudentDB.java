public class StudentDB {

    private String [] studentName;
    private int [] studentID;

    public StudentDB (String[] studentName, int[] studentID){
        System.out.println("A new student list has been created");
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String[] getAllStudents(){

        return studentName;
    }

    public String toString (){
        // schleife?

        for (String a : this.studentName){
            System.out.println(a);
        }

        return "Student List Complet";

    }
    public String randomStudent(){
        int variable = (int) (Math.random() * 3);
        return studentName[variable];
    }


}
