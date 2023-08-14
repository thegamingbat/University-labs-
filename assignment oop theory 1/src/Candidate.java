class Candidate {
    private String name;
    private int fscMarks;
    private int testScore;
    private int rollNo;

    public Candidate(String name, int fscMarks) {
        this.name = name;
        this.fscMarks = fscMarks;
    }

    public String getName() {
        return name;
    }

    public int getFscMarks() {
        return fscMarks;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
