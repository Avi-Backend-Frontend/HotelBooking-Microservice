package com.booking.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
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
@Table(name = "hotel_address_master")
public class HotelAddressMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_address_id")
	private int hotelAddressId;

	@NotBlank(message = "Owner name shoukd not be blank")
	@Column(name = "hotel_owner_name")
	private String hotelOwnerName;

	@NotBlank(message = "Place name shoukd not be blank")
	@Column(name = "hotel_place")
	private String hotelPlace;

	@NotBlank(message = "Dist name shoukd not be blank")
	@Column(name = "hotel_dist")
	private String hotelDist;

	@NotBlank(message = "State name shoukd not be blank")
	@Column(name = "hotel_state")
	private String hotelState;

	@NotBlank(message = "Country name shoukd not be blank")
	@Column(name = "hotel_country")
	private String hotelCountry;

	@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
	@Column(name = "hotel_contact_no")
	private String hotelContactNo;

	@Email(message = "Email address is not valid")
	@Column(name = "hotel_email")
	private String hotelEmail;

	public HotelAddressMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelAddressMaster(int hotelAddressId, String hotelOwnerName, String hotelPlace, String hotelDist,
			String hotelState, String hotelCountry, String hotelContactNo, String hotelEmail) {
		super();
		this.hotelAddressId = hotelAddressId;
		this.hotelOwnerName = hotelOwnerName;
		this.hotelPlace = hotelPlace;
		this.hotelDist = hotelDist;
		this.hotelState = hotelState;
		this.hotelCountry = hotelCountry;
		this.hotelContactNo = hotelContactNo;
		this.hotelEmail = hotelEmail;
	}

	@Override
	public String toString() {
		return "HotelAddressMaster [hotelAddressId=" + hotelAddressId + ", hotelOwnerName=" + hotelOwnerName
				+ ", hotelPlace=" + hotelPlace + ", hotelDist=" + hotelDist + ", hotelState=" + hotelState
				+ ", hotelCountry=" + hotelCountry + ", hotelContactNo=" + hotelContactNo + ", hotelEmail=" + hotelEmail
				+ "]";
	}

	public int getHotelAddressId() {
		return hotelAddressId;
	}

	public void setHotelAddressId(int hotelAddressId) {
		this.hotelAddressId = hotelAddressId;
	}

	public String getHotelOwnerName() {
		return hotelOwnerName;
	}

	public void setHotelOwnerName(String hotelOwnerName) {
		this.hotelOwnerName = hotelOwnerName;
	}

	public String getHotelPlace() {
		return hotelPlace;
	}

	public void setHotelPlace(String hotelPlace) {
		this.hotelPlace = hotelPlace;
	}

	public String getHotelDist() {
		return hotelDist;
	}

	public void setHotelDist(String hotelDist) {
		this.hotelDist = hotelDist;
	}

	public String getHotelState() {
		return hotelState;
	}

	public void setHotelState(String hotelState) {
		this.hotelState = hotelState;
	}

	public String getHotelCountry() {
		return hotelCountry;
	}

	public void setHotelCountry(String hotelCountry) {
		this.hotelCountry = hotelCountry;
	}

	public String getHotelContactNo() {
		return hotelContactNo;
	}

	public void setHotelContactNo(String hotelContactNo) {
		this.hotelContactNo = hotelContactNo;
	}

	public String getHotelEmail() {
		return hotelEmail;
	}

	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}

}
