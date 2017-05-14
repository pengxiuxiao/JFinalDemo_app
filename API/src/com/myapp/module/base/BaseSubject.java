package com.myapp.module.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSubject<M extends BaseSubject<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setSubject(java.lang.String subject) {
		set("subject", subject);
		return (M)this;
	}

	public java.lang.String getSubject() {
		return get("subject");
	}

}
