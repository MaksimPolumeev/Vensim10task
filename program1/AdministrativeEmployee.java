package program1;

public class AdministrativeEmployee extends Employee {

    public void organizeTheLearningProcess() {
        // TODO - implement AdministrativeEmployee.organizeTheLearningProcess
        throw new UnsupportedOperationException();
    }
    public boolean checkDocuments(Applicant applicant) {
        System.out.println("Проверка документов для: " + applicant.getName());
        return applicant.hasValidDocuments();
    }
    public void sendEnrollmentNotification(Applicant applicant) {
        if (applicant.isEnrolled()) {
            System.out.println("Уведомление: Абитуриенту " + applicant.getName() + " отправлено письмо о зачислении.");
        }
    }
    public String doAdministrativePaperWork() {
        // TODO - implement AdministrativeEmployee.doAdministrativePaperWork
        throw new UnsupportedOperationException();
    }
}
