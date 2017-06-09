package algorithmsproyect;

public class Movie {

    private int code;
    private String title;
    private String gender;
    private int total;
    private int subtitled;
    private int premier;

    public Movie() {
        this.code = 0;
        this.title = "";
        this.gender = "";
        this.total = 0;
        this.subtitled = 0;
        this.premier = 0;
    }

    public Movie(int code, String title, String gender, int total, int subtitled, int premier) {
        this.code = code;
        this.title = title;
        this.gender = gender;
        this.total = total;
        this.subtitled = subtitled;
        this.premier = premier;
    }

    public int getPremier() {
        return premier;
    }

    public void setPremier(int premier) {
        this.premier = premier;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubtitled() {
        return subtitled;
    }

    public void setSubtitled(int subtitled) {
        this.subtitled = subtitled;
    }

    @Override
    public String toString() {
        return "Movie{" + "code=" + code + ", title=" + title + ", gender=" + gender + ", total=" + total + ", subtitled=" + subtitled + ", premier=" + premier + '}';
    }

} // class
