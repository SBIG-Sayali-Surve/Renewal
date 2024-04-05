package in.sbigeneral.renewal.Service;

import java.util.List;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sbigeneral.renewal.Model.RenewalDetails;

@Service
public class RenewalServiceImpl implements RenewalService {

	@Autowired
	Environment appProperties;
	
	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	public List<RenewalDetails> getPolicyDetailsbyPolicyNumber() {
		String url = appProperties.getProperty("api.url.policyno");
		// http://run.mocky.io/v3/5ad20ab0-b1e4-4885-a27c-ab4b0876b7c6
		RenewalDetails[] policyListResponse = restTemplate.getForObject(url, RenewalDetails[].class);
		List<RenewalDetails> policyList = Arrays.asList(policyListResponse);
		return policyList;
	}

	@Override
	public List<RenewalDetails> getPolicyDetailsbyPartyID() {
		String url = appProperties.getProperty("api.url.partyid");
		// http://run.mocky.io/v3/5ad20ab0-b1e4-4885-a27c-ab4b0876b7c6
		RenewalDetails[] policyListResponse = restTemplate.getForObject(url, RenewalDetails[].class);
		List<RenewalDetails> policyList = Arrays.asList(policyListResponse);
		return policyList;
	}

	//@Override
	//public List<CeiaDetails> getPolicyDetailsbyEiaNumber() {
		//String url = appProperties.getProperty("api.url.eiano");
		// String url = http://run.mocky.io/v3/5ad20ab0-b1e4-4885-a27c-ab4b0876b7c6
		//CeiaDetails[] policyListResponse = restTemplate.getForObject(url, CeiaDetails[].class);
		//List<CeiaDetails> policyList = Arrays.asList(policyListResponse);
		//return policyList;
	//}

	@Override
	public List<RenewalDetails> getPolicyDetailsbyDate() {
		String url = "https://apigenerator.dronahq.com/api/QuCmiyq9/data";
		//String url = appProperties.getProperty("api.url.date");
		RenewalDetails[] policyListResponse = restTemplate.getForObject(url, RenewalDetails[].class);
		System.out.println(policyListResponse);
		List<RenewalDetails> policyList = Arrays.asList(policyListResponse);
		//List<CeiaDetails> policyList = ceiaApi.getResponceForApi();
		System.out.println(policyList);
		return policyList;
	}

	@Override
	public List<RenewalDetails> getPolicyDetailsbyEiaNumber() {
		// TODO Auto-generated method stub
		String url = appProperties.getProperty("api.url.eia");
		RenewalDetails[] policyListResponse = restTemplate.getForObject(url, RenewalDetails[].class);
		List<RenewalDetails> policyList = Arrays.asList(policyListResponse);
		return policyList;


		
	}
}