package cn.henu.vo;

public class CategoryVo {
    private Integer categoryId;
    private Integer categoryPid;
    private String categoryName;
    private String categoryDesc;
    private String categoryImg;
    private Integer userId;
    private Integer categoryStatus;
    private String  Categorycolor;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public String getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(String categoryImg) {
        this.categoryImg = categoryImg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public String getCategorycolor() {
        return Categorycolor;
    }

    public void setCategorycolor(String categorycolor) {
        Categorycolor = categorycolor;
    }

    @Override
    public String toString() {
        return "CategoryVo{" +
                "categoryId=" + categoryId +
                ", categoryPid=" + categoryPid +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDesc='" + categoryDesc + '\'' +
                ", categoryImg='" + categoryImg + '\'' +
                ", userId=" + userId +
                ", categoryStatus=" + categoryStatus +
                ", Categorycolor='" + Categorycolor + '\'' +
                '}';
    }
}
