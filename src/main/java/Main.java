public class Main {

    public static void main(String[] args) {

        StudentDB firstGroup = new StudentDB(new String[]{"Tai", "Kai", "Mari"}, new int[]{1, 2, 2});


        System.out.println("Allstudentsmethod" + firstGroup.getAllStudents());
        System.out.println(firstGroup.toString());
        System.out.println("randomstudent " + firstGroup.randomStudent());


    }
}