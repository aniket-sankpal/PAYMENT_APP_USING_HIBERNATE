package com.inheritance.app;

import java.util.Date;

import com.inheritance.dao.PaymentDAO;
import com.inheritance.dao.PaymentDAOFactory;
import com.inheritance.model.Cheque;
import com.inheritance.model.CreditCard;

public class App {
	
	public static void main(String[] args) {
		
		PaymentDAO dao=PaymentDAOFactory.getInstance();
		
		CreditCard card=new CreditCard();
		card.setPayId(1234);
		card.setPayAmt(20000);
		card.setPayDate(new Date(2022, 8, 25));
		card.setCardNum(11111111);
		card.setCardType("visa");
	
	  dao.saveCard(card);
	  
	  System.out.println("----------CARD SAVED------------------");
	  
	  Cheque ch=new Cheque();
	  ch.setPayId(123567);
	  ch.setPayAmt(1234);
	  ch.setPayDate(new Date(2023,5,21));
	  ch.setChequeNo(123321);
	  ch.setChequeType("Order");
	  dao.saveCheque(ch);
	  
	  System.out.println("-------------CHEQUE SAVED--------------------");
	  
	
	
	
	}

}

