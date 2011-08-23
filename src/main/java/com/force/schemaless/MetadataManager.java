package com.force.schemaless;

import java.util.Set;

/**
 * 
 * @author gwester
 * @since 176
 */
public interface MetadataManager {

	public String createCustomObject(String name);
	
	public Set<String> getCustomObjects();
	
	public Set<String> getCustomObjectFields(String customObjectName);
	
	public boolean isExistingField(String customObjectName, String fieldName);
	
	public String createField(String customObjectName);
}