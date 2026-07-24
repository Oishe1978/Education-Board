package Examiner;

public class ScriptEvaluation {
    private String scriptId;
    private double sectionAMarks;
    private double sectionBMarks;
    private double totalMarks;

    public ScriptEvaluation(String scriptId, double sectionAMarks, double sectionBMarks) {
        this.scriptId = scriptId;
        this.sectionAMarks = sectionAMarks;
        this.sectionBMarks = sectionBMarks;
        this.totalMarks = sectionAMarks + sectionBMarks;
    }


    public String getScriptId() {
        return scriptId; }
    public double getSectionAMarks() {
        return sectionAMarks; }
    public double getSectionBMarks() {
        return sectionBMarks; }
    public double getTotalMarks() {
        return totalMarks; }
}

