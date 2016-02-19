package com.example.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PurchaseOrder {

	@Id 
	@GeneratedValue
	Long id;
	
	List<Plant> reservations;
	Plant plant;

	LocalDate issueDate;
	LocalDate paymentSchedule;
	@Column(precision=8,scale=2)
	BigDecimal total;

	@Enumerated(EnumType.STRING)
	POStatus status;
	//LocalDate startDate;
	//LocalDate endDate;
	//Replace it with BusinessPeriod.
	BusinessPeriod rentalPeriod;
}
