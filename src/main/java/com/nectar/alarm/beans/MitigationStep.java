package com.nectar.alarm.beans;

import com.nectar.alarm.enums.AppliedOn;
import com.sun.xml.internal.fastinfoset.util.StringArray;
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
    @JoinColumn(name = "alarm_configuration_id",referencedColumnName="id")
    private AlarmConfig alarm_configuration;


    public AlarmConfig getAlarm_configuration() {
        return alarm_configuration;
    }

    public void setAlarm_configuration(AlarmConfig alarm_configuration) {
        this.alarm_configuration = alarm_configuration;
    }
}
