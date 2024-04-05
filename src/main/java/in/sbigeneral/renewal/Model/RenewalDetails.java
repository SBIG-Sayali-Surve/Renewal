package in.sbigeneral.renewal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
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
}