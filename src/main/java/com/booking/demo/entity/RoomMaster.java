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
@Table(name = "room_master")
public class RoomMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room_no")
	private int roomNo;

	@NotBlank(message = "Room type can not be blank")
	@Column(name = "room_type")
	private String roommType;

	public RoomMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomMaster(int roomNo, @NotBlank(message = "Room type can not be blank") String roommType) {
		super();
		this.roomNo = roomNo;
		this.roommType = roommType;
	}

	@Override
	public String toString() {
		return "RoomMaster [roomNo=" + roomNo + ", roommType=" + roommType + "]";
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoommType() {
		return roommType;
	}

	public void setRoommType(String roommType) {
		this.roommType = roommType;
	}

}
