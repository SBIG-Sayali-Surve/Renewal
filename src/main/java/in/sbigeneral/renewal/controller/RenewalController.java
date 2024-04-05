package in.sbigeneral.renewal.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import in.sbigeneral.renewal.Model.FormData;
import in.sbigeneral.renewal.Model.PolicyDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import in.sbigeneral.renewal.Model.RenewalDetails;
import in.sbigeneral.renewal.Service.RenewalService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RenewalController {

	private final RenewalService renewalService;

	@RequestMapping("/")
	public String home() {
		return "redirect:/Dashboard";
	}

	@RequestMapping("/Dashboard")
	public String dashboard(Model model) {
		LocalDateTime endDate = LocalDateTime.now();
		LocalDateTime starDate = endDate.minusDays(2);
		model.addAttribute("formData",new FormData(starDate,endDate,10,0));
		return "Dashboard";
	}

	@GetMapping("/formData")
	public String form(@ModelAttribute FormData formData, Model model) {
		System.out.println(" form data : "+ formData.toString());
		List<PolicyDetail> policyList=renewalService.getPolicyList();
		model.addAttribute("policies", policyList);
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
