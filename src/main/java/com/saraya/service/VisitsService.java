package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.stereotype.Service;


import com.saraya.model.Visits;

@Service
public class VisitsService {
	private static List<Visits> visits = new ArrayList<Visits>();
	
	
	
	private static int count = 4;
	
	
	
	static {
		visits.add(new Visits(1, LocalDate.of(2022, 10, 11),"sdfghjklmlkjhgfdsdfghj"));
		visits.add(new Visits(2, LocalDate.of(2022, 10, 11),"sdfghjklmlkjhgfdsdfghj"));
		visits.add(new Visits(3, LocalDate.of(2022, 10, 11),"sdfghjklmlkjhgfdsdfghj"));
		visits.add(new Visits(4, LocalDate.of(2022, 10, 11),"sdfghjklmlkjhgfdsdfghj"));
		
		
		
		
		
	}
	public List<Visits> retrieveAllVisits() {
		return visits;
	}
	public void addVisits( LocalDate date,String description) {
		visits.add(new Visits(++count,  date,  description));
	}
	
	public void updateVisits(Visits visit) {
	visits.remove(visit);
		visits.add(visit);
	}
	public Visits viewVisits(int id) {
		Iterator<Visits> iterate = visits.iterator();
		while (iterate.hasNext()) {
			Visits visit = iterate.next();
			if (visit.getId() == id) {
				return visit;
			}
		}
		return null;
	}

}
