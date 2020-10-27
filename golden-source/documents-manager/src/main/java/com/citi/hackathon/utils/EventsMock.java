package com.citi.hackathon.utils;

import com.citi.hackathon.domain.Event;

import java.util.ArrayList;
import java.util.List;

public class EventsMock {
	
	public List<Event> eventsMock = new ArrayList<Event>();
	
	public List<Event> intiEvents(){
		eventsMock.add(new Event("1",
				"External fine for cybersecurity implementation",
				"proactive",
				"21/08/2019",
				"20/08/2020",
				"Checker pending",
				"NAM",
				"ICG O&T",
				"Regulatory",
				"Monetary",
				"Regulatory",
				"pending"));
		
		eventsMock.add(new Event("2",
				"Release of mobily security feature",
				"proactive",
				"06/10/2019",
				"14/07/2020",
				"Approved",
				"LATAM",
				"ICG O&T",
				"Technology",
				"Client",
				"Development",
				"approved"));
		
		eventsMock.add(new Event("3",
				"System Lag of mobile payment",
				"reactive",
				"06/12/2019",
				"06/10/2020",
				"Approved",
				"EMEA",
				"GCB",
				"Technology",
				"Client",
				"Network",
				"approved"));
		
		eventsMock.add(new Event("4",
				"SSL Certificate expired",
				"reactive",
				"06/12/2019",
				"06/10/2020",
				"Approved",
				"NAM",
				"ICG O&T",
				"Technology",
				"Infrastructure",
				"Network",
				"approved"));
		
		eventsMock.add(new Event("5",
				"Regulatory notice implementation 21-3",
				"proactive",
				"10/10/2019",
				"18/09/2020",
				"Approved",
				"LATAM",
				"GCB",
				"Regulatory",
				"Compliance",
				"Regulatory",
				"approved"));
		
		eventsMock.add(new Event("6",
				"Trade volume cause Recon outage",
				"reactive",
				"10/11/2019",
				"18/06/2020",
				"Approved",
				"EMEA",
				"GCB",
				"Regulatory",
				"Monetary",
				"Regulatory",
				"approved"));
		
		eventsMock.add(new Event("7",
				"Field mapping change from primo",
				"reactive",
				"10/11/2019",
				"18/06/2020",
				"Approved",
				"NAM",
				"GCB",
				"Regulatory",
				"Client",
				"Regulatory",
				"approved"));
		
		eventsMock.add(new Event("8",
				"EOVS RHEL 6",
				"reactive",
				"10/11/2019",
				"18/06/2020",
				"Approved",
				"NAM",
				"ICG O&T",
				"Technology",
				"Infrastructure",
				"Regulatory",
				"approved"));
		return eventsMock;
	}
}
