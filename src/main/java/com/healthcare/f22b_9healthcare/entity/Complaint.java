package com.healthcare.f22b_9healthcare.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complaint")
public class Complaint {
 
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable(
			name="complaint_disease",
			joinColumns={@JoinColumn(name="cid")},
			inverseJoinColumns={@JoinColumn(name="deid")}
	)
	private List<Disease> disease;

	private String description;
	
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting visiting;
	
	//Our Convineient adding this Medication relation 
	
	@OneToMany(mappedBy="complaint",cascade=CascadeType.ALL)
	private List<Medication> medications;

	public List<Medication> getMedications() {
		return medications;
	}
	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Visiting getVisiting() {
		return visiting;
	}
	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}
	
	
	
}
