package com.inheritance.dao;

import com.inheritance.model.Cheque;
import com.inheritance.model.CreditCard;

public interface PaymentDAO {

	void saveCard(CreditCard card);

	void saveCheque(Cheque cheque);

}
