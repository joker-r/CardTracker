package com.cardtracker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cardtracker.bean.CardHitResponnseDto;
import com.cardtracker.bean.CardResponseBean;
import com.cardtracker.model.Card;
import com.cardtracker.service.CardService;

@Controller
public class CardController {

    @Autowired
    private CardService cardService;
	
    @CrossOrigin
    @RequestMapping(value="/card-scheme/verify/{cardnumber}", method = RequestMethod.GET)
    	public ResponseEntity<CardResponseBean> verifyCard(@PathVariable String cardnumber){
    	 HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<?> entity = new HttpEntity<>(headers);
         return new ResponseEntity<CardResponseBean>(cardService.cardVerify(cardnumber, entity), HttpStatus.OK);
    } 
           
    @RequestMapping(value = "/card-scheme/stats", params = { "start", "limit" })
    public ResponseEntity<CardHitResponnseDto> getCardHits(@RequestParam("start") int start,
                                                           @RequestParam("limit") int limit){

    	
    	return null;
    } 

    @RequestMapping("/")
    public String welcome(Model model) {
    	Card card = new Card();
    	model.addAttribute("card", card);
        return "welcome";
    }
}
