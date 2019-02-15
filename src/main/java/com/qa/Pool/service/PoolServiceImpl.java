package com.qa.Pool.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.Pool.persistance.domain.Account;
import com.qa.Pool.persistance.domain.Tourney;
import com.qa.Pool.persistance.repository.PoolRepository;



@Service
public class PoolServiceImpl {

	@Autowired
    private PoolRepository repo;
	
	public Tourney addAccount(Tourney tourney, Long accountid) {
		Set<Account> accountToAdd = (Set<Account>) new Account();
		if (((Account) accountToAdd).getId() == accountid) {
		tourney.setAccounts(accountToAdd);
		repo.save(tourney);
		
		}
		return tourney;
		}
		
	}
	

