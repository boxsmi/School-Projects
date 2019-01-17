/*
Created by Aleksandr
                    Smirnov*/
package dns;

public class QuestionAndAnswers {

    private String themeOfQuestion;
    private String question;
    private String author;

    QuestionAndAnswers() {
    }

    public QuestionAndAnswers(String themeOfQuestion, String question, String author) {
        this.themeOfQuestion = themeOfQuestion;
        this.question = question;
        this.author = author;
    }

    public String getThemeOfQuestion() {
        return themeOfQuestion;
    }

    public void setThemeOfQuestion(String themeOfQuestion) {
        this.themeOfQuestion = themeOfQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "QuestionAndAnswers{" +
                "themeOfQuestion='" + themeOfQuestion + '\'' +
                ", question='" + question + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
