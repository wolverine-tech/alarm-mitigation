package com.nectar.alarm.beans;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nectar.alarm.enums.Status;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "alarm_mitigation_configuration")
@Builder()
@NoArgsConstructor
@AllArgsConstructor

public class AlarmMitigationConfig {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "evacuation_plan")
    private String evacuationPlan;

    @Column(name = "mitigation_plan")
    private String mitigationPlan;

    @Column(name = "domain")
    private String domain;

    @Column(name = "created_on")
    private Long createdOn;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_on")
    private Long updatedOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "alarm_configuration", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("alarm_mitigation_configuration")
    private List<MitigationStep> mitigationSteps;





}
