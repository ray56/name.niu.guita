package name.niu.guita.properties;

import org.eclipse.core.resources.IFile;

/**
 * @author Ray
 *
 */
/**
 * @author Ray
 *
 */
public class PropertiesTreeData {

	private IFile container;
	private String name;
	private String value;
	
	/**
	 * @param aName
	 * @param aValue
	 * @param aFile
	 */
	public PropertiesTreeData( String aName, String aValue, IFile aFile ) {
		name = aName;
		value = aValue;
		container = aFile;
	}
	
	/**
	 * @return the container
	 */
	public IFile getFile() {
		return container;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return name.hashCode() ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof PropertiesTreeData
				&& ((PropertiesTreeData) obj).getName().equals(name);
	}

}
