package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.Specialty;
import test.model.SpecialtyExample;

public interface SpecialtyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int countByExample(SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int deleteByExample(SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int insert(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int insertSelective(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    List<Specialty> selectByExample(SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    Specialty selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_specialty
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Specialty record);
}