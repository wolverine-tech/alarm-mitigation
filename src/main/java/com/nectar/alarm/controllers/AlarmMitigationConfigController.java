package com.nectar.alarm.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nectar.alarm.beans.AlarmMitigationConfig;
import com.nectar.alarm.dtos.AlarmMitigationConfigDTO;
import com.nectar.alarm.repository.AlarmConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AlarmMitigationConfigController {

    @Autowired
    private AlarmConfigRepository alarmConfigRepository;

    @PostMapping("/alarm")
    public AlarmMitigationConfig create(@RequestBody AlarmMitigationConfigDTO alarmConfigDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        AlarmMitigationConfig alarmData = objectMapper.convertValue(alarmConfigDTO, AlarmMitigationConfig.class);
        return alarmConfigRepository.save(alarmData);
    }
}
