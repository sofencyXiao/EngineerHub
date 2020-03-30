package com.sofency.ssm.pojo;

import java.util.Date;

public class Message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private Integer msgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_header
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String msgHeader;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_time
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private Date msgTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_visited
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private Integer msgVisited;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_content
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    private String msgContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_id
     *
     * @return the value of message.msg_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_id
     *
     * @param msgId the value for message.msg_id
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_header
     *
     * @return the value of message.msg_header
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getMsgHeader() {
        return msgHeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_header
     *
     * @param msgHeader the value for message.msg_header
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMsgHeader(String msgHeader) {
        this.msgHeader = msgHeader == null ? null : msgHeader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_time
     *
     * @return the value of message.msg_time
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public Date getMsgTime() {
        return msgTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_time
     *
     * @param msgTime the value for message.msg_time
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_visited
     *
     * @return the value of message.msg_visited
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public Integer getMsgVisited() {
        return msgVisited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_visited
     *
     * @param msgVisited the value for message.msg_visited
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMsgVisited(Integer msgVisited) {
        this.msgVisited = msgVisited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_content
     *
     * @return the value of message.msg_content
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_content
     *
     * @param msgContent the value for message.msg_content
     *
     * @mbg.generated Mon Mar 30 20:44:51 CST 2020
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }
}