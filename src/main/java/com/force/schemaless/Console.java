package com.force.schemaless;

/**
 * 
 * @author gwester
 * @since 176
 */
public class Console {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SchemalessDatabase db = new SchemalessDatabaseDotCom();
		db.insert(args[0]);
	}

}
