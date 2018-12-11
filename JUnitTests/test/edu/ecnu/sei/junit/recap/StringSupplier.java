package edu.ecnu.sei.junit.recap;

import java.util.List;
import java.util.ArrayList;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;


public class StringSupplier extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig){
		
		 List<PotentialAssignment> list  = new ArrayList<PotentialAssignment>();
		 list.add(PotentialAssignment.forValue("String", "software"));
		 list.add(PotentialAssignment.forValue("String", "testing"));
	 
		 return list;		
	}

}
