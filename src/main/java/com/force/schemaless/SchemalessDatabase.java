package com.force.schemaless;

import java.net.URL;
import java.util.Set;

/**
 * 
 * 
 * @author gwester
 * @since 176
 */
public interface SchemalessDatabase {

	public URL insert(String json) throws Exception;
	
	public URL update(String json) throws Exception;
	
	public Set<URL> upsert(String jsonArray) throws Exception;
	
	public boolean delete() throws Exception;
	
	public long count() throws Exception;
}