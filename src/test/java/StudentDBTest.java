import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents() {
    }

    @Test
    void testToString() {
    }
}

/*

Mögliche Lösung vom Internet
public class StudentDBTest {
    @Test
    public void testGetAllStudentsEmpty() {
        Student[] students = {};
        StudentDB db = new StudentDB(students);
        Student[] expected = {};
        Student[] actual = db.getAllStudents();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetAllStudentsOneStudent() {
        Student[] students = {new Student("Alice", 1)};
        StudentDB db = new StudentDB(students);
        Student[] expected = students;
        Student[] actual = db.getAllStudents();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetAllStudentsMultipleStudents() {
        Student[] students = {new Student("Alice", 1), new Student("Bob", 2), new Student("Charlie", 3)};
        StudentDB db = new StudentDB(students);
        Student[] expected = students;
        Student[] actual = db.getAllStudents();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testToStringEmpty() {
        Student[] students = {};
        StudentDB db = new StudentDB(students);*/
