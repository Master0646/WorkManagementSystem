package team.work.doc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@ApiModel(value ="班级信息新增")
public class ClassesCreate {
    @ApiModelProperty(value = "班号")
    private String classNo;
    @ApiModelProperty(value = "年级")
    private String grade;
    @ApiModelProperty(value = "所属专业")
    private String majorCode;

    public String getClassNo() { 
        return classNo;
    } 

    public void setClassNo(String classNo) { 
        this.classNo = classNo;
    } 

    public String getGrade() { 
        return grade;
    } 

    public void setGrade(String grade) { 
        this.grade = grade;
    } 

    public String getMajorCode() { 
        return majorCode;
    } 

    public void setMajorCode(String majorCode) { 
        this.majorCode = majorCode;
    } 

}
