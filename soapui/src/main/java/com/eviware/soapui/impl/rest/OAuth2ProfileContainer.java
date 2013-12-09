package com.eviware.soapui.impl.rest;

import com.eviware.soapui.config.OAuth2ProfileContainerConfig;
import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.model.propertyexpansion.PropertyExpansionContainer;
import org.apache.xmlbeans.XmlObject;

import java.util.List;

public interface OAuth2ProfileContainer extends PropertyExpansionContainer
{

	public ModelItem getModelItem();

	public List<OAuth2Profile> getOAuth2ProfileList();

	public void release();

	public OAuth2Profile addNewOAuth2Profile();

	public OAuth2ProfileContainerConfig getConfig();
}
