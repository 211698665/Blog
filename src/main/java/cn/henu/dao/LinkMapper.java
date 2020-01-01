package cn.henu.dao;

import cn.henu.pojo.Link;
import java.util.List;

public interface LinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbg.generated
     */
    int insert(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbg.generated
     */
    Link selectByPrimaryKey(Integer linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbg.generated
     */
    List<Link> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Link record);
}