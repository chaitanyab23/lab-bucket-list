package service;

import java.util.HashSet;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations{
	
	HashSet<TouristPlace> set= new HashSet<TouristPlace>();
	
	public HashSet<TouristPlace> add(TouristPlace places){
		set.add(places);
		return set;
	}
	
	public HashSet<TouristPlace> remove(TouristPlace places){
		set.remove(places);
		return set;
	}
	
	public Object sortByDestination(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>((d1,d2) -> d1.getDestination().compareTo(d2.getDestination()));
		for(TouristPlace p:set) {
			ts.add(p);
		}
		return ts;
	}
	
	public Object sortByRank(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> ts= new TreeSet<TouristPlace>((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		for (TouristPlace p:places) {
			ts.add(p);
		}
		return ts;
	}
	
	public Object reset(HashSet<TouristPlace> places) {
		set.clear();
		return set;
	}
}
