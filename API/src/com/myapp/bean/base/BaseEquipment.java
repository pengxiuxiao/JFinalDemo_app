package com.myapp.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseEquipment<M extends BaseEquipment<M>> extends Model<M> implements IBean {

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

	public M setKidid(java.lang.Integer kidid) {
		set("kidid", kidid);
		return (M)this;
	}

	public java.lang.Integer getKidid() {
		return get("kidid");
	}

	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	public java.lang.String getNumber() {
		return get("number");
	}

	public M setMaxtime(java.math.BigDecimal maxtime) {
		set("maxtime", maxtime);
		return (M)this;
	}

	public java.math.BigDecimal getMaxtime() {
		return get("maxtime");
	}

	public M setMintime(java.math.BigDecimal mintime) {
		set("mintime", mintime);
		return (M)this;
	}

	public java.math.BigDecimal getMintime() {
		return get("mintime");
	}

	public M setIsminalarm(java.lang.String isminalarm) {
		set("isminalarm", isminalarm);
		return (M)this;
	}

	public java.lang.String getIsminalarm() {
		return get("isminalarm");
	}

	public M setIsmaxalarm(java.lang.String ismaxalarm) {
		set("ismaxalarm", ismaxalarm);
		return (M)this;
	}

	public java.lang.String getIsmaxalarm() {
		return get("ismaxalarm");
	}

	public M setIsnotice(java.lang.String isnotice) {
		set("isnotice", isnotice);
		return (M)this;
	}

	public java.lang.String getIsnotice() {
		return get("isnotice");
	}

}
