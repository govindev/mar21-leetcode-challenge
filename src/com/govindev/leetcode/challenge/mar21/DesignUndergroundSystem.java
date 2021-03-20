package com.govindev.leetcode.challenge.mar21;

import java.util.Map;
import java.util.HashMap;

/***
 * Design Underground System
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3678/
 * 
 * @author Govind
 *
 */
public class DesignUndergroundSystem {
	Map<Integer, CheckIn> checkIns;
	Map<String, JourneyTime> journeyTimes;

	public DesignUndergroundSystem() {
		checkIns = new HashMap<>();
		journeyTimes = new HashMap<>();
	}

	public void checkIn(int id, String stationName, int t) {
		checkIns.put(id, new CheckIn(stationName, t));
	}

	public void checkOut(int id, String stationName, int t) {
		CheckIn checkIn = checkIns.get(id);
		journeyTimes.remove(id);
		String route = checkIn.getFrom() + "-" + stationName;
		int totalTime = t - checkIn.getAt();

		double tTime = totalTime;
		int totalTrips = 1;
		if (journeyTimes.get(route) != null) {
			JourneyTime journeyTime = journeyTimes.get(route);
			tTime += journeyTime.getTotalTime();
			totalTrips += journeyTime.getTotalTrips();
		}
		journeyTimes.put(route, new JourneyTime(tTime, totalTrips));
	}

	public double getAverageTime(String startStation, String endStation) {
		JourneyTime journeyTime = journeyTimes.get(startStation + '-' + endStation);
		return journeyTime.getTotalTime() / journeyTime.getTotalTrips();
	}
}

class CheckIn {
	private String from;
	private int at;

	public CheckIn(String from, int at) {
		this.from = from;
		this.at = at;
	}

	public String getFrom() {
		return from;
	}

	public int getAt() {
		return at;
	}
}

class JourneyTime {
	private double totalTime;
	private int totalTrips;

	public JourneyTime(double totalTime, int totalTrips) {
		this.totalTime = totalTime;
		this.totalTrips = totalTrips;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public int getTotalTrips() {
		return totalTrips;
	}
}

//  Your UndergroundSystem object will be instantiated and called as such:
//  UndergroundSystem obj = new UndergroundSystem();
//  obj.checkIn(id,stationName,t);
//  obj.checkOut(id,stationName,t);
//  double param_3 = obj.getAverageTime(startStation,endStation);
