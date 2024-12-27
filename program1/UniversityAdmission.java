package program1;

import java.util.Scanner;

public class UniversityAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        University university = new University("Воронежский Государственный Университет");

        System.out.println("Введите количество абитуриентов: ");
        int applicantCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= applicantCount; i++) {
            System.out.println("Введите имя абитуриента " + i + ": ");
            String name = scanner.nextLine();
            System.out.println("Подает ли абитуриент документы? (true/false): ");
            boolean willSubmit = scanner.nextBoolean();
            scanner.nextLine();


            Applicant applicant = new Applicant(name, willSubmit);
            if (willSubmit) {
                applicant.submitDocuments();
            }
            System.out.println("Документы абитуриента действительны? (true/false): ");
            boolean validDocuments = scanner.nextBoolean();
            applicant.setValidDocuments(validDocuments);
            scanner.nextLine();


            university.enrollApplicant(applicant);
        }
        scanner.close();
    }
}