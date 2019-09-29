package com.healthcare.f22b_9healthcare.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.healthcare.f22b_9healthcare.Dao.AppointmentDao;
import com.healthcare.f22b_9healthcare.entity.Appointment;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;

//======================================================================
	//Save details
	
	public void saveAppointment(Appointment appointment) {
		appointmentDao.save(appointment);
	}
	
	public void saveAllAppointment(List<Appointment> appointments) {
		appointmentDao.saveAll(appointments);
	}
//===================================================================
	//Get data details
	
	public List<Object[]> getAppointAndPatientByDate(Date date) {
		return appointmentDao.getAppointAndPatientByDate(date);
	}
	
}
