package specialproblem2;

class Lab {
    private String labName;
    private int labID;
    // Constructor
    public Lab(String labName, int labID) {
        this.labName = labName;
        this.labID = labID;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public int getLabID() {
        return labID;
    }

    public void setLabID(int labID) {
        this.labID = labID;
    }
}
