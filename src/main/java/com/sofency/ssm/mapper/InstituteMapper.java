package com.sofency.ssm.mapper;

import com.sofency.ssm.pojo.Institute;
import com.sofency.ssm.pojo.InstituteExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface InstituteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    long countByExample(InstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int deleteByExample(InstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int deleteByPrimaryKey(Integer instId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int insert(Institute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int insertSelective(Institute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    List<Institute> selectByExampleWithRowbounds(InstituteExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    List<Institute> selectByExample(InstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    Institute selectByPrimaryKey(Integer instId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int updateByExampleSelective(@Param("record") Institute record, @Param("example") InstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int updateByExample(@Param("record") Institute record, @Param("example") InstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int updateByPrimaryKeySelective(Institute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table institute
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    int updateByPrimaryKey(Institute record);
}