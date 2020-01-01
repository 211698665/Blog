package cn.henu.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String onlineTime;

    private String userMail;

    private String userAddress;

    private Integer userAge;

    private Integer userSex;

    private Integer userQq;

    private String userDesc;

    private Date userUpdatetime;

    private Date userCreatetime;

    private String userImage;

    private String userPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime == null ? null : onlineTime.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserQq() {
        return userQq;
    }

    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public Date getUserUpdatetime() {
        return userUpdatetime;
    }

    public void setUserUpdatetime(Date userUpdatetime) {
        this.userUpdatetime = userUpdatetime;
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", onlineTime='" + onlineTime + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", userQq=" + userQq +
                ", userDesc='" + userDesc + '\'' +
                ", userUpdatetime=" + userUpdatetime +
                ", userCreatetime=" + userCreatetime +
                ", userImage='" + userImage + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}