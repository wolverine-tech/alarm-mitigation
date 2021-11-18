package com.nectar.alarm.beans;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "mitigation_source")
@Builder()
@NoArgsConstructor
@AllArgsConstructor
public class MitigationSource {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "domain")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "path")
    private String path;


    @ManyToOne
    @JoinColumn(name = "mitigation_step_id")
    private MitigationStep mitigation_step;

    public MitigationStep getMitigation_step() {
        return mitigation_step;
    }

    public void setMitigation_step(MitigationStep mitigation_step) {
        this.mitigation_step = mitigation_step;
    }
}
