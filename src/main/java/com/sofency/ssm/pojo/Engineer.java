package com.sofency.ssm.pojo;

import java.io.Serializable;

public class Engineer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private Integer engineerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.inst_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private Integer instId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.major_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private Integer majorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_sex
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_name
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_img_path
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerImgPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_tel
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_email
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_motto
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerMotto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engineer.engineer_git
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String engineerGit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_id
     *
     * @return the value of engineer.engineer_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public Integer getEngineerId() {
        return engineerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_id
     *
     * @param engineerId the value for engineer.engineer_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerId(Integer engineerId) {
        this.engineerId = engineerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.inst_id
     *
     * @return the value of engineer.inst_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public Integer getInstId() {
        return instId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.inst_id
     *
     * @param instId the value for engineer.inst_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.major_id
     *
     * @return the value of engineer.major_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public Integer getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.major_id
     *
     * @param majorId the value for engineer.major_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_sex
     *
     * @return the value of engineer.engineer_sex
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerSex() {
        return engineerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_sex
     *
     * @param engineerSex the value for engineer.engineer_sex
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerSex(String engineerSex) {
        this.engineerSex = engineerSex == null ? null : engineerSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_name
     *
     * @return the value of engineer.engineer_name
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerName() {
        return engineerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_name
     *
     * @param engineerName the value for engineer.engineer_name
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName == null ? null : engineerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_img_path
     *
     * @return the value of engineer.engineer_img_path
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerImgPath() {
        return engineerImgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_img_path
     *
     * @param engineerImgPath the value for engineer.engineer_img_path
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerImgPath(String engineerImgPath) {
        this.engineerImgPath = engineerImgPath == null ? null : engineerImgPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_tel
     *
     * @return the value of engineer.engineer_tel
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerTel() {
        return engineerTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_tel
     *
     * @param engineerTel the value for engineer.engineer_tel
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerTel(String engineerTel) {
        this.engineerTel = engineerTel == null ? null : engineerTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_email
     *
     * @return the value of engineer.engineer_email
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerEmail() {
        return engineerEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_email
     *
     * @param engineerEmail the value for engineer.engineer_email
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerEmail(String engineerEmail) {
        this.engineerEmail = engineerEmail == null ? null : engineerEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_motto
     *
     * @return the value of engineer.engineer_motto
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerMotto() {
        return engineerMotto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_motto
     *
     * @param engineerMotto the value for engineer.engineer_motto
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerMotto(String engineerMotto) {
        this.engineerMotto = engineerMotto == null ? null : engineerMotto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engineer.engineer_git
     *
     * @return the value of engineer.engineer_git
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getEngineerGit() {
        return engineerGit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engineer.engineer_git
     *
     * @param engineerGit the value for engineer.engineer_git
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setEngineerGit(String engineerGit) {
        this.engineerGit = engineerGit == null ? null : engineerGit.trim();
    }
}