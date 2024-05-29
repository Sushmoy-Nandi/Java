package specialproblem2;

class LabQuiz extends Lab {
    private int quizMarks;

    public LabQuiz(String labName, int labID, int quizMarks) {
        super(labName, labID);
        this.quizMarks = quizMarks;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    public void setQuizMarks(int quizMarks) {
        this.quizMarks = quizMarks;
    }
}
