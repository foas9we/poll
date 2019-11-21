package com.briup.apps.poll.bean;

import java.util.Date;

public class Survey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.surveytime
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Date surveytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.status
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.average
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Double average;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.code
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.clazz_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long clazzId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.teacher_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.course_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_survey.questionnaire_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long questionnaireId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.id
     *
     * @return the value of poll_survey.id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.id
     *
     * @param id the value for poll_survey.id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.surveytime
     *
     * @return the value of poll_survey.surveytime
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Date getSurveytime() {
        return surveytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.surveytime
     *
     * @param surveytime the value for poll_survey.surveytime
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setSurveytime(Date surveytime) {
        this.surveytime = surveytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.status
     *
     * @return the value of poll_survey.status
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.status
     *
     * @param status the value for poll_survey.status
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.average
     *
     * @return the value of poll_survey.average
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Double getAverage() {
        return average;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.average
     *
     * @param average the value for poll_survey.average
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.code
     *
     * @return the value of poll_survey.code
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.code
     *
     * @param code the value for poll_survey.code
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.clazz_id
     *
     * @return the value of poll_survey.clazz_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getClazzId() {
        return clazzId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.clazz_id
     *
     * @param clazzId the value for poll_survey.clazz_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.teacher_id
     *
     * @return the value of poll_survey.teacher_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.teacher_id
     *
     * @param teacherId the value for poll_survey.teacher_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.course_id
     *
     * @return the value of poll_survey.course_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.course_id
     *
     * @param courseId the value for poll_survey.course_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_survey.questionnaire_id
     *
     * @return the value of poll_survey.questionnaire_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_survey.questionnaire_id
     *
     * @param questionnaireId the value for poll_survey.questionnaire_id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setQuestionnaireId(Long questionnaireId) {
        this.questionnaireId = questionnaireId;
    }
}