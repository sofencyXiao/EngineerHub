package com.sofency.ssm.pojo;

import java.io.Serializable;

public class Major extends MajorKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column major.major_name
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String majorName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column major.major_name
     *
     * @return the value of major.major_name
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column major.major_name
     *
     * @param majorName the value for major.major_name
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }
}