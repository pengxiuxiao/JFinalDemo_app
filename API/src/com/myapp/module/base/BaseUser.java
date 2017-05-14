package com.myapp.module.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setUsername(java.lang.String username) {
		set("username", username);
		return (M)this;
	}

	public java.lang.String getUsername() {
		return get("username");
	}

	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public M setNickname(java.lang.String nickname) {
		set("nickname", nickname);
		return (M)this;
	}

	public java.lang.String getNickname() {
		return get("nickname");
	}

	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}

	public java.lang.Integer getSex() {
		return get("sex");
	}

	public M setUsertype(java.lang.Integer usertype) {
		set("usertype", usertype);
		return (M)this;
	}

	public java.lang.Integer getUsertype() {
		return get("usertype");
	}

	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	public java.lang.String getMobile() {
		return get("mobile");
	}

	public M setScore(java.lang.Integer score) {
		set("score", score);
		return (M)this;
	}

	public java.lang.Integer getScore() {
		return get("score");
	}

	public M setBase(java.lang.String base) {
		set("base", base);
		return (M)this;
	}

	public java.lang.String getBase() {
		return get("base");
	}

	public M setBase2(java.lang.String base2) {
		set("base2", base2);
		return (M)this;
	}

	public java.lang.String getBase2() {
		return get("base2");
	}

	public M setBase3(java.lang.String base3) {
		set("base3", base3);
		return (M)this;
	}

	public java.lang.String getBase3() {
		return get("base3");
	}

	public M setBase4(java.lang.String base4) {
		set("base4", base4);
		return (M)this;
	}

	public java.lang.String getBase4() {
		return get("base4");
	}

	public M setToken(java.lang.String token) {
		set("token", token);
		return (M)this;
	}

	public java.lang.String getToken() {
		return get("token");
	}

	public M setTestName(java.lang.String testName) {
		set("test_name", testName);
		return (M)this;
	}

	public java.lang.String getTestName() {
		return get("test_name");
	}

}
