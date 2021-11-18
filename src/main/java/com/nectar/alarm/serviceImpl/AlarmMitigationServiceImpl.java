/*******************************************************************************
 * Copyright (c) 2021 Nectar IT
 *
 * Contributors:
 *
 * 1. natasharomanoff
 * 2. wolverine-tech
 *
 * Since Oct 2021
 *******************************************************************************/
package com.nectar.alarm.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nectar.alarm.beans.AlarmMitigationConfig;
import com.nectar.alarm.dtos.AlarmMitigationConfigDTO;
import com.nectar.alarm.repository.AlarmConfigRepository;
import com.nectar.alarm.service.AlarmMitigationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;


@Service
public class AlarmMitigationServiceImpl implements AlarmMitigationService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
    AlarmConfigRepository alarmConfigRepository;

//	@Autowired
//	private SubscriptionProfileService subscriptionProfileService;
//
	@Override
	public AlarmMitigationConfig save(AlarmMitigationConfigDTO alarmConfigDTO) {
		LOGGER.debug("Enter into save alarmMitigationConfig");
		try {
            ObjectMapper objectMapper = new ObjectMapper();
            AlarmMitigationConfig alarmData = objectMapper.convertValue(alarmConfigDTO, AlarmMitigationConfig.class);
			return alarmConfigRepository.save(alarmData);
		} catch (Exception e) {
			LOGGER.error("Error in saving dataset", e.getMessage());
            return null;
		}

	}


}
