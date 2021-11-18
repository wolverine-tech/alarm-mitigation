package com.nectar.alarm.repository;

import com.nectar.alarm.beans.AlarmConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlarmConfigRepository extends JpaRepository<AlarmConfig, UUID> {
}
