package com.briup.apps.poll.bean;

import java.util.Date;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_teacher.id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_teacher.name
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_teacher.gender
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_teacher.birth
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_teacher.entrytime
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    private Date entrytime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_teacher.id
     *
     * @return the value of poll_teacher.id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_teacher.id
     *
     * @param id the value for poll_teacher.id
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_teacher.name
     *
     * @return the value of poll_teacher.name
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_teacher.name
     *
     * @param name the value for poll_teacher.name
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_teacher.gender
     *
     * @return the value of poll_teacher.gender
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_teacher.gender
     *
     * @param gender the value for poll_teacher.gender
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_teacher.birth
     *
     * @return the value of poll_teacher.birth
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_teacher.birth
     *
     * @param birth the value for poll_teacher.birth
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_teacher.entrytime
     *
     * @return the value of poll_teacher.entrytime
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_teacher.entrytime
     *
     * @param entrytime the value for poll_teacher.entrytime
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }
}