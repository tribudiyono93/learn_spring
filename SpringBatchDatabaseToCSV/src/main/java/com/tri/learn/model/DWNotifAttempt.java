package com.tri.learn.model;


import java.sql.Timestamp;


public class DWNotifAttempt {

	private String notifId;
    private int attemptNo;
	private String cabId;
	private Integer clientId;
	private String appType;
	private String clientNotifRefId;
	private String notifStatusCode;
	private String destId;
	private String mediaType;
	private String fromAddress;
	private String address;
	private String dispatchSid;
	private String checkpoints;
	private String resultCode;
	private int durationSeconds;
	private Timestamp startTime;
	private Timestamp endTime;
	private Timestamp cabCreationTime;
	private String cabCreationDate;
	private String cabCreationMonth;
	private String cabCreationYear;
	private Timestamp attemptCreationTime;
	private String owner;
	private String carrier;
	private String operator;
	private Timestamp transferStartTime;
	private Timestamp transferEndTime;
	private int transferDuration;
	private int priority;
	private Timestamp cabProcessingTime;
	private Timestamp notifCreationTime;
	private Timestamp flushedTime;
	
	public DWNotifAttempt() {
		
	}
	
	public String getCabId() {
		return cabId;
	}
	
	public void setCabId(String cabId) {
		this.cabId = cabId;
	}
	
	public Integer getClientId() {
		return clientId;
	}
	
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	
	public String getAppType() {
		return appType;
	}
	
	public void setAppType(String appType) {
		this.appType = appType;
	}
	
	public String getClientNotifRefId() {
		return clientNotifRefId;
	}
	
	public void setClientNotifRefId(String clientNotifRefId) {
		this.clientNotifRefId = clientNotifRefId;
	}
	
	public String getNotifStatusCode() {
		return notifStatusCode;
	}

	public void setNotifStatusCode(String notifStatusCode) {
		this.notifStatusCode = notifStatusCode;
	}

	public String getDestId() {
		return destId;
	}
	
	public void setDestId(String destId) {
		this.destId = destId;
	}
	
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDispatchSid() {
		return dispatchSid;
	}
	
	public void setDispatchSid(String dispatchSid) {
		this.dispatchSid = dispatchSid;
	}
	
	public String getCheckpoints() {
		return checkpoints;
	}
	
	public void setCheckpoints(String checkpoints) {
		this.checkpoints = checkpoints;
	}
	
	public String getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public int getDurationSeconds() {
		return durationSeconds;
	}
	
	public void setDurationSeconds(int durationSeconds) {
		this.durationSeconds = durationSeconds;
	}
	
	public Timestamp getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	
	public Timestamp getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	public Timestamp getCabCreationTime() {
		return cabCreationTime;
	}
	
	public void setCabCreationTime(Timestamp cabCreationTime) {
		this.cabCreationTime = cabCreationTime;
	}
	
	public String getCabCreationDate() {
		return cabCreationDate;
	}

	public void setCabCreationDate(String cabCreationDate) {
		this.cabCreationDate = cabCreationDate;
	}

	public String getCabCreationMonth() {
		return cabCreationMonth;
	}

	public void setCabCreationMonth(String cabCreationMonth) {
		this.cabCreationMonth = cabCreationMonth;
	}

	public String getCabCreationYear() {
		return cabCreationYear;
	}

	public void setCabCreationYear(String cabCreationYear) {
		this.cabCreationYear = cabCreationYear;
	}

	public Timestamp getAttemptCreationTime() {
		return attemptCreationTime;
	}
	
	public void setAttemptCreationTime(Timestamp attemptCreationTime) {
		this.attemptCreationTime = attemptCreationTime;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Timestamp getTransferStartTime() {
		return transferStartTime;
	}

	public void setTransferStartTime(Timestamp transferStartTime) {
		this.transferStartTime = transferStartTime;
	}

	public Timestamp getTransferEndTime() {
		return transferEndTime;
	}

	public void setTransferEndTime(Timestamp transferEndTime) {
		this.transferEndTime = transferEndTime;
	}

	public int getTransferDuration() {
		return transferDuration;
	}

	public void setTransferDuration(int transferDuration) {
		this.transferDuration = transferDuration;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Timestamp getCabProcessingTime() {
		return cabProcessingTime;
	}

	public void setCabProcessingTime(Timestamp cabProcessingTime) {
		this.cabProcessingTime = cabProcessingTime;
	}

	public Timestamp getNotifCreationTime() {
		return notifCreationTime;
	}

	public void setNotifCreationTime(Timestamp notifCreationTime) {
		this.notifCreationTime = notifCreationTime;
	}

	public Timestamp getFlushedTime() {
		return flushedTime;
	}

	public void setFlushedTime(Timestamp flushedTime) {
		this.flushedTime = flushedTime;
	}

	public String getNotifId() {
		return notifId;
	}

	public void setNotifId(String notifId) {
		this.notifId = notifId;
	}

	public int getAttemptNo() {
		return attemptNo;
	}

	public void setAttemptNo(int attemptNo) {
		this.attemptNo = attemptNo;
	}
	
	@Override
	public String toString() {
		return "DWNotifAttempt [notifId=" + notifId + ", attemptNo=" + attemptNo + ", cabId=" + cabId + ", clientId="
				+ clientId + ", appType=" + appType + ", clientNotifRefId=" + clientNotifRefId + ", notifStatusCode="
				+ notifStatusCode + ", destId=" + destId + ", mediaType=" + mediaType + ", fromAddress=" + fromAddress
				+ ", address=" + address + ", dispatchSid=" + dispatchSid + ", checkpoints=" + checkpoints
				+ ", resultCode=" + resultCode + ", durationSeconds=" + durationSeconds + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", cabCreationTime=" + cabCreationTime + ", cabCreationDate="
				+ cabCreationDate + ", cabCreationMonth=" + cabCreationMonth + ", cabCreationYear=" + cabCreationYear
				+ ", attemptCreationTime=" + attemptCreationTime + ", owner=" + owner + ", carrier=" + carrier
				+ ", operator=" + operator + ", transferStartTime=" + transferStartTime + ", transferEndTime="
				+ transferEndTime + ", transferDuration=" + transferDuration + ", priority=" + priority
				+ ", cabProcessingTime=" + cabProcessingTime + ", notifCreationTime=" + notifCreationTime
				+ ", flushedTime=" + flushedTime + "]";
	}
}
