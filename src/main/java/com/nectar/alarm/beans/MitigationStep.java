package com.nectar.alarm.beans;

import com.nectar.alarm.enums.AppliedOn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "mitigation_step")
@Builder()
@NoArgsConstructor
@AllArgsConstructor
public class MitigationStep {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "time_to_be_executed")
    private Long timeToBeExecuted;

    @Column(name = "precedence")
    private String precedence;

    @Column(name = "expression")
    private String expression;

    @Column(name = "level")
    private String level;

    @Column(name = "source_type")
    private String sourceType;

    @Column(name = "applied_on")
    private AppliedOn appliedOn;

    @OneToMany(mappedBy = "mitigation_step")
    private Set<MitigationSource> mitigationSources;

    @Column(name = "suspect_points")
    private String[] suspectPoints;

    @Column(name = "success_message")
    private String  successMessage;

    @Column(name = "informative")
    private Boolean  informative;



    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "alarm_mitigation_configuration_id",referencedColumnName="id")
    private AlarmMitigationConfig alarmMitigationConfig;


    public AlarmMitigationConfig getAlarm_configuration() {
        return  alarmMitigationConfig;
    }

    public void setAlarm_configuration(AlarmMitigationConfig alarm_configuration) {
        this.alarmMitigationConfig = alarm_configuration;
    }
}
