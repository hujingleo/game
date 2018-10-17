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
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long userId;
	/**
	 * 
	 */
	private String username;
	/**
	 * 
	 */
	private String mobile;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 
	 */
	private String playerId;
	/**
	 * 
	 */
	private String openId;
	/**
	 * 
	 */
	private String officialAccountsOpenId;
	/**
	 * 
	 */
	private String unionId;
	/**
	 * 
	 */
	private String nickName;
	/**
	 * 
	 */
	private String avatarUrl;
	/**
	 * 
	 */
	private String gender;
	/**
	 * 
	 */
	private Integer endLevel;
	/**
	 * 
	 */
	private Integer goldCount;
	/**
	 * 
	 */
	private Integer diamondCount;
	/**
	 * 
	 */
	private String formId;
	/**
	 * 
	 */
	private String prepayId;
	/**
	 * 
	 */
	private Date formidDate;
	/**
	 * 
	 */
	private Date prepayidDate;
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
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	/**
	 * 获取：
	 */
	public String getPlayerId() {
		return playerId;
	}
	/**
	 * 设置：
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：
	 */
	public void setOfficialAccountsOpenId(String officialAccountsOpenId) {
		this.officialAccountsOpenId = officialAccountsOpenId;
	}
	/**
	 * 获取：
	 */
	public String getOfficialAccountsOpenId() {
		return officialAccountsOpenId;
	}
	/**
	 * 设置：
	 */
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	/**
	 * 获取：
	 */
	public String getUnionId() {
		return unionId;
	}
	/**
	 * 设置：
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	/**
	 * 获取：
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}
	/**
	 * 设置：
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 获取：
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置：
	 */
	public void setEndLevel(Integer endLevel) {
		this.endLevel = endLevel;
	}
	/**
	 * 获取：
	 */
	public Integer getEndLevel() {
		return endLevel;
	}
	/**
	 * 设置：
	 */
	public void setGoldCount(Integer goldCount) {
		this.goldCount = goldCount;
	}
	/**
	 * 获取：
	 */
	public Integer getGoldCount() {
		return goldCount;
	}
	/**
	 * 设置：
	 */
	public void setDiamondCount(Integer diamondCount) {
		this.diamondCount = diamondCount;
	}
	/**
	 * 获取：
	 */
	public Integer getDiamondCount() {
		return diamondCount;
	}
	/**
	 * 设置：
	 */
	public void setFormId(String formId) {
		this.formId = formId;
	}
	/**
	 * 获取：
	 */
	public String getFormId() {
		return formId;
	}
	/**
	 * 设置：
	 */
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}
	/**
	 * 获取：
	 */
	public String getPrepayId() {
		return prepayId;
	}
	/**
	 * 设置：
	 */
	public void setFormidDate(Date formidDate) {
		this.formidDate = formidDate;
	}
	/**
	 * 获取：
	 */
	public Date getFormidDate() {
		return formidDate;
	}
	/**
	 * 设置：
	 */
	public void setPrepayidDate(Date prepayidDate) {
		this.prepayidDate = prepayidDate;
	}
	/**
	 * 获取：
	 */
	public Date getPrepayidDate() {
		return prepayidDate;
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
