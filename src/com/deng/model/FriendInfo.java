package com.deng.model;

public class FriendInfo {

	private int id;
	private int friendGroupId;
	private int userId;
	private String remark;
	private int status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFriendGroupId() {
		return friendGroupId;
	}
	public void setFriendGroupId(int friendGroupId) {
		this.friendGroupId = friendGroupId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
