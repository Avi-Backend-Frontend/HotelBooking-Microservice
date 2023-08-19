package com.booking.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_address_master")
public class CustomerAddressMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_address_id")
	private int customerAddressId;

	@NotBlank(message = "Customer name shoukd not be blank")
	@Column(name = "customer_name")
	private String customerName;

	@NotBlank(message = "Father name can not be empty")
	@Column(name = "customer_father_name")
	private String customerFatherName;

	@NotBlank(message = "At name must not be null")
	@Column(name = "at")
	private String customerAt;

	@NotBlank(message = "Po name must not be null")
	@Column(name = "po")
	private String customerPo;

	@NotNull(message = "Police station name must not be null")
	@Column(name = "police_station")
	private String policeStation;

	@Min(3)
	@Max(6)
	@Column(name = "pincode")
	private int pinCode;

	@NotNull(message = "Dist name must not be null")
	@Column(name = "dist")
	private String dist;

	@NotNull(message = "State name must not be null")
	@Column(name = "state")
	private String customerState;

	@NotBlank(message = "Country name is mandatory")
	@Column(name = "country")
	private String customerCountry;

	@Email(message = "Email address is not valid")
	@Column(name = "email")
	private String customerEmail;

	@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
	@Column(name = "mob_no")
	private String mobNo;

	public CustomerAddressMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAddressMaster(int customerAddressId, String customerName, String customerFatherName,
			String customerAt, String customerPo, String policeStation, int pinCode, String dist, String customerState,
			String customerCountry, String customerEmail, String mobNo) {
		super();
		this.customerAddressId = customerAddressId;
		this.customerName = customerName;
		this.customerFatherName = customerFatherName;
		this.customerAt = customerAt;
		this.customerPo = customerPo;
		this.policeStation = policeStation;
		this.pinCode = pinCode;
		this.dist = dist;
		this.customerState = customerState;
		this.customerCountry = customerCountry;
		this.customerEmail = customerEmail;
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "CustomerAddressMaster [customerAddressId=" + customerAddressId + ", customerName=" + customerName
				+ ", customerFatherName=" + customerFatherName + ", customerAt=" + customerAt + ", customerPo="
				+ customerPo + ", policeStation=" + policeStation + ", pinCode=" + pinCode + ", dist=" + dist
				+ ", customerState=" + customerState + ", customerCountry=" + customerCountry + ", customerEmail="
				+ customerEmail + ", mobNo=" + mobNo + "]";
	}

	public int getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerFatherName() {
		return customerFatherName;
	}

	public void setCustomerFatherName(String customerFatherName) {
		this.customerFatherName = customerFatherName;
	}

	public String getCustomerAt() {
		return customerAt;
	}

	public void setCustomerAt(String customerAt) {
		this.customerAt = customerAt;
	}

	public String getCustomerPo() {
		return customerPo;
	}

	public void setCustomerPo(String customerPo) {
		this.customerPo = customerPo;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

}
