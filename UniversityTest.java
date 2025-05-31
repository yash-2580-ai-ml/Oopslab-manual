public class UniversityTest {
    public static void main(String[] args) {
        University uni = new University("Amrita Vishwa Vidyapeetham");

        University.Department dept = uni.new Department("CSE", "CSE101");
        University.Student student = uni.new Student("Y Yashaswi Reddy", "AV.SC.U4CSE24351");

        dept.displayDepartmentDetails();
        student.displayStudentDetails();

        System.out.println("Yashaswi Reddy 24351 CSE-C");
    }
}

class University {
    String universityname;

    public University(String universityname) {
        this.universityname = universityname;
    }

    class Department {
        String deptname;
        String deptcode;

        public Department(String deptname, String deptcode) {
            this.deptname = deptname;
            this.deptcode = deptcode;
        }

        public void displayDepartmentDetails() {
            System.out.println("University: " + universityname);
            System.out.println("Department Name: " + deptname);
            System.out.println("Department Code: " + deptcode);
        }
    }

    class Student {
        String studentname;
        String rollNo;

        public Student(String name, String roll) {
            this.studentname = name;
            this.rollNo = roll;
        }

        public void displayStudentDetails() {
            System.out.println("University: " + universityname);
            System.out.println("Student Name: " + studentname);
            System.out.println("Roll Number: " + rollNo);
        }
    }
}
