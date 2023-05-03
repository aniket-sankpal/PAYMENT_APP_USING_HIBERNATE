package com.inheritance.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name = "Payment")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "PMODE",discriminatorType = DiscriminatorType.STRING)
public class Payment {
    @Id
	private int payId;
	private double payAmt;
	private Date payDate;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public double getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(double payAmt) {
		this.payAmt = payAmt;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Payment(int payId, double payAmt, Date payDate) {
		super();
		this.payId = payId;
		this.payAmt = payAmt;
		this.payDate = payDate;
	}

	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", payAmt=" + payAmt + ", payDate=" + payDate + "]";
	}

}


