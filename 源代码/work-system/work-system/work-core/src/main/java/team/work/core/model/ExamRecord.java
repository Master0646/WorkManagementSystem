package team.work.core.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import team.work.utils.kit.IdKit;

import java.io.Serializable;


@SuppressWarnings("serial")
@TableName(value = "exam_record")
@Data
public class ExamRecord extends Model<ExamRecord> {
    private String id = IdKit.getId(this.getClass());
    private String examId;
    private String questionId;
    private String number;
    private Integer situation;
    private Double scores;
    private String answerContent;
    private Integer isExample;
    private String remark;
    private String creator;
    private Integer createTime;
    private String reviser;
    private Integer reviseTime;
    private Integer isDel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getSituation() {
        return situation;
    }

    public void setSituation(Integer situation) {
        this.situation = situation;
    }

    public Double getScores() {
        return scores;
    }

    public void setScores(Double scores) {
        this.scores = scores;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public Integer getIsExample() {
        return isExample;
    }

    public void setIsExample(Integer isExample) {
        this.isExample = isExample;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getReviser() {
        return reviser;
    }

    public void setReviser(String reviser) {
        this.reviser = reviser;
    }

    public Integer getReviseTime() {
        return reviseTime;
    }

    public void setReviseTime(Integer reviseTime) {
        this.reviseTime = reviseTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
