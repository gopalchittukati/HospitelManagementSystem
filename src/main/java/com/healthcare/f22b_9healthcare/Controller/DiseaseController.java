package com.healthcare.f22b_9healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Dao.DiseaseDao;
import com.healthcare.f22b_9healthcare.entity.Disease;

@RestController
public class DiseaseController {

	@Autowired
	private DiseaseDao diseaseDao;
	
	@RequestMapping("diseaseInfo")
	public void diseaseInfo(@RequestBody Disease disease) {
		diseaseDao.save(disease);
	}
}
