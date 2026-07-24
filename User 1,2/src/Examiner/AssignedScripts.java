package Examiner;

public class AssignedScripts {
    private String bundleId;
    private String subjectCode;
    private int totalScripts;
    private String status;

    public AssignedScripts(String bundleId, String subjectCode, int totalScripts, String status) {
        this.bundleId = bundleId;
        this.subjectCode = subjectCode;
        this.totalScripts = totalScripts;
        this.status = status;
    }


    public String getBundleId() {
        return bundleId; }
    public String getSubjectCode() {
        return subjectCode; }
    public int getTotalScripts() {
        return totalScripts; }
    public String getStatus() {
        return status; }
}

