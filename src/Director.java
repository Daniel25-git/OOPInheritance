public class Director {
    private String fname;
    private String lame;
    private String gender;

    public Director(String fname, String lame, String gender) {
        this.fname = fname;
        this.lame = lame;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLame() {
        return lame;
    }

    public void setLame(String lame) {
        this.lame = lame;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Director: " + getFname() + " " + getLame();
    }

}
