package com.myapp.module.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseKid<M extends BaseKid<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setUserid(java.lang.Integer userid) {
		set("userid", userid);
		return (M)this;
	}

	public java.lang.Integer getUserid() {
		return get("userid");
	}

	public M setNickname(java.lang.String nickname) {
		set("nickname", nickname);
		return (M)this;
	}

	public java.lang.String getNickname() {
		return get("nickname");
	}

	public M setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
		return (M)this;
	}

	public java.util.Date getBirthday() {
		return get("birthday");
	}

	public M setHeadurl(java.lang.String headurl) {
		set("headurl", headurl);
		return (M)this;
	}

	public java.lang.String getHeadurl() {
		return get("headurl");
	}

	public M setHealthIssue(java.lang.String healthIssue) {
		set("healthIssue", healthIssue);
		return (M)this;
	}

	public java.lang.String getHealthIssue() {
		return get("healthIssue");
	}

}
