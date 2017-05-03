package com.choochoosquad.rsassist;

import java.net.URL;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.json.JsonValue.ValueType;



public class DataHandler 
{
	int getPrice(int itemID) throws MalformedURLException, IOException
	{
			int price = 0;
			//create url
			URL itemUrl = new URL("http://services.runescape.com/m=itemdb_rs/api/catalogue/detail.json?item="+itemID);
			//create stream connection
			InputStream is = itemUrl.openStream();
			//create a thing that reads json  >implying dark magics
			JsonReader rdr = Json.createReader(is);
			//actually get and store data from object
			JsonObject obj = rdr.readObject();
			try{
				String a = obj.getJsonObject("item").getJsonObject("current").getString("price");
				a = a.replace(",", "");
				
				if(a.contains("k") && a.contains("."))
				{
					a = a.replace("k","");
					a = a.replace(".","");
					a = a+"00";
					System.out.println(a);
				} else if(a.contains("k") && !a.contains("."))
				{
					a = a.replace("k","");
					a = a+"000";
					System.out.println(a);
				}
				price = Integer.parseInt(a);
				
			} catch(Exception E)
			{
				price = obj.getJsonObject("item").getJsonObject("current").getInt("price");
			}
			is.close();
			rdr.close();
			return price;
	}
	
	
}
