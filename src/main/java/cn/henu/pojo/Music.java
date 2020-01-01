package cn.henu.pojo;

public class Music {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.music_id
     *
     * @mbg.generated
     */
    private Integer musicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.music_status
     *
     * @mbg.generated
     */
    private Integer musicStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.music_name
     *
     * @mbg.generated
     */
    private String musicName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.music_author
     *
     * @mbg.generated
     */
    private String musicAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.music_src
     *
     * @mbg.generated
     */
    private String musicSrc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.music_img
     *
     * @mbg.generated
     */
    private String musicImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.music_id
     *
     * @return the value of music.music_id
     *
     * @mbg.generated
     */
    public Integer getMusicId() {
        return musicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.music_id
     *
     * @param musicId the value for music.music_id
     *
     * @mbg.generated
     */
    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.music_status
     *
     * @return the value of music.music_status
     *
     * @mbg.generated
     */
    public Integer getMusicStatus() {
        return musicStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.music_status
     *
     * @param musicStatus the value for music.music_status
     *
     * @mbg.generated
     */
    public void setMusicStatus(Integer musicStatus) {
        this.musicStatus = musicStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.music_name
     *
     * @return the value of music.music_name
     *
     * @mbg.generated
     */
    public String getMusicName() {
        return musicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.music_name
     *
     * @param musicName the value for music.music_name
     *
     * @mbg.generated
     */
    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.music_author
     *
     * @return the value of music.music_author
     *
     * @mbg.generated
     */
    public String getMusicAuthor() {
        return musicAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.music_author
     *
     * @param musicAuthor the value for music.music_author
     *
     * @mbg.generated
     */
    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor == null ? null : musicAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.music_src
     *
     * @return the value of music.music_src
     *
     * @mbg.generated
     */
    public String getMusicSrc() {
        return musicSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.music_src
     *
     * @param musicSrc the value for music.music_src
     *
     * @mbg.generated
     */
    public void setMusicSrc(String musicSrc) {
        this.musicSrc = musicSrc == null ? null : musicSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.music_img
     *
     * @return the value of music.music_img
     *
     * @mbg.generated
     */
    public String getMusicImg() {
        return musicImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.music_img
     *
     * @param musicImg the value for music.music_img
     *
     * @mbg.generated
     */
    public void setMusicImg(String musicImg) {
        this.musicImg = musicImg == null ? null : musicImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.user_id
     *
     * @return the value of music.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.user_id
     *
     * @param userId the value for music.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}