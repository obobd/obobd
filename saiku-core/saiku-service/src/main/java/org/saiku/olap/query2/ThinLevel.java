package org.saiku.olap.query2;

import org.saiku.olap.query2.common.AbstractThinQuerySet;

public class ThinLevel extends AbstractThinQuerySet {

	private String name;
	private String caption;
	
	private ThinSelection selection;
	
	public ThinLevel() {};
	public ThinLevel(String name, String caption, ThinSelection selections) {
		this.name = name;
		this.caption = caption;
		this.selection = selections;
		
	}
	@Override
	public String getName() {
		return name;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}
	/**
	 * @return the selections
	 */
	public ThinSelection getSelection() {
		return selection;
	}
}
