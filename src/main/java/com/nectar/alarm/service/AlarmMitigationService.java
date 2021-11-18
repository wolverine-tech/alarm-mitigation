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
package com.nectar.alarm.service;

import com.nectar.alarm.beans.AlarmMitigationConfig;
import com.nectar.alarm.dtos.AlarmMitigationConfigDTO;

public interface AlarmMitigationService {

	AlarmMitigationConfig save(AlarmMitigationConfigDTO alarmMitigationConfigDTO);

//    AlarmMitigationConfig update( AlarmMitigationConfigDTO alarmMitigationConfigDTO);
//
//    AlarmMitigationConfig delete(AlarmMitigationConfigDTO alarmMitigationConfigDTO );


}
