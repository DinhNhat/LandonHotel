package com.springangular.nhatdinh.model.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReservationRequest {
	
	private Long id;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate checkin;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate checkout;
	
	public ReservationRequest() {
		super();
	}

	public ReservationRequest(Long id, LocalDate checkin, LocalDate checkout) 
	{
		super();
		this.id = id;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getCheckin() {
		return checkin;
	}
	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}
	public LocalDate getCheckout() {
		return checkout;
	}
	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
}
