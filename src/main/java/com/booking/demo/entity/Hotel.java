package com.booking.demo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_id")
	private int hotelId;

	@NotBlank(message = "Hotel name should not be blank")
	@Column(name = "hotel_name")
	private String hotelName;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelAddressMaster", referencedColumnName = "hotel_address_id")
	private HotelAddressMaster hotelAddressMaster;

	@NotNull(message = "Hotel agent name is mandatory")
	@Column(name = "hotel_agent_name")
	private String hotelAgentName;

	@NotNull(message = "Hotel revenue should not be blank")
	@Column(name = "hotel_revenue")
	private int hotelRevenue;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "roomMaster", referencedColumnName = "room_no")
	private RoomMaster roomMaster;

	@NotBlank
	@Size(max = 33)
	@Column(name = "customer_name")
	private String customerName;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "customerAddressMaster", referencedColumnName = "customer_address_id")
	private CustomerAddressMaster customerAddressMaster;

	@NotNull
	@Column(name = "no_of_adults")
	private int noOfAdults;

	@NotNull
	@Column(name = "no_of_children")
	private int noOfChildren;

	@NotNull
	@Min(3)
	@Max(9)
	@Column(name = "total_meal")
	private int totalMeal;

	@Min(2000)
	@Column(name = "booking_charges")
	private int bookingCharges;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "depositeMaster", referencedColumnName = "deposite_code")
	private DepositeMaster depositeMaster;

	@NotBlank(message = "Booking stratus should not be blank")
	@Column(name = "booking_status")
	private int bookingStatus;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int hotelId, @NotBlank(message = "Hotel name should not be blank") String hotelName,
			HotelAddressMaster hotelAddressMaster,
			@NotNull(message = "Hotel agent name is mandatory") String hotelAgentName,
			@NotNull(message = "Hotel revenue should not be blank") int hotelRevenue, RoomMaster roomMaster,
			@NotBlank @Size(max = 33) String customerName, CustomerAddressMaster customerAddressMaster,
			@NotNull int noOfAdults, @NotNull int noOfChildren, @NotNull @Min(3) @Max(9) int totalMeal,
			@Min(2000) int bookingCharges, DepositeMaster depositeMaster,
			@NotBlank(message = "Booking stratus should not be blank") int bookingStatus) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddressMaster = hotelAddressMaster;
		this.hotelAgentName = hotelAgentName;
		this.hotelRevenue = hotelRevenue;
		this.roomMaster = roomMaster;
		this.customerName = customerName;
		this.customerAddressMaster = customerAddressMaster;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.totalMeal = totalMeal;
		this.bookingCharges = bookingCharges;
		this.depositeMaster = depositeMaster;
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddressMaster=" + hotelAddressMaster
				+ ", hotelAgentName=" + hotelAgentName + ", hotelRevenue=" + hotelRevenue + ", roomMaster=" + roomMaster
				+ ", customerName=" + customerName + ", customerAddressMaster=" + customerAddressMaster
				+ ", noOfAdults=" + noOfAdults + ", noOfChildren=" + noOfChildren + ", totalMeal=" + totalMeal
				+ ", bookingCharges=" + bookingCharges + ", depositeMaster=" + depositeMaster + ", bookingStatus="
				+ bookingStatus + "]";
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public HotelAddressMaster getHotelAddressMaster() {
		return hotelAddressMaster;
	}

	public void setHotelAddressMaster(HotelAddressMaster hotelAddressMaster) {
		this.hotelAddressMaster = hotelAddressMaster;
	}

	public String getHotelAgentName() {
		return hotelAgentName;
	}

	public void setHotelAgentName(String hotelAgentName) {
		this.hotelAgentName = hotelAgentName;
	}

	public int getHotelRevenue() {
		return hotelRevenue;
	}

	public void setHotelRevenue(int hotelRevenue) {
		this.hotelRevenue = hotelRevenue;
	}

	public RoomMaster getRoomMaster() {
		return roomMaster;
	}

	public void setRoomMaster(RoomMaster roomMaster) {
		this.roomMaster = roomMaster;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerAddressMaster getCustomerAddressMaster() {
		return customerAddressMaster;
	}

	public void setCustomerAddressMaster(CustomerAddressMaster customerAddressMaster) {
		this.customerAddressMaster = customerAddressMaster;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public int getTotalMeal() {
		return totalMeal;
	}

	public void setTotalMeal(int totalMeal) {
		this.totalMeal = totalMeal;
	}

	public int getBookingCharges() {
		return bookingCharges;
	}

	public void setBookingCharges(int bookingCharges) {
		this.bookingCharges = bookingCharges;
	}

	public DepositeMaster getDepositeMaster() {
		return depositeMaster;
	}

	public void setDepositeMaster(DepositeMaster depositeMaster) {
		this.depositeMaster = depositeMaster;
	}

	public int getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(int bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}
