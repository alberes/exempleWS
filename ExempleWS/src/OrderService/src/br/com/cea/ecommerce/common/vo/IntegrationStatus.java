package br.com.cea.ecommerce.common.vo;

import java.util.HashMap;
import java.util.Map;

public enum IntegrationStatus {
	
	PROCESSING(0, "PROCESSING"),
	STAGED(1, "STAGED"),
	SENT_TO_SYNCHRO(2,	"SENT TO SYNCHRO"),
	RECORDED_IN_SYNCHRO(3, "RECORDED IN SYNCHRO"),
	PROCESSED_BY_SYNCHRO(4,	"PROCESSED BY SYNCHRO"),
	SENT_TO_WEVO(5,	"SENT TO WEVO"),
	RECORD_ERROR(10,	"RECORD ERROR"),
	PROCESS_ERROR(21, "PROCESS ERROR");
	
	private final Integer id;
	
	private final String description;
	
	private static Map<Integer, IntegrationStatus> mapIntegrationStatus;

	private IntegrationStatus(Integer id, String description) {
		this.id = id;
		this.description = description;
		IntegrationStatus.getMapIntegrationStatus().put(this.id, this);
	}
	
	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public static IntegrationStatus getIntegrationStatus(Integer key){
		synchronized(mapIntegrationStatus){
			return mapIntegrationStatus.get(key);
		}
	}
	
	public static Map<Integer, IntegrationStatus> getMapIntegrationStatus(){
		if(mapIntegrationStatus == null){
			mapIntegrationStatus = new HashMap<Integer, IntegrationStatus>();
		}
		return mapIntegrationStatus;
	}
	
}
