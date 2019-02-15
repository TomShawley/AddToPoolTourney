package com.qa.Pool.rest;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.Pool.persistance.domain.Account;
import com.qa.Pool.persistance.domain.Tourney;
import com.qa.Pool.service.PoolService;




@CrossOrigin
@RequestMapping("${path.base}")
@RestController
public class PoolRest {

	@Autowired
    private PoolService service;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private JmsTemplate jmsTemplate;
    
    @PutMapping("${path.addAccount}")
    public Tourney addAccount(@RequestBody Tourney tourney, @PathVariable Long tourneyid, @PathVariable Long accountid) {
        
    	return service.addAccount(tourney, accountid);
    }
}
