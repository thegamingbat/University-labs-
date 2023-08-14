
import java.util.*;

class AdmissionForm {
    private static int formCounter = 1;
    private Map<Integer, Candidate> forms = new HashMap<>();
    private List<Candidate> eligibleCandidates = new ArrayList<>();
    private List<Candidate> meritList = new ArrayList<>();

    public int submitForm(String name, int fscMarks) {
        Candidate candidate = new Candidate(name, fscMarks);
        forms.put(formCounter, candidate);
        formCounter++;
        return formCounter - 1; // Return the unique form number
    }

    public void displayEligibleCandidates() {
        for (Candidate candidate : eligibleCandidates) {
            System.out.println("Form No: " + candidate.getRollNo() + ", Name: " + candidate.getName());
        }
    }

    public void enterTestScore(int formNo, int testScore) {
        Candidate candidate = forms.get(formNo);
        if (candidate != null) {
            candidate.setTestScore(testScore);
            eligibleCandidates.add(candidate);
        }
    }

    public void generateMeritList() {
        eligibleCandidates.sort(Comparator.comparingInt(Candidate::getTestScore).reversed());

        int count = Math.min(200, eligibleCandidates.size());
        for (int i = 0; i < count; i++) {
            Candidate candidate = eligibleCandidates.get(i);
            candidate.setRollNo(i + 1);
            meritList.add(candidate);
        }

        displayMeritList();
    }

    public void displayMeritList() {
        for (Candidate candidate : meritList) {
            System.out.println("Roll No: " + candidate.getRollNo() + ", Name: " + candidate.getName()
                    + ", Test Score: " + candidate.getTestScore());
        }
    }
}
