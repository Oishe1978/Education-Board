package model;

import java.util.List;

public class ExamRegistration {
    private String registrationId;
    private String examType;
    private List<String> subjects;
    private boolean isApproved;


    public ExamRegistration(String registrationId, String examType, List<String> subjects, boolean isApproved) {
        this.registrationId = registrationId;
        this.examType = examType;
        this.subjects = subjects;
        this.isApproved = isApproved;
    }


    public String getRegistrationId() { return registrationId; }
    public void setRegistrationId(String registrationId) { this.registrationId = registrationId; }

    public String getExamType() { return examType; }
    public void setExamType(String examType) { this.examType = examType; }

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }

    public boolean isApproved() { return isApproved; }
    public void setApproved(boolean approved) { this.isApproved = approved; }
}