package cn.edu.nuc.store.entity;

public class User {
    private Integer userid;

    private String username;

    
    //由于数据库没有建立password   此处用usermoney代替password
    private String usermoney;

    private Integer friendid;

    
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(String usermoney) {
        this.usermoney = usermoney == null ? null : usermoney.trim();
    }

    public Integer getFriendid() {
        return friendid;
    }

    public void setFriendid(Integer friendid) {
        this.friendid = friendid;
    }
}