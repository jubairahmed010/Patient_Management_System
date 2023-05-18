package Application.src;
import java.util.*;

public class IndoorPatient extends Patient {

    private Calendar admissionDate;
    private int bedNo;
    private double dailyFee;

    public IndoorPatient(String name, String gender, int age, int systolic, int diastolic, double diabetesPoint, int bedNo,
            double dailyFee) {
        super(name, gender,age, systolic, diastolic, diabetesPoint);
        this.admissionDate = Calendar.getInstance();
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    public Calendar getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Calendar admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    
    @Override
    public double getInvoice() {
        long admissionTime = admissionDate.getTimeInMillis();
        long currentTime = Calendar.getInstance().getTimeInMillis();
        int days = (int) Math.ceil(((currentTime - admissionTime) / (1000 * 60 * 60 * 24)));
        double bill=(days) * dailyFee;
        return bill;

    }

    @Override
    public String toString() {
        return super.toString() + ", Admission Date: " + admissionDate.getTime() + ", Bed No: " + bedNo
                + ", Daily Fee: $" + dailyFee ;
    }
}
