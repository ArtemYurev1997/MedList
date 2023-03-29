package by.pvt.mediclist;

import java.util.Arrays;

public class MedList {
    public static void main(String[] args) {
        Patient[] patients = initialize();
        System.out.println(Arrays.toString(getPatientByDiagnose(patients, "ÎĞÂÈ")));
        System.out.println();
        System.out.println(Arrays.toString(getPatientByCard(patients, 10, 20)));
    }

    static Patient[] initialize() {
        Patient[] patients = new Patient[6];
        Patient patient1 = new Patient("1", "Àäğåé", "Àíäğååâ",  "1990",   "Ïóøêèíà 22", 10, "ÎĞÂÈ");
        Patient patient2 = new Patient("2", "Èâàí", "Èâàíîâ",  "1992",  "Ïóøêèíà 27", 14, "×ÌÒ");
        Patient patient3 = new Patient("3", "Àëåêñåé", "Àëåêñååâ",  "1989",  "Ïóøêèíà 12", 16, "ÎĞÂÈ");
        Patient patient4 = new Patient("4", "Ñòåïàí", "Ñòåïàíîâ", "1994", "Ïóøêèíà 15", 18, "ÎĞÂÈ");
        Patient patient5 = new Patient("5", "Îëüãà", "Òèõàíîâè÷", "1995", "Ïóøêèíà 45", 19, "×ÌÒ");
        Patient patient6 = new Patient("6", "Åêàòåğèíà", "Ñìîëÿê", "1993", "Ïóøêèíà 33", 23, "ÂËÑ");
        patients[0] = patient1;
        patients[1] = patient2;
        patients[2] = patient3;
        patients[3] = patient4;
        patients[4] = patient5;
        patients[5] = patient6;

        return patients;
    }

    public static Patient[] getPatientByDiagnose(Patient[] patients, String diagnose) {
        Patient[] newPatient = new Patient[patients.length];
        int j = 0;
        for (Patient patient : patients) {
            if (patient.getDiagnose().equals(diagnose)) {
                System.out.println(patient.information());
                newPatient[j] = patient;
                j++;
            }
        }
        return newPatient;
    }

    public static Patient[] getPatientByCard(Patient[] patients, int a, int b) {
        Patient[] newPatient = new Patient[patients.length];
        int j = 0;
        for (Patient patient : patients) {
            if (patient.getNumberCard() > a && patient.getNumberCard() < b) {
                System.out.println(patient.information());
                newPatient[j] = patient;
                j++;
            }
        }
        return newPatient;
    }

}
