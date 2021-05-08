package com.jzy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Student
 * @Author JinZhiyun
 * @Description 学生实体类
 * @Date 2019/4/15 16:28
 * @Version 1.0
 **/
public class Student implements Serializable {
    private static final long serialVersionUID = 998349295174271972L;

    //学生表代理主键uuid
    private String stuId;

    //学生所属班级id，外键，参照class.class_id
    private String stuClass;

    //学生学号，唯一
    private String stuNum;

    //学生姓名
    private String stuName;

    //学生性别
    private String stuSex;

    //学生生日
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date stuBirthday;

    //学生所属年级id，外键，参照grade.grade_id
    private Integer stuGrade;

    //学生学位
    private String stuDegree;

    //学生手机
    private String stuPhone;

    //学生备注
    private String stuRemark;
    //学校名称
    private String stuSchoolName;
    //民族
    private String stuNation;
    //身份证号
    private String stuIDNumber;
    //学制
    private String stuLength;
    //层次
    private String stuGradation;
    //学习类别
    private String stuDegreeCategory;
    //学习形式
    private String stuDegreeForm;
    //入学日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date stuEnrollmentDate;
    //预计毕业日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date stuEstimatedDate;
    //学籍状态
    private String stuStatus;
    
    
    
    public String getStuSchoolName() {
		return stuSchoolName;
	}

	public void setStuSchoolName(String stuSchoolName) {
		this.stuSchoolName = stuSchoolName;
	}

	public String getStuNation() {
		return stuNation;
	}

	public void setStuNation(String stuNation) {
		this.stuNation = stuNation;
	}

	public String getStuIDNumber() {
		return stuIDNumber;
	}

	public void setStuIDNumber(String stuIDNumber) {
		this.stuIDNumber = stuIDNumber;
	}

	public String getStuLength() {
		return stuLength;
	}

	public void setStuLength(String stuLength) {
		this.stuLength = stuLength;
	}

	public String getStuGradation() {
		return stuGradation;
	}

	public void setStuGradation(String stuGradation) {
		this.stuGradation = stuGradation;
	}

	public String getStuDegreeCategory() {
		return stuDegreeCategory;
	}

	public void setStuDegreeCategory(String stuDegreeCategory) {
		this.stuDegreeCategory = stuDegreeCategory;
	}

	public String getStuDegreeForm() {
		return stuDegreeForm;
	}

	public void setStuDegreeForm(String stuDegreeForm) {
		this.stuDegreeForm = stuDegreeForm;
	}

	public Date getStuEnrollmentDate() {
		return stuEnrollmentDate;
	}

	public void setStuEnrollmentDate(Date stuEnrollmentDate) {
		this.stuEnrollmentDate = stuEnrollmentDate;
	}

	public Date getStuEstimatedDate() {
		return stuEstimatedDate;
	}

	public void setStuEstimatedDate(Date stuEstimatedDate) {
		this.stuEstimatedDate = stuEstimatedDate;
	}

	

	public String getStuStatus() {
		return stuStatus;
	}

	public void setStuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}

	public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public Integer getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(Integer stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuDegree() {
        return stuDegree;
    }

    public void setStuDegree(String stuDegree) {
        this.stuDegree = stuDegree;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuRemark() {
        return stuRemark;
    }

    public void setStuRemark(String stuRemark) {
        this.stuRemark = stuRemark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirthday=" + stuBirthday +
                ", stuGrade=" + stuGrade +
                ", stuDegree='" + stuDegree + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                ", stuRemark='" + stuRemark + '\'' +
                '}';
    }
}
