package edu.bd.bean;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ProjectBean
 */
@Stateless
public class ProjectBean implements IProject {

	/**
	 * Default constructor.
	 */
	public ProjectBean() {}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "42";
	}

}
