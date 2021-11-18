package com.nectar.alarm.repository;

import com.nectar.alarm.beans.MitigationStep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MitigationStepRepository extends JpaRepository<MitigationStep, UUID> {
}
