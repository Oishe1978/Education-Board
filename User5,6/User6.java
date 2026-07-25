public class User2 {class FeeCollection {
    private String collectionId;
    private String institutionId;
    private double amount;
    private String transactionNo;
    private Date paymentDate;
    private String status;

    public void collectFee() {
        // Collect fee logic
    }

    public void generateReceipt() {
        // Generate receipt
    }
}

    class PaymentVerification {
        private String verificationId;
        private String institutionId;
        private String period;
        private Date verifiedOn;
        private String verifiedBy;
        private String status;

        public boolean verifyPayment() {
            return true;
        }

        public void getVerificationReport() {
            // Fetch verification report
        }
    }

    class FinancialReport {
        private String reportId;
        private String reportType;
        private Date fromDate;
        private Date toDate;
        private Date generatedOn;

        public void generate() {
            // Generate financial report
        }

        public void exportToPDF() {
            // Export logic
        }
    }

    class ScholarshipPayment {
        private String scholarshipId;
        private String studentId;
        private double amount;
        private Date paymentDate;
        private String status;

        public void processPayment() {
            // Process scholarship payment
        }

        public void getPaymentDetails() {
            // Fetch details
        }
    }

    class FeeRefund {
        private String refundId;
        private String studentId;
        private double amount;
        private String transactionRef;
        private Date refundDate;
        private String status;

        public void processRefund() {
            // Process refund
        }

        public void generateRefundSlip() {
            // Generate refund slip
        }
    }

    class UnpaidFeeMonitor {
        private String monitorId;
        private String studentId;
        private String session;
        private double totalDue;
        private Date asOfDate;

        public void getDueList() {
            // Fetch due list
        }

        public void getStatistics() {
            // Fetch statistics
        }
    }

    class TransactionApproval {
        private String transactionId;
        private String type;
        private double amount;
        private String requestedBy;
        private String status;

        public void approve() {
            this.status = "Approved";
        }

        public void reject() {
            this.status = "Rejected";
        }
    }

    class BudgetExpenditure {
        private String budgetId;
        private String fiscalYear;
        private double budgetAmount;
        private double expenditure;
        private String status;

        public void updateBudget() {
            // Update budget logic
        }

        public void getBudgetReport() {
            // Fetch budget report
        }
    }
}
