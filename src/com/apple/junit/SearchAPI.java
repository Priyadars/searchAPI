
package com.apple.junit;
import org.junit.Test;

public class SearchAPI {
	
	@Test
	 public void SearchAPI_TestCase1() throws Exception 
	{   
	 String term = "Tom+Cruise";
	 String Country = "US";
	 String media ="Movie";
	 String limit="50";
	 
	
	 MockHttpRequest request =get("https://itunes.apple.com/search?term="+term+"&Country="+Country+"&Media="+media+"limit="+limit);;
	 MockHttpResponse response = new MockHttpResponse();
	 dispatcher.invoke(request, response);
	 assertEquals(response.getStatus(), HttpStatus.SC_OK);
	 assertNotNull(response.getContentAsString());
	 assertTrue(response.getContentAsString().contains("Tom+Cruise"));

	}
	
	@Test
	public void SearchAPI_TestCase2() throws Exception
	{
		 String term = "Tom Cruise";
		 String Country = "US";
		 String media ="Movie";
		 String limit="100";
		 	
		 MockHttpRequest request =get("https://itunes.apple.com/search?term="+term+"&Country="+Country+"&Media="+media+"limit="+limit);;
		 MockHttpResponse response = new MockHttpResponse();
		 dispatcher.invoke(request, response);
		 assertEquals(response.getStatus(), HttpStatus.SC_OK);
		 assertNotNull(response.getContentAsString());
		 assertTrue(response.getContentAsString().contains("Tom Cruise"));

		}	
	
	@Test
	public void SearchAPI_TestCase3() throws Exception
	{
		 String term = "Tom+Cruise";
		 String Country = "USA";
		 String media ="Podcast";
		 String limit="50";
		 	
		 MockHttpRequest request =get("https://itunes.apple.com/search?term="+term+"&Country="+Country+"&Media="+media+"limit="+limit);;
		 MockHttpResponse response = new MockHttpResponse();
		 dispatcher.invoke(request, response);
		 assertEquals(response.getStatus(), HttpStatus.SC_OK);
		 assertNotNull(response.getContentAsString());
		 assertTrue(response.getContentAsString().contains("US"));

		}	
	
	@Test
	public void SearchAPI_TestCase4() throws Exception
	{
		String term = "Tom+Cruise";
		String Country = "US";
		String media ="Movie";
		String limit="250";
			 	
		MockHttpRequest request =get("https://itunes.apple.com/search?term="+term+"&Country="+Country+"&Media="+media+"limit="+limit);;
		MockHttpResponse response = new MockHttpResponse();
		dispatcher.invoke(request, response);
		assertEquals(response.getStatus(), HttpStatus.SC_OK);
		assertNotNull(response.getContentAsString());
		assertTrue(response.getContentAsString().contains("100"));

	}	
			
	
	}
