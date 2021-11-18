package com.nectar.alarm.repository;

import com.nectar.alarm.beans.AlarmMitigationConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlarmConfigRepository extends JpaRepository<AlarmMitigationConfig, UUID> {
}
