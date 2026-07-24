package Examiner;


public class Examiner {
    private String examinerId;
    private String name;
    private String email;
    private String specialization;
    private String department;


    public Examiner(String examinerId, String name, String email, String specialization, String department) {
        this.examinerId = examinerId;
        this.name = name;
        this.email = email;
        this.specialization = specialization;
        this.department = department;
    }

    // Getters and Setters
    public String getExaminerId() {
        return examinerId; }
    public void setExaminerId(String examinerId) {
        this.examinerId = examinerId; }

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }

    public String getEmail() {
        return email; }
    public void setEmail(String email) {
        this.email = email; }

    public String getSpecialization() {
        return specialization; }
    public void setSpecialization(String specialization) {
        this.specialization = specialization; }

    public String getDepartment() {
        return department; }
    public void setDepartment(String department) {
        this.department = department; }
}