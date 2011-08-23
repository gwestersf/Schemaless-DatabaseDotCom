package com.force.schemaless;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

import com.force.sdk.connector.*;
import com.google.gson.Gson;
import com.sforce.rest.RestApiException;
import com.sforce.rest.RestConnection;
import com.sforce.rest.RestConnectionImpl;
import com.sforce.rest.SObjectResult;
import com.sforce.rest.pojo.SObject;
import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

/**
 * 
 * @author gwester
 * @since 176
 */
public class SchemalessDatabaseDotCom implements SchemalessDatabase {
	
	private RestConnection rest;
	private String restEndpoint;
	private String sessionId;
	private Gson gson;
	
	public SchemalessDatabaseDotCom() throws RestApiException, ConnectionException {
		this("qatesting@streaming.org", "test1234", "https://prerelna1.pre.salesforce.com/");
	}
	
	public SchemalessDatabaseDotCom(String username, String password, String endpoint) throws RestApiException, ConnectionException {
		ConnectorConfig config = new ConnectorConfig();
        config.setUsername(username);
        config.setPassword(password);
        config.setAuthEndpoint(endpoint + "services/Soap/u/23.0");
        config.setRestEndpoint(endpoint + "services/data/v23.0");
        PartnerConnection connection = Connector.newConnection(config);
		this.sessionId = connection.getSessionHeader().getSessionId();
		gson = new Gson();
	}

	public URL insert(String json) throws IOException, RestApiException {
		SObject sobject = gson.fromJson(json, DocumentDatabaseSObject.class);
		SObjectResult result = rest.create(sobject);
		return new URL(this.restEndpoint + "/sobjects/document/"+ result.getId());
	}

	public URL update(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<URL> upsert(String jsonArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
