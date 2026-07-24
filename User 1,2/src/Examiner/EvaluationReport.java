package Examiner;


public class EvaluationReport {
    private String subjectCode;
    private double averageMarks;
    private double highestMarks;
    private int totalEvaluated;


    public EvaluationReport(String subjectCode, double averageMarks, double highestMarks, int totalEvaluated) {
        this.subjectCode = subjectCode;
        this.averageMarks = averageMarks;
        this.highestMarks = highestMarks;
        this.totalEvaluated = totalEvaluated;
    }

    // Getters and Setters
    public String getSubjectCode() {
        return subjectCode; }
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode; }

    public double getAverageMarks() {
        return averageMarks; }
    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks; }

    public double getHighestMarks() {
        return highestMarks; }
    public void setHighestMarks(double highestMarks) {
        this.highestMarks = highestMarks; }

    public int getTotalEvaluated() {
        return totalEvaluated; }
    public void setTotalEvaluated(int totalEvaluated) {
        this.totalEvaluated = totalEvaluated; }
}