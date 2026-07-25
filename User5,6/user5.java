public class user1 class Result {
    private String resultId;
    private String studentId;
    private Date examYear;
    private double gpa;
    private String status;

    public double calculateGPA() {
        return this.gpa;
    }

    public void getResult() {
        // Fetch result
    }
}

class Attendance {
    private String attendanceId;
    private String studentId;
    private Date date;
    private int presentDays;
    private int absentDays;
    private double percentage;

    public double calculatePercentage() {
        return this.percentage;
    }

    public void getAttendance() {
        // Fetch attendance record
    }
}

class ExamSchedule {
    private String scheduleId;
    private String examSession;
    private String examDate;
    private String examVenue;
    private String subject;
    private String venue;

    public void getSchedule() {
        // Fetch schedule
    }

    public void getNotice() {
        // Fetch exam notice
    }
}

class AcademicProgress {
    private String progressId;
    private String studentId;
    private String term;
    private double gpa;
    private String remarks;

    public void calculateProgress() {
        // Calculate progress logic
    }

    public void getProgressReport() {
        // Fetch progress report
    }
}

class Notification {
    private String notificationId;
    private String title;
    private String message;
    private Date date;
    private boolean isRead;

    public void markAsRead() {
        this.isRead = true;
    }

    public void getAllNotifications() {
        // Fetch all notifications
    }
}

class Complaint {
    private String complaintId;
    private String subjects;
    private String description;
    private Date date;
    private String status;

    public void submit() {
        // Submit complaint
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}

class RegistrationInfo {
    private String registrationId;
    private String studentId;
    private String clazz; // 'class' is a reserved keyword in Java
    private String session;
    private String status;

    public void getRegistrationInfo() {
        // Fetch registration info
    }

    public boolean checkEligibility() {
        return true;
    }
}

class CorrectionRequest {
    private String requestId;
    private String studentId;
    private String filedToCorrect;
    private String correctValue;
    private String status;

    public void submitRequest() {
        // Submit request
    }

    public void getRequestStatus() {
        // Fetch status
    }
}{
}
