package test.model;

public class Specialty {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_specialty.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_specialty.specialty_name
     *
     * @mbggenerated
     */
    private String specialtyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_specialty.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_specialty.id
     *
     * @return the value of t_specialty.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_specialty.id
     *
     * @param id the value for t_specialty.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_specialty.specialty_name
     *
     * @return the value of t_specialty.specialty_name
     *
     * @mbggenerated
     */
    public String getSpecialtyName() {
        return specialtyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_specialty.specialty_name
     *
     * @param specialtyName the value for t_specialty.specialty_name
     *
     * @mbggenerated
     */
    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName == null ? null : specialtyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_specialty.deleted
     *
     * @return the value of t_specialty.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_specialty.deleted
     *
     * @param deleted the value for t_specialty.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}