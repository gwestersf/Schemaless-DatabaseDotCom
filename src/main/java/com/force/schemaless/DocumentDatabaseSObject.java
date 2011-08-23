package com.force.schemaless;

import java.util.Map;

import com.sforce.rest.pojo.SObject;

/**
 * 
 * @author gwester
 * @since 176
 */
public class DocumentDatabaseSObject extends SObject {
	private Map<String, String> fields;
	
	public String getField(String name) {
		return fields.get(name);
	}
}
