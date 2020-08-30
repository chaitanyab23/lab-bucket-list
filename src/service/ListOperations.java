package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	ArrayList<TouristPlace> list1= new ArrayList<TouristPlace> ();
	public List<TouristPlace> add(TouristPlace places){
		list1.add(places);
		return list1;
	}
	
	
	public List<TouristPlace> remove(TouristPlace places){
		list1.remove(places);
		return list1;
	}
	
	public Object sortByDestination(List<TouristPlace> places) {
		Comparator <TouristPlace> compare= Comparator.comparing(TouristPlace::getDestination);
				Collections.sort(list1, compare);
				return compare;
	}
	
	public Object sortByRank(List<TouristPlace> places) {
		list1.sort((TouristPlace tp1, TouristPlace tp2)->tp1.getRank().compareTo(tp2.getRank()));
		return list1;
	}
	
	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}