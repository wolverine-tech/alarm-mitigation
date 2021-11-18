package com.nectar.alarm.dtos;

import com.nectar.alarm.beans.MitigationSource;
import com.nectar.alarm.enums.AppliedOn;

import java.util.List;
import java.util.UUID;

public class MitigationStepDTO {

    private UUID id;


    private String name;

    private Long timeToBeExecuted;

    private String precedence;

    private String expression;

    private String level;

    private String sourceType;

    private AppliedOn appliedOn;

    private List<MitigationSource> source;

    private String[] suspectPoints;

    private String  successMessage;

    private Boolean  informative;
}
