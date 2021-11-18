/*******************************************************************************
 * Copyright (c) 2021 Nectar IT
 *
 * Contributors:
 *
 * 1. natasharomanoff
 * 2. wolverine-tech
 *
 * Since Oct 2021
 *******************************************************************************/

package com.nectar.alarm.constants;

public interface ApiDocConstant {

	public static final String GENERAL_FIELD_NOT_SPECIFIED_CODE = "505";
	public static final String GENERAL_SUCCESS_RESP_CODE = "200";
	public static final String GENERAL_DATA_NOT_AVAILABLE_CODE = "500";
	public static final String GENERAL_FIELD_INVALID_CODE = "508";
	public static final String PERSISTENCE_ERROR_CODE = "503";
	public static final String GENERAL_FIELD_NOT_UNIQUE_CODE = "522";

	public static final String GENERAL_FIELD_NOT_SPECIFIED = "{mandatory-field} not specified";
	public static final String GENERAL_FIELD_INVALID = "{field} is invalid";
	public static final String GENERAL_DATA_NOT_AVAILABLE = "Requested data is not available";
	public static final String PERSISTENCE_ERROR = "Data could not be saved";
	public static final String GENERAL_FIELD_NOT_UNIQUE = "{field} is not unique";
	
	public static final String LIST_ALARM_MITIGATION_CONFIG_WITH_PAGINATION_SUMMARY = "API for list alarm mitigation with pagination";
	public static final String LIST_ALARM_MITIGATION_CONFIG_WITH_PAGINATION_DESC = "This API is used for listing alarm mitigation with pagination and also supports searching and sorting with multiple fields";

	public static final String CREATE_ALARM_MITIGATION_CONFIG_SUMMARY = "API for creating alarm mitigation";
	public static final String CREATE_ALARM_MITIGATION_CONFIG_DESC = "This API is used for creating alarm mitigation";

	public static final String UPDATE_ALARM_MITIGATION_CONFIG_SUMMARY = "API for updating alarm mitigation";
	public static final String UPDATE_ALARM_MITIGATION_CONFIG_DESC = "This API is used for update alarm mitigation with given Id";


	public static final String DELETE_ALARM_MITIGATION_CONFIG_SUMMARY = "API for deleting alarm mitigation";
	public static final String DELETE_ALARM_MITIGATION_CONFIG_DESC = "This API is used for deleting alarm mitigation with given Id";

	public static final String FIND_ALARM_MITIGATION_CONFIG_SUMMARY = "API for finding alarm mitigation";
	public static final String FIND_ALARM_MITIGATION_CONFIG_DESC = "This API is used for finding alarm mitigation for given Id";

	public static final String LIST_ALARM_MITIGATION_CONFIG_WITH_DOMAIN_SUMMARY = "API for listing alarm mitigation with domain";
	public static final String LIST_ALARM_MITIGATION_CONFIG_WITH_DOMAIN_DESC = "This API is used for listing alarm mitigation with given domain";




}
