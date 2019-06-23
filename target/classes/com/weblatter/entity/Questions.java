import java.sql.Date;

public class Questions {
    private String question_id;
    private  String user_id;
    private Date question_time;
    private String question_status;
    private String question;
    private String complete;
    private String label_m;
    private int integral;
    private int answer_num;
    private int question_following_num;

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getQuestion_time() {
        return question_time;
    }

    public void setQuestion_time(Date question_time) {
        this.question_time = question_time;
    }

    public String getQuestion_status() {
        return question_status;
    }

    public void setQuestion_status(String question_status) {
        this.question_status = question_status;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getLabel_m() {
        return label_m;
    }

    public void setLabel_m(String label_m) {
        this.label_m = label_m;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getAnswer_num() {
        return answer_num;
    }

    public void setAnswer_num(int answer_num) {
        this.answer_num = answer_num;
    }

    public int getQuestion_following_num() {
        return question_following_num;
    }

    public void setQuestion_following_num(int question_following_num) {
        this.question_following_num = question_following_num;
    }
}
