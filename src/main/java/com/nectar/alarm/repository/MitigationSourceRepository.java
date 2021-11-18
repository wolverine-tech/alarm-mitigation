package com.nectar.alarm.repository;

import com.nectar.alarm.beans.MitigationSource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MitigationSourceRepository extends JpaRepository<MitigationSource, UUID> {
}
