package com.nectar.alarm.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nectar.alarm.beans.AlarmConfig;
import com.nectar.alarm.dtos.AlarmConfigDTO;
import com.nectar.alarm.repository.AlarmConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AlarmConfigController {

    @Autowired
    private AlarmConfigRepository alarmConfigRepository;

    @PostMapping("/alarm")
    public AlarmConfig create(@RequestBody AlarmConfigDTO alarmConfigDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        AlarmConfig alarmData = objectMapper.convertValue(alarmConfigDTO,AlarmConfig.class);
        return alarmConfigRepository.save(alarmData);
    }
}
