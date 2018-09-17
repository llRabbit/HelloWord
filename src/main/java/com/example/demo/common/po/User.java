package com.example.demo.common.po;

import io.swagger.annotations.ApiModelProperty;

public class User<Data> {
	@ApiModelProperty(value = "用户Id", required = false)
	private String userId;
	
	private String userName;
	@ApiModelProperty(value = "密码", required = true)
	private String password;
	@ApiModelProperty(hidden = true)
	private String email;
	private Data data;

	public User() {
		super();
	}

	public User(String userId, String userName, String password, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ "]";
	}

}
