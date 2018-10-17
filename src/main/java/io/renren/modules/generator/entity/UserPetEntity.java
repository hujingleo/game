package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-10-17 23:34:14
 */
@TableName("tb_user_pet")
public class UserPetEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Integer userId;
	/**
	 * 
	 */
	private Integer petId;
	/**
	 * 
	 */
	private Integer whetherHave;
	/**
	 * 
	 */
	private Integer whetherShelf;
	/**
	 * 
	 */
	private Date createdDate;
	/**
	 * 
	 */
	private Date updatedDate;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	/**
	 * 获取：
	 */
	public Integer getPetId() {
		return petId;
	}
	/**
	 * 设置：
	 */
	public void setWhetherHave(Integer whetherHave) {
		this.whetherHave = whetherHave;
	}
	/**
	 * 获取：
	 */
	public Integer getWhetherHave() {
		return whetherHave;
	}
	/**
	 * 设置：
	 */
	public void setWhetherShelf(Integer whetherShelf) {
		this.whetherShelf = whetherShelf;
	}
	/**
	 * 获取：
	 */
	public Integer getWhetherShelf() {
		return whetherShelf;
	}
	/**
	 * 设置：
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * 获取：
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * 设置：
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * 获取：
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
}
