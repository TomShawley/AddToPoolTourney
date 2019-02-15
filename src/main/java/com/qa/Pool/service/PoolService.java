package com.qa.Pool.service;

import java.util.Set;

import com.qa.Pool.persistance.domain.Account;
import com.qa.Pool.persistance.domain.Tourney;

public interface PoolService {

	Tourney addAccount(Tourney tourney, Long accountid);
}
