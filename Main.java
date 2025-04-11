class AdmissionSystem {
    String studentName;
    double percentage;

    public AdmissionSystem(String studentName, double percentage) {
        this.studentName = studentName;
        this.percentage = percentage;
    }

    void checkEligibility() {
        System.out.println("Checking eligibility for: " + studentName);
    }
}

class UGAdmission extends AdmissionSystem {
    public UGAdmission(String studentName, double percentage) {
        super(studentName, percentage);
    }

    @Override
    void checkEligibility() {
        super.checkEligibility();
        if (percentage >= 60) {
            System.out.println(studentName + " is eligible for UG admission.");
        } else {
            System.out.println(studentName + " is not eligible for UG admission.");
        }
    }
}

class PGAdmission extends AdmissionSystem {
    public PGAdmission(String studentName, double percentage) {
        super(studentName, percentage);
    }

    @Override
    void checkEligibility() {
        super.checkEligibility();
        if (percentage >= 70) {
            System.out.println(studentName + " is eligible for PG admission.");
        } else {
            System.out.println(studentName + " is not eligible for PG admission.");
        }
    }
}

public class Admission{
    public static void main(String[] args) {
        UGAdmission ugStudent = new UGAdmission("John", 65);
        ugStudent.checkEligibility();

        PGAdmission pgStudent = new PGAdmission("Alice", 72);
        pgStudent.checkEligibility();
    }
}
