package com.healthcare.f22b_9healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Dao.DoctorDao;
import com.healthcare.f22b_9healthcare.entity.Doctor;

@RestController
public class DoctorController {

	@Autowired
	private DoctorDao doctorDao;
	
	@RequestMapping("doctorInfo")
	public void doctorInfo(@RequestBody Doctor doctor) {
		doctorDao.save(doctor);
	}
	
}
