package edu.bd.client;

import javax.naming.Context;

import edu.bd.bean.IProject;
import edu.bd.clientutility.JNDILookupClass;

public class EJBApplicationClient {
	private static final String LOOKUP_STRING = "ProjectBean/remote";

	public static void main(String[] args) {
		IProject bean = doLookup();

	}

	private static IProject doLookup() {
		Context context = null;
		IProject bean = null;

		try {
			// Obtaining context
			context = JNDILookupClass.getInitialContext();
			// Lookup and cast
			bean = (IProject) context.lookup(LOOKUP_STRING);
			
			System.out.println(bean.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
