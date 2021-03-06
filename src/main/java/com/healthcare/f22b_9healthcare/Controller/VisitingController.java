package com.healthcare.f22b_9healthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Service.VisitingService;
import com.healthcare.f22b_9healthcare.entity.Visiting;

@RestController
@RequestMapping("visiting")
public class VisitingController {

	@Autowired
	private VisitingService visitingService;
//=========================================================	
	//Save details
	
	@PostMapping
	public void saveVisiting(@RequestBody Visiting visiting) {
		visitingService.saveVisiting(visiting);
	}
	
	@PostMapping("/all")
	public void saveAllVisiting(@RequestBody List<Visiting> visitings) {
		visitingService.saveAllVisiting(visitings);
	}
//===========================================================
	//Get data details

	@GetMapping("/byDoctorname/{name}")
	public List<String> getPatientByDoctorName(@PathVariable("name") String doctorName) {
		return visitingService.getPatientByDoctorName(doctorName);
	}
	
	
	@GetMapping("/byPatientName/{name}")
	public List<String> getDoctorByPatientName(@PathVariable("name") String patientName) {
		return visitingService.getDoctorByPatientName(patientName);
	}
	
}
