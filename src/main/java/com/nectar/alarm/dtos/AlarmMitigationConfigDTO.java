package com.nectar.alarm.dtos;

import com.nectar.alarm.beans.MitigationSource;
import com.nectar.alarm.beans.MitigationStep;
import com.nectar.alarm.enums.Status;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class AlarmMitigationConfigDTO {


    private UUID id;


    private String name;


    private String description;


    private Status status;


    private String evacuationPlan;

    private String mitigationPlan;

    private String domain;

    private Long createdOn;

    private String createdBy;

    private Long updatedOn;

    private String updatedBy;

    private List<MitigationStep> mitigationSteps;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEvacuationPlan() {
        return evacuationPlan;
    }

    public void setEvacuationPlan(String evacuationPlan) {
        this.evacuationPlan = evacuationPlan;
    }

    public String getMitigationPlan() {
        return mitigationPlan;
    }

    public void setMitigationPlan(String mitigationPlan) {
        this.mitigationPlan = mitigationPlan;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Long updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<MitigationStep> getMitigationSteps() {
        return mitigationSteps;
    }

    public void setMitigationSteps(List<MitigationStep> mitigationSteps) {
        this.mitigationSteps = mitigationSteps;
    }


}
