package com.automate;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.util.Calendar;
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;


public class AutomatedEmail {
	
	
	@Test
	public void EmailAutomate() throws IOException, MailosaurException
	{
	/*	
		String apiKey="6jb84nDcAneLxE81Axp7utF0FkiKG10m";
		String serverId="dlsjasad";
		String serverDomain="dlsjasad.mailosaur.net";
	    MailosaurClient mailosaur = new MailosaurClient(apiKey);

	    MessageSearchParams params = new MessageSearchParams();
	    params.withServer(serverId);

	    SearchCriteria criteria = new SearchCriteria();
	    criteria.withSentTo("shall-same@" + serverDomain);

	    Message message = mailosaur.messages().get(params, criteria);
	    
	    System.out.println("________Your output is______");
	    System.out.println(message.subject());
	    */
	    String apikey="6jb84nDcAneLxE81Axp7utF0FkiKG10m";
		String serverid="dlsjasad";
		String serverdomain="dlsjasad.mailosaur.net";
		MailosaurClient mailosaur = new MailosaurClient(apikey);
		MessageSearchParams params = new MessageSearchParams();
		params.withServer(serverid);
		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo("individual@" + serverdomain);
		Message message = mailosaur.messages().get(params, criteria);
		System.out.println("==============Message Body===============");
		System.out.println(message.subject());
		System.out.print("==============Message end===============");
	    /*
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
	    */
	    
	    //assertNotNull(message);
	    //assertEquals("My email subject", message.subject());
	  }
	
}

