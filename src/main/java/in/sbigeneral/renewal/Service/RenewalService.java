package in.sbigeneral.renewal.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sbigeneral.Renewal.Model.RenewalDetails;

@Service
public interface RenewalService {

	public List<RenewalDetails> getPolicyDetailsbyPolicyNumber();
	public List<RenewalDetails> getPolicyDetailsbyPartyID();
	public List<RenewalDetails> getPolicyDetailsbyEiaNumber();
	public List<RenewalDetails> getPolicyDetailsbyDate();



	
}
