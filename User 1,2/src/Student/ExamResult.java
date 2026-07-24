package Student;

public class ExamResult {
    private String subject;
    private String grade;
    private double marks;

    public ExamResult(String subject, String grade, double marks) {
        this.subject = subject;
        this.grade = grade;
        this.marks = marks;
    }

    public String getSubject()
    { return subject; }
    public String getGrade()
    { return grade; }
    public double getMarks()
    { return marks; }
}
