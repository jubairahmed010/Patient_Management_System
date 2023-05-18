package Application;

import java.util.*;
import Application.src.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Outdoor Patients");
            System.out.println("2. Add Indoor Patients");
            System.out.println("3. Print Patients sorted by age");
            System.out.println("4. Print Patients with high or low blood pressure");
            System.out.println("5. Print patients invoice");
            System.out.println("6. Get average age of the patients");
            System.out.println("7. Get patient number by gender ");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addOutDoorPatients();
                    break;
                case 2:
                    addInDoorPatients();
                    break;
                case 3:
                    printPatientsByage();
                    break;
                case 4:
                    abnormalPressure();
                    break;
                case 5:
                    inVoice();
                    break;
                case 6:
                    averageAge();
                    break;
                case 7:
                    patientsByGender();
                    break;
                case 8:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        }
    }

    public static void addInDoorPatients() {
        for (int i = 0; i < 1; i++) {
            System.out.println(
                    "Enter age,name, gender,systolic, diastolic, diabetes point, bed no, and daily fee for indoor patient "
                            + (i + 1));
            int age = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            String gender = scanner.next();
            int systolic = scanner.nextInt();
            int diastolic = scanner.nextInt();
            double diabetesPoint = scanner.nextDouble();
            int bedNo = scanner.nextInt();
            double dailyFee = scanner.nextDouble();
            IndoorPatient patient = new IndoorPatient(name, gender, age, systolic, diastolic, diabetesPoint, bedNo,
                    dailyFee);
            patients.add(patient);
            System.out.println("Added successfully");
        }

    }

    public static void addOutDoorPatients() {
        for (int i = 0; i < 1; i++) {
            System.out.println(
                    "Enter age ,name, gender,  systolic, diastolic, diabetes point, specialty, and consultation fee for outdoor patient "
                            + (i + 1));
            int age = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            String gender = scanner.next();
            int systolic = scanner.nextInt();
            int diastolic = scanner.nextInt();
            double diabetesPoint = scanner.nextDouble();
            String specialty = scanner.next();
            double consultationFee = scanner.nextDouble();
            OutdoorPatient patient1 = new OutdoorPatient(name, gender, age, systolic, diastolic, diabetesPoint,
                    specialty,
                    consultationFee);
            patients.add(patient1);
            System.out.println("Added successfully");
        }
    }

    public static void printPatientsByage() {

        Collections.sort(patients);
        for (Patient patient : patients) {

            System.out.println(patient.toString());
        }
    }

    public static void abnormalPressure() {

        System.out.println("Patients with high or low blood pressure:");
        for (Patient p : patients) {
            if (p.getSystolic() > 120 || p.getDiastolic() < 80) {
                System.out.println(p.toString());
            }
        }
    }

    public static void inVoice() {
        for (Patient patient : patients) {
            if (patient instanceof IndoorPatient) {
                System.out.println("Indoor");
                System.out.println(patient);
                System.out.println("Bill: $" + patient.getInvoice());
                System.out.println();

            } else {
                System.out.println("Outdoor");
                System.out.println(patient);
                System.out.println("Bill: " + patient.getInvoice());
                System.out.println();

            }

        }
    }

    public static void averageAge() {
        int totalPatients = patients.size();
        int totalAge = 0;
        for (Patient patient : patients) {

            totalAge += patient.getAge();

        }

        double averageAge = (double) totalAge / totalPatients;
        System.out.println("Average age of the patients is:" + averageAge);
    }

    public static void patientsByGender() {
        int malePatients = 0;
        int femalePatients = 0;

        for (Patient patient : patients) {
            if (patient.getGender().equals("Male")) {
                malePatients++;
            } else {
                femalePatients++;
            }
            System.out.println("Male Patients: " + malePatients);
            System.out.println("Female Patients: " + femalePatients);
        }
    }

    public static void exit() {
        System.out.println("Exiting the program. Thank you!");
        System.exit(0);
    }

}
