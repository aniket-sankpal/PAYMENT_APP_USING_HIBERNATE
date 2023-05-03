package com.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Cheque")
@DiscriminatorValue(value = "CH")
public class Cheque extends Payment {

	private int chequeNo;
	private String chequeType;

	public Cheque() {
		// TODO Auto-generated constructor stub
	}

	public Cheque(int chequeNo, String chequeType) {
		super();
		this.chequeNo = chequeNo;
		this.chequeType = chequeType;
	}

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	@Override
	public String toString() {
		return "Cheque [chequeNo=" + chequeNo + ", chequeType=" + chequeType + "]";
	}

}
