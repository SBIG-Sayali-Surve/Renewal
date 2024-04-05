package in.sbigeneral.renewal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import in.sbigeneral.renewal.Model.RenewalDetails;
import in.sbigeneral.renewal.Service.RenewalService;


@Controller
public class RenewalController {

	@Autowired
	RenewalService renewalService;

	@Autowired
	RenewalDetails renewalDetails;

	@RequestMapping("/")
	public String home() {
		return "redirect:/Dashboard";
	}

	@RequestMapping("/Dashboard")
	public String dashboard() {
		return "Dashboard";
	}

	@GetMapping("/formData")
	public String form(Model model) {
		System.out.println(" form data ");
//		  JSONObject inJson = null; 
//		  JSONParser jParser = new JSONParser(); 
//		  try { 
//			  inJson = (JSONObject) jParser.parse(search); 
//			  } 
//		  catch (ParseException e) { 
//			  // TODO Auto-generated catch block 
//			  e.printStackTrace(); 
//			  }

//		  String startDate = (String) inJson.get("startDate"); 
//		  String endDate = (String) inJson.get("endDate"); 
//		  String ern = (String) inJson.get("range");
//		 
		List<RenewalDetails> renewalDetails = renewalService.getPolicyDetailsbyDate();
		System.out.println(renewalService.getPolicyDetailsbyDate());
		System.out.println("RenewalList: " + renewalDetails);
		model.addAttribute("policies", renewalDetails);
		return "tableData";
	}

	@PostMapping("/popUpDetails")
	public String popUpDetailsX(Model model) {
		System.out.println("PopUp");
		List<RenewalDetails> renewalDetails = renewalService.getPolicyDetailsbyPolicyNumber();
		System.out.println(renewalService.getPolicyDetailsbyPolicyNumber());
		System.out.println("RenewalList: " + renewalDetails);
		model.addAttribute("policies", renewalDetails);
		return "popup";
	}
}
