package com.briup.apps.poll.mapper;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.bean.QuestionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    long countByExample(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int deleteByExample(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int insert(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int insertSelective(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    List<Questionnaire> selectByExampleWithBLOBs(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    List<Questionnaire> selectByExample(QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    Questionnaire selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByPrimaryKeySelective(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_questionnaire
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByPrimaryKey(Questionnaire record);
}