package com.force.schemaless;

import com.sforce.ws.ConnectionException;

/**
 * 
 * @author gwester
 * @since 176
 */
public class Console {

	/**
	 * @param args
	 * @throws ConnectionException 
	 */
	public static void main(String[] args) throws Exception {
		SchemalessDatabase db = new SchemalessDatabaseDotCom();
		db.insert(args[0]);
	}

}
