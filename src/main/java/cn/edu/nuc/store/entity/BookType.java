package cn.edu.nuc.store.entity;

public class BookType {
    private Integer typeid;

    private String typename;

    private Integer typehot;

    private Integer typepid;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypehot() {
        return typehot;
    }

    public void setTypehot(Integer typehot) {
        this.typehot = typehot;
    }

    public Integer getTypepid() {
        return typepid;
    }

    public void setTypepid(Integer typepid) {
        this.typepid = typepid;
    }
}