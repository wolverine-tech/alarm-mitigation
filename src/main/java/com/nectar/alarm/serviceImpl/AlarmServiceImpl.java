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
package com.nectar.alarm.serviceImpl;

import com.nectar.alarm.beans.AlarmConfig;
import com.nectar.alarm.dtos.AlarmConfigDTO;
import com.nectar.alarm.service.AlarmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;



@Service
public class AlarmServiceImpl implements AlarmService {

//	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	DatasetRepository datasetRepository;

//	@Autowired
//	private SubscriptionProfileService subscriptionProfileService;
//
//	@Override
//	public AlarmConfig save(AlarmConfigDTO alarmConfigDTO) {
//		validateMandatoryFields(datasetDTO, LABEL);
//		LOGGER.debug("Enter into save dataset");
//		try {
//			Instant instant = Instant.now();
//			Long createdOn = instant.getEpochSecond() * 1000;
//			Dataset dataset = new Dataset();
//			BeanUtils.copyProperties(datasetDTO, dataset);
//			dataset.setCreatedOn(createdOn);
//			dataset.setCreatedBy(
//					subscriptionProfileService.getEndUserName() + "@" + subscriptionProfileService.getEndUserColony());
//			dataset.setDomain(subscriptionProfileService.getEndUserColony());
//			return datasetRepository.save(dataset);
//		} catch (Exception e) {
//			LOGGER.error("Error in saving dataset", e.getMessage());
//			throw new ApplicationException(ApplicationCommonErrorCodes.SPECIFIC_DATA_CANNOT_BE_SAVED);
//		}
//
//	}
//
//	@Override
//	public OperationStatusDTO update(DatasetDTO datasetDTO) {
//		LOGGER.debug("Enter into update dataset");
//		validateMandatoryFields(datasetDTO, ID);
//		OperationStatusDTO response = new OperationStatusDTO();
//		Instant instant = Instant.now();
//		Long updatedOn = instant.getEpochSecond() * 1000;
//		Optional<Dataset> updateDataset = datasetRepository.findById(datasetDTO.getId());
//		if (!updateDataset.isPresent()) {
//			LOGGER.error("Error on finding field while updating");
//			throw new ApplicationException(ApplicationCommonErrorCodes.DATA_NOT_AVAILABLE);
//		}
//		try {
//			Dataset dataset = new Dataset();
//			BeanUtils.copyProperties(datasetDTO, dataset);
//			dataset.setUpdatedOn(updatedOn);
//			dataset.setUpdatedBy(
//					subscriptionProfileService.getEndUserName() + "@" + subscriptionProfileService.getEndUserColony());
//			datasetRepository.save(dataset);
//			response.setStatus(Status.SUCCESS);
//		} catch (Exception e) {
//			LOGGER.error("Error while updating", e.getMessage());
//			response.setStatus(Status.FAILURE);
//		}
//		return response;
//
//	}
//
//	@Override
//	public OperationStatusDTO delete(DatasetDTO datasetDTO) {
//		LOGGER.debug("enter into delete dataset");
//		validateMandatoryFields(datasetDTO, ID);
//		Optional<Dataset> deleteDataset = datasetRepository.findById(datasetDTO.getId());
//		if (!deleteDataset.isPresent()) {
//			LOGGER.error("Error on finding field while deleting");
//			throw new ApplicationException(ApplicationCommonErrorCodes.DATA_NOT_AVAILABLE);
//		}
//		OperationStatusDTO response = new OperationStatusDTO();
//		try {
//			datasetRepository.deleteById(deleteDataset.get().getId());
//			response.setStatus(Status.SUCCESS);
//		} catch (Exception e) {
//			LOGGER.error("Error while deleting", e.getMessage());
//			response.setStatus(Status.FAILURE);
//		}
//		return response;
//	}
//
//	@Override
//	public Dataset find(DatasetDTO datasetDTO) {
//		LOGGER.debug("Enter into find dataset");
//		validateMandatoryFields(datasetDTO, ID);
//		Dataset response = null;
//		try {
//			Optional<Dataset> findDataset = datasetRepository.findById(datasetDTO.getId());
//			if (findDataset.isPresent()) {
//				response = findDataset.get();
//			}
//		} catch (Exception e) {
//			LOGGER.error("Error while finding", e.getMessage());
//			throw new ApplicationException(ApplicationCommonErrorCodes.DATA_NOT_AVAILABLE);
//		}
//		return response;
//	}
//
//	@Override
//	public List<Dataset> list(String domain) {
//		LOGGER.debug("Enter into list dataset");
//		try {
//			if (domain == null) {
//				domain = subscriptionProfileService.getEndUserColony();
//			}
//			List<Dataset> findDataset = datasetRepository.findByDomainIgnoreCase(domain);
//			return findDataset;
//		} catch (Exception e) {
//			LOGGER.error("Error while listing", e.getMessage());
//			throw new ApplicationException(ApplicationCommonErrorCodes.DATA_NOT_AVAILABLE);
//		}
//	}
//
//	@Override
//	public PagedListResponse listWithPagination(Pageable pageable, DatasetDTO dataset) {
//		LOGGER.debug("Enter into listWithPagination dataset");
//		try {
//			ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAll()
//					.withMatcher("label", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//					.withMatcher("domain", ExampleMatcher.GenericPropertyMatchers.exact().ignoreCase())
//					.withMatcher("outputPayloadDataType",
//							ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//					.withMatcher("outputPayloadType", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//					.withMatcher("method", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//					.withMatcher("url", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
//
//			Dataset searchConfig = Dataset.builder().label(dataset.getLabel()).domain(dataset.getDomain())
//					.outputPayloadDataType(dataset.getOutputPayloadDataType())
//					.outputPayloadType(dataset.getOutputPayloadType()).method(dataset.getMethod()).url(dataset.getUrl())
//					.build();
//			Page<Dataset> pagedResult = datasetRepository.findAll(Example.of(searchConfig, customExampleMatcher),
//					pageable);
//			return new PagedListResponse(pagedResult.getTotalPages(), pagedResult.getTotalElements(),
//					pagedResult.getSize(), pagedResult.getNumber(), pagedResult.getContent());
//		} catch (Exception e) {
//			LOGGER.error("Error while listingWithPagination", e.getMessage());
//			throw new ApplicationException(ApplicationCommonErrorCodes.ERROR_WHILE_FETCHING_DATA);
//		}
//	}

}
