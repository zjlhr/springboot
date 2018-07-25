package com.lhr.common;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "操作结果返回", description = "前台异步操作结果的返回")
public class Success {

	@ApiModelProperty(value = "是否执行成功")
	private boolean success;

	@ApiModelProperty(value = "执行返回结果码")
	private String returnCode;

	@ApiModelProperty(value = "执行返回提示信")
	private String returnMsg;

	@ApiModelProperty(value = "执行错误的请求地址")
	private String requestUrl;

	@ApiModelProperty(value = "返回附加信息，以map格式返回")
	private Map<String, Object> result;

	public Success() {
		super();
	}

	public Success(boolean success, String returnCode, String returnMsg) {
		super();
		this.success = success;
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public Success addResult(String key, Object value) {
		if (this.result == null) {
			this.result = new HashMap<String, Object>();
		}
		this.result.put(key, value);
		return this;
	}
}
