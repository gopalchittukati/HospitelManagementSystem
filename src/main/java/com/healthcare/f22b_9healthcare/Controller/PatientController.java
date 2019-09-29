package com.healthcare.f22b_9healthcare.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Dao.PatientDao;
import com.healthcare.f22b_9healthcare.Service.PatientService;
import com.healthcare.f22b_9healthcare.entity.Patient;

@RestController
@RequestMapping("patientInfo")
public class PatientController {

	@Autowired
	private PatientService patientService;

//============================================
	//Post Details
	
	@PostMapping
	public void patientInfo(@RequestBody Patient patient) {
	//	patient.setDate(new Date());
		patientService.patientInfo(patient);
	}
	
	@PostMapping("/all")
	public void allPatientInfo(@RequestBody List<Patient> patients) {
		patientService.allPatientInfo(patients);
	}
//=======================================================
	//Get Details
	
	@GetMapping("/byMedicine/{name}")
	public List<Object[]> getPatientByMedicineName(@PathVariable("name") String medicineName) {
		return patientService.getPatientByMedicineName(medicineName);
		
	}
	
}
