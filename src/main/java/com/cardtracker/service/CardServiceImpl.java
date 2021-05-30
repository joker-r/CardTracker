package com.cardtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import com.cardtracker.bean.BListResponse;
import com.cardtracker.bean.CardHitResponnseDto;
import com.cardtracker.bean.CardResponseBean;
import com.cardtracker.bean.Payload;
import com.cardtracker.conf.RestHit;




@Service
public class CardServiceImpl implements CardService {

	@Autowired
	RestHit restHit;

	/*
	 * @Override public CardHitResponnseDto
	 * getCardVerificationRequestRecords(Pageable pageable) { // TODO Auto-generated
	 * method stub return null; }
	 */

@Override
public CardResponseBean cardVerify(String cardnumber, HttpEntity<?> entity) {
	 BListResponse binListResponse = null;
     ResponseEntity<BListResponse> response = null;
	 try {
         response = restHit.exchange( "https://lookup.binlist.net" + "/{validCardNumber}",
                 HttpMethod.GET, entity, BListResponse.class, cardnumber);
         binListResponse = response.getBody();
     } catch (HttpStatusCodeException exception){
         throw  exception;
     }
	 return mapToCardVerifyResponseDto(binListResponse);
}

private CardResponseBean mapToCardVerifyResponseDto(BListResponse binListResponse){
	CardResponseBean cardVerifyResponseDto = new CardResponseBean();
    Payload cardVerifyPayloadDto = new Payload();

    if(binListResponse != null){
        cardVerifyResponseDto.setPayload(cardVerifyPayloadDto);
        cardVerifyResponseDto
                .getPayload()
                .setBank(binListResponse.getBank() == null ? "" : binListResponse.getBank().getName());

        cardVerifyResponseDto
                .getPayload()
                .setScheme(binListResponse.getScheme() == null ? "" : binListResponse.getScheme());

        cardVerifyResponseDto
                .getPayload()
                .setType(binListResponse.getType() == null ? "" : binListResponse.getType());

        cardVerifyResponseDto.setSuccess(true);

    }

    return cardVerifyResponseDto;
}

}