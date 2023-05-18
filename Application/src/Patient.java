package Application.src;

public class Patient implements Comparable<Patient> {
    private String name;
    private String gender;
    private int age;
    private int systolic;
    private int diastolic;
    private double diabetesPoint;

    public Patient(String name,String gender, int age, int systolic, int diastolic, double diabetesPoint) {
        this.name = name;
        this.gender=gender;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public double getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setDiabetesPoint(double diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

   

    @Override
    public String toString() {
        return "Patient [name=" + name + ", gender=" + gender + ", age=" + age + ", systolic=" + systolic
                + ", diastolic=" + diastolic + ", diabetesPoint=" + diabetesPoint + "]";
    }

    @Override
    public int compareTo(Patient o) {
        if (this.getAge() < o.getAge()) {
            return 1;
        } else if (this.getAge() > o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    

    public double getInvoice() {
        return 0.0;

    }



}
