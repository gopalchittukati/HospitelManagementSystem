package com.healthcare.f22b_9healthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.f22b_9healthcare.Dao.MedicationDao;
import com.healthcare.f22b_9healthcare.entity.Medication;

@Service
public class MedicationService {

	@Autowired
	private MedicationDao medicationDao;
	
	public void saveMedication(Medication medication) {
		medicationDao.save(medication);
	}
	
	public void saveAllMedication(List<Medication> medications) {
		medicationDao.saveAll(medications);
	}
}
