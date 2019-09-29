package com.healthcare.f22b_9healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Dao.MedicineDao;
import com.healthcare.f22b_9healthcare.entity.Medicine;

@RestController
public class MedicineController {

	@Autowired
	private MedicineDao medicineDao;
	
	@RequestMapping("medicineInfo")
	public void medicineInfo(@RequestBody Medicine medicine) {
		medicineDao.save(medicine);
	}
}
