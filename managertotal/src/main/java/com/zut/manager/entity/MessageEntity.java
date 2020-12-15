package com.zut.manager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;


@Data
@TableName("message")
public class MessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value="no",type = IdType.AUTO)
	private Integer no;
	/**
	 * 
	 */
	private String uname;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private String uno;
	/**
	 * 
	 */
	private String usex;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private String uphonenumber;
	/**
	 * 
	 */
	private String urole;

}
