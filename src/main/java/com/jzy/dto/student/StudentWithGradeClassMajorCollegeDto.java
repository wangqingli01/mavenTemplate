package com.jzy.dto.student;

import com.jzy.entity.Student;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @ClassName StudentWithGradeClassMajorCollegeDto
 * @Author JinZhiyun
 * @Description 学生及其附带信息dto
 * @Date 2019/4/15 18:33
 * @Version 1.0
 **/
public class StudentWithGradeClassMajorCollegeDto extends Student implements Serializable {
    private static final long serialVersionUID = -556836096234631842L;

    //学生生日Date类型的字符串形式
    private String stuBirthdayToString;

    //学生的年龄，计算得到
    private String stuSex;
    
    

    //学生年级名称
    private String stuGradeName;

    //学生班级名称
    private String stuClassName;

    //学生专业名称
    private String stuMajorName;

    //学生学院名称
    private String stuCollegeName;
    
    //学校名称
    private String stuSchoolName;
    //民族
    private String stuNation;
    //身份证号
    private String stuIDNumber;
    //学制
    private String stuLength;
    //层次
	/* private String stuGradation; */
    //学习类别
    private String stuDegreeCategory;
    //学习形式
    private String stuDegreeForm;
    //入学日期
    private String stuEnrollmentDateToString;
    //预计毕业日期
    private String stuEstimatedDateToString;
    //学籍状态
    private String stuStatus;
    
    
    
   

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

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

	/*
	 * public String getStuGradation() { return stuGradation; }
	 * 
	 * public void setStuGradation(String stuGradation) { this.stuGradation =
	 * stuGradation; }
	 */

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


	

	public String getStuEnrollmentDateToString() {
		return stuEnrollmentDateToString;
	}

	public void setStuEnrollmentDateToString(String stuEnrollmentDateToString) {
		this.stuEnrollmentDateToString = stuEnrollmentDateToString;
	}



	public String getStuEstimatedDateToString() {
		return stuEstimatedDateToString;
	}

	public void setStuEstimatedDateToString(String stuEstimatedDateToString) {
		this.stuEstimatedDateToString = stuEstimatedDateToString;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStuStatus() {
		return stuStatus;
	}

	public void setStuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}

    public String getStuBirthdayToString() {
        return stuBirthdayToString;
    }

    public void setStuBirthdayToString(String stuBirthdayToString) {
        this.stuBirthdayToString = stuBirthdayToString;
    }

	/*
	 * public Integer getStuAge() { return stuAge; }
	 * 
	 * public void setStuAge(Integer stuAge) { this.stuAge = stuAge; }
	 */

    public String getStuGradeName() {
        return stuGradeName;
    }

    public void setStuGradeName(String stuGradeName) {
        this.stuGradeName = stuGradeName;
    }

    public String getStuClassName() {
        return stuClassName;
    }

    public void setStuClassName(String stuClassName) {
        this.stuClassName = stuClassName;
    }

    public String getStuMajorName() {
        return stuMajorName;
    }

    public void setStuMajorName(String stuMajorName) {
        this.stuMajorName = stuMajorName;
    }

    public String getStuCollegeName() {
        return stuCollegeName;
    }

    public void setStuCollegeName(String stuCollegeName) {
        this.stuCollegeName = stuCollegeName;
    }

    @Override
	public String toString() {
		return "StudentWithGradeClassMajorCollegeDto [stuBirthdayToString=" + stuBirthdayToString + ", stuSex=" + stuSex
				+ ", stuGradeName=" + stuGradeName + ", stuClassName=" + stuClassName + ", stuMajorName=" + stuMajorName
				+ ", stuCollegeName=" + stuCollegeName + ", stuSchoolName=" + stuSchoolName + ", stuNation=" + stuNation
				+ ", stuIDNumber=" + stuIDNumber + ", stuLength=" + stuLength + ", stuDegreeCategory="
				+ stuDegreeCategory + ", stuDegreeForm=" + stuDegreeForm + ", stuEnrollmentDateToString="
				+ stuEnrollmentDateToString + ", stuEstimatedDateToString=" + stuEstimatedDateToString + ", stuStatus="
				+ stuStatus + ", getStuSex()=" + getStuSex() + ", getStuSchoolName()=" + getStuSchoolName()
				+ ", getStuNation()=" + getStuNation() + ", getStuIDNumber()=" + getStuIDNumber() + ", getStuLength()="
				+ getStuLength() + ", getStuDegreeCategory()=" + getStuDegreeCategory() + ", getStuDegreeForm()="
				+ getStuDegreeForm() + ", getStuEnrollmentDateToString()=" + getStuEnrollmentDateToString()
				+ ", getStuEstimatedDateToString()=" + getStuEstimatedDateToString() + ", getStuStatus()="
				+ getStuStatus() + ", getStuBirthdayToString()=" + getStuBirthdayToString() + ", getStuGradeName()="
				+ getStuGradeName() + ", getStuClassName()=" + getStuClassName() + ", getStuMajorName()="
				+ getStuMajorName() + ", getStuCollegeName()=" + getStuCollegeName() + ", getStuGradation()="
				+ getStuGradation() + ", getStuEnrollmentDate()=" + getStuEnrollmentDate() + ", getStuEstimatedDate()="
				+ getStuEstimatedDate() + ", getStuId()=" + getStuId() + ", getStuClass()=" + getStuClass()
				+ ", getStuNum()=" + getStuNum() + ", getStuName()=" + getStuName() + ", getStuBirthday()="
				+ getStuBirthday() + ", getStuGrade()=" + getStuGrade() + ", getStuDegree()=" + getStuDegree()
				+ ", getStuPhone()=" + getStuPhone() + ", getStuRemark()=" + getStuRemark() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
