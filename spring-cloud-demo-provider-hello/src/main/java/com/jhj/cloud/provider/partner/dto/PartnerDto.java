package com.jhj.cloud.provider.partner.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 合作伙伴领域对象
 * 
 * @author Lyu Yang
 * 
 * @version 1.0 2018-01-09
 */
@Getter
@Setter
public class PartnerDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 196824536820103131L;
	/**
	 * 代理主键,自增
	 */
	private Integer id;
	/**
	 * 合作伙伴名称
	 */
	private String partnerName;
	/**
	 * 联系人
	 */
	private String linkman;
	/**
	 * 联系手机
	 */
	private String contactNumber;
	/**
	 * appId,业务编码.唯一
	 */
	private String appId;
	/**
	 * appKey,计算签名时使用,8-16位
	 */
	private String appKey;
	/**
	 * appSecret,加密解密时使用,8-16位
	 */
	private String appSecret;
	/**
	 * 通知回调地址
	 */
	private String notifyUrl;
	/**
	 * 页面跳转地址
	 */
	private String returnUrl;
	/**
	 * 系统自定义的渠道编码
	 */
	private Byte channelCode;
	/**
	 * 状态[0:禁用 1:正常]
	 */
	private Boolean status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;

}