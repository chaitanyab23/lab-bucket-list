package service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations {
	Map<String, TouristPlace> hash = new HashMap<String, TouristPlace>();
	Map<String, TouristPlace> linkedhash = new LinkedHashMap<String, TouristPlace>();
	Map<String, TouristPlace> treemap = new TreeMap<String, TouristPlace>();
	
	public Map<String, TouristPlace> add(TouristPlace places){
		hash.put(places.getRank(), places);
		linkedhash.put(places.getRank(), places);
		treemap.put(places.getRank(), places);
		return hash;
	}
	
	public Map<String, TouristPlace> sortRandomly(TouristPlace places){
		return hash;
	}
	
	public Map<String, TouristPlace> sortInEntryOrder(HashMap<String, TouristPlace> places){
		return linkedhash;
	}
	
	public Map<String, TouristPlace> sortAlphabetically(HashMap<String, TouristPlace> places){
		return treemap;
	}
	
	public Object reset(HashMap<String, TouristPlace> places) {
		hash.clear();
		return hash;
	}
	
	public HashMap<String, TouristPlace> remove(TouristPlace places){
		hash.remove(places.getRank(), places);
		return (HashMap<String, TouristPlace>) hash;
	}
}