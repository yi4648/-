package com.zut.manager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * 
 * @author liqiqi
 * @email 523892377@qq.com
 * @date 2020-12-10 19:51:11
 */
@Data
@TableName("book")
public class BookEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 
	 */
	private String bookName;
	/**
	 * 
	 */
	private String bookPub;
	/**
	 *
	 */
	private String bookType;
	/**
	 * 
	 */
	private Integer count;
	/**
	 * 
	 */
	private String createTime;

}
