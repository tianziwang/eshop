package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.base.framwork.domain.BaseModel;

@Entity(name="USER_BUYER")
public class UserBuyerModel extends BaseModel{

	//登录名
	private String name;
	
	//学号/工号。。。
	private String userId;
	
	private String password;
	
	private String realname;
	
	private String phone;
	
	private String email;
	
	//积分
	private int score;
	
	//是否验证,默认为0，1表示验证
	private String isValidate;
	
	//注册时间
	private String regDate;
	
	//会员等级id，关联主键id
	private String level_id;
	
	@Column(name="name", length=15, nullable=false)
	public String getName() {
		return name;
	}

	@Column(name="userid", length=15, nullable=true)
	public String getUserId() {
		return userId;
	}

	@Column(name="password", length=200, nullable=false)
	public String getPassword() {
		return password;
	}

	@Column(name="realname", length=15)
	public String getRealname() {
		return realname;
	}

	@Column(name="phone", length=15)
	public String getPhone() {
		return phone;
	}

	@Column(name="email", length=30)
	public String getEmail() {
		return email;
	}

	@Column(name="score")
	public int getScore() {
		return score;
	}

	@Column(name="is_valudate", length=1, nullable=false)
	public String getIsValidate() {
		return isValidate;
	}

	@Column(name="reg_date", length=15)
	public String getRegDate() {
		return regDate;
	}

	@Column(name="level_id", length=64)
	public String getLevel_id() {
		return level_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setIsValidate(String isValidate) {
		this.isValidate = isValidate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setLevel_id(String level_id) {
		this.level_id = level_id;
	}
	
}
