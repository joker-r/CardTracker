package com.cardtracker.service;

import org.springframework.http.HttpEntity;

import com.cardtracker.bean.CardHitResponnseDto;
import com.cardtracker.bean.CardResponseBean;

public interface CardService {

	public CardResponseBean cardVerify(String cardnumber, HttpEntity<?> entity);
	
	//public CardHitResponnseDto getCardVerificationRequestRecords(Pageable pageable);
}
