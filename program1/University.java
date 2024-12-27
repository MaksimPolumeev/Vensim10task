package program1;

public class University {

    public String name;
    public String address;
    public char phone;
    public University(String name) {
        this.name = name;
    }
    public void toProvideEducation() {
        throw new UnsupportedOperationException();
    }

    public void enrollApplicant(Applicant applicant) {
        AdministrativeEmployee admEmp = new AdministrativeEmployee();
        if (applicant.areDocumentsSubmitted()) {
            if (admEmp.checkDocuments(applicant)) {
                System.out.println("Документы действительны");
                System.out.println("Абитуриент " + applicant.getName() + " зачислен в " + name + ".");
                applicant.setEnrolled(true);
                admEmp.sendEnrollmentNotification(applicant);
            } else {
                System.out.println("Документы недействительны");
                System.out.println("Абитуриент " + applicant.getName() + " не принят из-за недействительных документов.");
            }
        } else {

            System.out.println("Абитуриент " + applicant.getName() + " не может быть зачислен, так как не подал документы.");
        }
    }

    public void addEmployee() {

        throw new UnsupportedOperationException();
    }

}
