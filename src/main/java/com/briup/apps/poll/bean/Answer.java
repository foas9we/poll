package com.briup.apps.poll.bean;

import java.util.Date;

public class Answer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answer.id
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answer.selection
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    private String selection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answer.answertime
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    private Date answertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answer.survey_id
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    private Long surveyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answer.content
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answer.id
     *
     * @return the value of poll_answer.id
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answer.id
     *
     * @param id the value for poll_answer.id
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answer.selection
     *
     * @return the value of poll_answer.selection
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public String getSelection() {
        return selection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answer.selection
     *
     * @param selection the value for poll_answer.selection
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public void setSelection(String selection) {
        this.selection = selection == null ? null : selection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answer.answertime
     *
     * @return the value of poll_answer.answertime
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public Date getAnswertime() {
        return answertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answer.answertime
     *
     * @param answertime the value for poll_answer.answertime
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public void setAnswertime(Date answertime) {
        this.answertime = answertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answer.survey_id
     *
     * @return the value of poll_answer.survey_id
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public Long getSurveyId() {
        return surveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answer.survey_id
     *
     * @param surveyId the value for poll_answer.survey_id
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answer.content
     *
     * @return the value of poll_answer.content
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answer.content
     *
     * @param content the value for poll_answer.content
     *
     * @mbg.generated Fri Mar 01 18:02:40 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}