package com.booking.demo.entity;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "deposite_master")
public class DepositeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "deposite_code")
	private int depositeCode;

	@NotBlank(message = "Deposite type should not be blank")
	@Column(name = "deposite_type")
	private String depositeType;

	public DepositeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepositeMaster(int depositeCode, String depositeType) {
		super();
		this.depositeCode = depositeCode;
		this.depositeType = depositeType;
	}

	@Override
	public String toString() {
		return "DepositeMaster [depositeCode=" + depositeCode + ", depositeType=" + depositeType + "]";
	}

	public int getDepositeCode() {
		return depositeCode;
	}

	public void setDepositeCode(int depositeCode) {
		this.depositeCode = depositeCode;
	}

	public String getDepositeType() {
		return depositeType;
	}

	public void setDepositeType(String depositeType) {
		this.depositeType = depositeType;
	}

}
