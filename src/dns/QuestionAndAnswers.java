/*
Created by Aleksandr
                    Smirnov*/
package dns;

import java.util.Date;

public class QuestionAndAnswers {

    private String[] themeOfQuestion;
    private String question;
    private String authorOfQuestion;
    private String emailauthorOfQuestion;
    private Date dataQuestion;
    private String zagolovokOfQuestion;
    private String authorOfAnswer;
    private String emailauthorOfAnswer;
    private Date dataAnswer;
    private String answer;

    QuestionAndAnswers() {
    }

    public QuestionAndAnswers(String[] themeOfQuestion, String question, String authorOfQuestion, String emailauthorOfQuestion, Date dataQuestion, String zagolovokOfQuestion, String authorOfAnswer, String emailauthorOfAnswer, Date dataAnswer, String answer) {
        this.themeOfQuestion = themeOfQuestion;
        this.question = question;
        this.authorOfQuestion = authorOfQuestion;
        this.emailauthorOfQuestion = emailauthorOfQuestion;
        this.dataQuestion = dataQuestion;
        this.zagolovokOfQuestion = zagolovokOfQuestion;
        this.authorOfAnswer = authorOfAnswer;
        this.emailauthorOfAnswer = emailauthorOfAnswer;
        this.dataAnswer = dataAnswer;
        this.answer = answer;
    }

    public String[] getThemeOfQuestion() {
        return themeOfQuestion;
    }

    public void setThemeOfQuestion(String[] themeOfQuestion) {
        this.themeOfQuestion = themeOfQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAuthorOfQuestion() {
        return authorOfQuestion;
    }

    public void setAuthorOfQuestion(String authorOfQuestion) {
        this.authorOfQuestion = authorOfQuestion;
    }

    public String getEmailauthorOfQuestion() {
        return emailauthorOfQuestion;
    }

    public void setEmailauthorOfQuestion(String emailauthorOfQuestion) {
        this.emailauthorOfQuestion = emailauthorOfQuestion;
    }

    public Date getDataQuestion() {
        return dataQuestion;
    }

    public void setDataQuestion(Date dataQuestion) {
        this.dataQuestion = dataQuestion;
    }

    public String getZagolovokOfQuestion() {
        return zagolovokOfQuestion;
    }

    public void setZagolovokOfQuestion(String zagolovokOfQuestion) {
        this.zagolovokOfQuestion = zagolovokOfQuestion;
    }

    public String getAuthorOfAnswer() {
        return authorOfAnswer;
    }

    public void setAuthorOfAnswer(String authorOfAnswer) {
        this.authorOfAnswer = authorOfAnswer;
    }

    public String getEmailauthorOfAnswer() {
        return emailauthorOfAnswer;
    }

    public void setEmailauthorOfAnswer(String emailauthorOfAnswer) {
        this.emailauthorOfAnswer = emailauthorOfAnswer;
    }

    public Date getDataAnswer() {
        return dataAnswer;
    }

    public void setDataAnswer(Date dataAnswer) {
        this.dataAnswer = dataAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
