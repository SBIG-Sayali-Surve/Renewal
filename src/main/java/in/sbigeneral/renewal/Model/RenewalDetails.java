package in.sbigeneral.renewal.Model;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonComponent
public class RenewalDetails {

	@JsonProperty("trackingId")
	private String trackingId;

	@JsonProperty("creationTime")
	private String creationTime;

	@JsonProperty("source")
	private String source;

	private String status;

	@JsonProperty("ircode")
	private String ircode;

	private String partyID;

	private String policyNo;

	private String errordetails;

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIrcode() {
		return ircode;
	}

	public void setIrcode(String ircode) {
		this.ircode = ircode;
	}

	public String getPartyID() {
		return partyID;
	}

	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getErrordetails() {
		return errordetails;
	}

	public void setErrordetails(String errordetails) {
		this.errordetails = errordetails;
	}

	public RenewalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RenewalDetails(String trackingId, String creationTime, String source, String status, String ircode,
			String partyID, String policyNo, String errordetails) {
		super();
		this.trackingId = trackingId;
		this.creationTime = creationTime;
		this.source = source;
		this.status = status;
		this.ircode = ircode;
		this.partyID = partyID;
		this.policyNo = policyNo;
		this.errordetails = errordetails;
	}

	@Override
	public String toString() {
		return "RenewalDetails [trackingId=" + trackingId + ", creationTime=" + creationTime + ", source=" + source
				+ ", status=" + status + ", ircode=" + ircode + ", partyID=" + partyID + ", policyNo=" + policyNo
				+ ", errordetails=" + errordetails + "]";
	}
	
	

}