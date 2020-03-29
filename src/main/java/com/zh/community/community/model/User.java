package com.zh.community.community.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ID
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ACCOUNT_ID
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.NAME
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.TOKEN
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.GMT_CREATE
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.GMT_MODIFIED
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar_url
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email_address
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private String emailAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email_pass_word
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    private String emailPassWord;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ID
     *
     * @return the value of user.ID
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ID
     *
     * @param id the value for user.ID
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ACCOUNT_ID
     *
     * @return the value of user.ACCOUNT_ID
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ACCOUNT_ID
     *
     * @param accountId the value for user.ACCOUNT_ID
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.NAME
     *
     * @return the value of user.NAME
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.NAME
     *
     * @param name the value for user.NAME
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.TOKEN
     *
     * @return the value of user.TOKEN
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.TOKEN
     *
     * @param token the value for user.TOKEN
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.GMT_CREATE
     *
     * @return the value of user.GMT_CREATE
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.GMT_CREATE
     *
     * @param gmtCreate the value for user.GMT_CREATE
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.GMT_MODIFIED
     *
     * @return the value of user.GMT_MODIFIED
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.GMT_MODIFIED
     *
     * @param gmtModified the value for user.GMT_MODIFIED
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar_url
     *
     * @return the value of user.avatar_url
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar_url
     *
     * @param avatarUrl the value for user.avatar_url
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email_address
     *
     * @return the value of user.email_address
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email_address
     *
     * @param emailAddress the value for user.email_address
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email_pass_word
     *
     * @return the value of user.email_pass_word
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public String getEmailPassWord() {
        return emailPassWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email_pass_word
     *
     * @param emailPassWord the value for user.email_pass_word
     *
     * @mbg.generated Sat Mar 28 14:48:14 CST 2020
     */
    public void setEmailPassWord(String emailPassWord) {
        this.emailPassWord = emailPassWord == null ? null : emailPassWord.trim();
    }
}