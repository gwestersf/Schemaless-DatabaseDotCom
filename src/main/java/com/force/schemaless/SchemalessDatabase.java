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

	public URL insert(String json);
	
	public URL update(String json);
	
	public Set<URL> upsert(String jsonArray);
	
	public boolean delete();
	
	public long count();
}