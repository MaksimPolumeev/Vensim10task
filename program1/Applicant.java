package program1;

public class Applicant {
    private final String name;



    private boolean validDocuments;
    private boolean documentsSubmitted;
    private boolean enrolled;

    public Applicant(String name, boolean documentsSubmitted) {
        this.name = name;
        this.validDocuments = false;
        this.documentsSubmitted = documentsSubmitted;
        this.enrolled = false;
    }

    public String getName() {
        return name;
    }
    public void setValidDocuments(boolean validDocuments) {
        this.validDocuments = validDocuments;
    }
    public boolean hasValidDocuments() {
        return validDocuments;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public boolean areDocumentsSubmitted() {
        return documentsSubmitted;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }


    public void submitDocuments() {
        this.documentsSubmitted = true;
        System.out.println("Документы абитуриента " + name + " поданы.");
    }
}