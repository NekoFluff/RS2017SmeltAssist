package com.choochoosquad.rsassist;

import java.net.URL;
import java.util.Set;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;




public class DataHandler 
{
	int getPrice(int itemID) throws MalformedURLException, IOException
	{
			
			//create url
			URL itemUrl = new URL("http://services.runescape.com/m=itemdb_rs/api/graph/"+itemID+".json");
			//create stream connection
			InputStream is = itemUrl.openStream();
			//create a thing that reads json  >implying dark magics
			JsonReader rdr = Json.createReader(is);
			//actually get and store data from object
			JsonObject obj = rdr.readObject();
			
			//creates a collection datatype for 
			Set<String> keyset = obj.getJsonObject("daily").keySet();
			int size = keyset.size();
			Object[] tArr = keyset.toArray();
			Object key = tArr[size-1];
			int price = obj.getJsonObject("daily").getInt((String)key);
			is.close();
			rdr.close();
			return price;
	}
	
	
}