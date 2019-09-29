package com.healthcare.f22b_9healthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.f22b_9healthcare.Dao.VisitingDao;
import com.healthcare.f22b_9healthcare.entity.Visiting;

@Service
public class VisitingService {

	@Autowired
	private VisitingDao visitingDao;

//==================================================
	//Save details
	
	public void saveVisiting(Visiting visiting) {
		visitingDao.save(visiting);
	}
	
	public void saveAllVisiting(List<Visiting> visitings) {
		visitingDao.saveAll(visitings);
	}
//=============================================================
	//Get Data Details
	
	public List<String> getPatientByDoctorName(String doctorName) {
		return visitingDao.getPatientByDoctorName(doctorName);
	}
	
	
	public List<String> getDoctorByPatientName(String patientName) {
		return visitingDao.getDoctorByPatientName(patientName);
	}
	
	
}
