public class core import java.util.Date;

// --- Core Abstract User Class ---
abstract class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String email;
    protected String role;

    public boolean login(String username, String passwordStr) {
        // Implementation for login logic
        return true;
    }

    public void logout() {
        // Implementation for logout logic
    }

    public boolean changePassword(String oldPwdStr, String newPwdStr) {
        // Implementation for changing password
        return true;
    }
}

// --- Guardian (Inherits from User) ---
class Guardian extends User {
    private String guardianId;
    private String relationWithStudent;
    private String phone;
    private String address;

    public void viewProfile() {
        // View profile implementation
    }

    public void updateProfile(String info) {
        // Update profile implementation
    }
}

// --- Finance Officer (Inherits from User) ---
class FinanceOfficer extends User {
    private String officerId;
    private String designation;
    private String department;
    private String phone;

    public void viewDashboard() {
        // View dashboard implementation
    }

    public Report generateReport(String criteria) {
        // Generates and returns a report
        return new Report();
    }
}{
}
