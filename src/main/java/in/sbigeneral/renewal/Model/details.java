package in.sbigeneral.renewal.Model;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonComponent
public class details {

	@JsonProperty("trackingId")
	private String trackingId;

	@JsonProperty("PartyId")
	private String PartyId;
	
	@JsonProperty("PolicyNo")
	private String PolicyNo;

	@JsonProperty("status")
	private String status;

	@JsonProperty("Eiano")
	private String Eiano;

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public String getInsuremoPolicyId() {
		return PartyId;
	}

	public void setInsuremoPolicyId(String insuremoPolicyId) {
		this.PartyId = insuremoPolicyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreationTime() {
		return Eiano;
	}

	public void setCreationTime(String creationTime) {
		this.Eiano = creationTime;
	}

	public details() {
		super();
	}

	public details(String trackingId, String insuremoPolicyId, String status, String creationTime) {
		super();
		this.trackingId = trackingId;
		this.PartyId = insuremoPolicyId;
		this.status = status;
		this.Eiano = creationTime;
	}

	@Override
	public String toString() {
		return "Policies [trackingId=" + trackingId + ", insuremoPolicyId=" + PartyId + ", status=" + status
				+ ", creationTime=" + Eiano + "]";
	}
}