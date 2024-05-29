package specialproblem2;

class LabAttendance extends Lab {
    private int totalClasses;
    private int attendedClasses;

    public LabAttendance(String labName, int labID, int totalClasses, int attendedClasses) {
        super(labName, labID);
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public void setTotalClasses(int totalClasses) {
        this.totalClasses = totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public void setAttendedClasses(int attendedClasses) {
        this.attendedClasses = attendedClasses;
    }
}
