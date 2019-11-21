package com.briup.apps.poll.mapper;

import com.briup.apps.poll.bean.QQ;
import com.briup.apps.poll.bean.QQExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QQMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    long countByExample(QQExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int deleteByExample(QQExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int insert(QQ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int insertSelective(QQ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    List<QQ> selectByExample(QQExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    QQ selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") QQ record, @Param("example") QQExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByExample(@Param("record") QQ record, @Param("example") QQExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByPrimaryKeySelective(QQ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Fri Mar 01 18:02:39 CST 2019
     */
    int updateByPrimaryKey(QQ record);
}