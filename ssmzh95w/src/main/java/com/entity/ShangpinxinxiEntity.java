package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 15:56:57
 */
@TableName("shangpinxinxi")
public class ShangpinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinxinxiEntity() {
		
	}
	
	public ShangpinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 卖家号
	 */
					
	private String maijiahao;
	
	/**
	 * 卖家名
	 */
					
	private String maijiaming;
	
	/**
	 * 商品编号
	 */
					
	private String shangpinbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品类型
	 */
					
	private String shangpinleixing;
	
	/**
	 * 商品图片
	 */
					
	private String shangpintupian;
	
	/**
	 * 库存
	 */
					
	private String kucun;
	
	/**
	 * 商品价格
	 */
					
	private Integer shangpinjiage;
	
	/**
	 * 商品详情
	 */
					
	private String shangpinxiangqing;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：卖家号
	 */
	public void setMaijiahao(String maijiahao) {
		this.maijiahao = maijiahao;
	}
	/**
	 * 获取：卖家号
	 */
	public String getMaijiahao() {
		return maijiahao;
	}
	/**
	 * 设置：卖家名
	 */
	public void setMaijiaming(String maijiaming) {
		this.maijiaming = maijiaming;
	}
	/**
	 * 获取：卖家名
	 */
	public String getMaijiaming() {
		return maijiaming;
	}
	/**
	 * 设置：商品编号
	 */
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商品类型
	 */
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
	/**
	 * 设置：商品图片
	 */
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
	/**
	 * 设置：库存
	 */
	public void setKucun(String kucun) {
		this.kucun = kucun;
	}
	/**
	 * 获取：库存
	 */
	public String getKucun() {
		return kucun;
	}
	/**
	 * 设置：商品价格
	 */
	public void setShangpinjiage(Integer shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	/**
	 * 获取：商品价格
	 */
	public Integer getShangpinjiage() {
		return shangpinjiage;
	}
	/**
	 * 设置：商品详情
	 */
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
