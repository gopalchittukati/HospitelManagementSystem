package com.healthcare.f22b_9healthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.f22b_9healthcare.Dao.PatientDao;
import com.healthcare.f22b_9healthcare.entity.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientDao patientDao;

//============================================
	//Post Details
	
	public void patientInfo(Patient patient) {
		patientDao.save(patient);
	}
	
	public void allPatientInfo(List<Patient> patients) {
		patientDao.saveAll(patients);
	}
//==============================================	
	//Get Details
	
	
	public List<Object[]> getPatientByMedicineName(String medicineName) {
		return patientDao.getPatientByMedicineName(medicineName);
	}
	
	
	
	
	
}
