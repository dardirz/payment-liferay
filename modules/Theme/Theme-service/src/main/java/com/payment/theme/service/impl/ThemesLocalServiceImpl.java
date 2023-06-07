/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.payment.theme.service.impl;

import com.liferay.portal.aop.AopService;
import com.payment.theme.model.Themes;
import com.payment.theme.model.impl.ThemesImpl;
import com.payment.theme.service.ThemesLocalServiceUtil;
import com.payment.theme.service.base.ThemesLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the themes local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.payment.theme.service.ThemesLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ThemesLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.payment.theme.model.Themes",
	service = AopService.class
)
public class ThemesLocalServiceImpl extends ThemesLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.payment.theme.service.ThemesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.payment.theme.service.ThemesLocalServiceUtil</code>.
	 */
	
	 public Themes createColors() {
		 
		 	
	      
	       Themes theme = new ThemesImpl();
	       
		 	//theme.setUserId(userId);
		 	
	        theme.setNeutralBlack("#1A1F2D");
	        theme.setNeutralWhite("#FFFFFF");
	        theme.setNeutralGray1("#CCCCCC");
	        theme.setPrimaryLight("#FFFFFF");
	        theme.setPrimaryDark("#000000");
	        theme.setPrimaryDefault("#CCCCCC");
	        theme.setPrimaryDisabled("#999999");
	        theme.setSecondaryLight("#FFFFFF");
	        theme.setSecondaryDark("#000000");
	        theme.setSecondaryDefault("#CCCCCC");
	        theme.setSecondaryDisabled("#999999");
	        theme.setSuccessLight("#00FF00");
	        theme.setSuccessDark("#006600");
	        theme.setSuccessDefault("#99CC99");
	        theme.setSuccessDisabled("#CCFFCC");
	        theme.setErrorLight("#FF0000");
	        theme.setErrorDark("#990000");
	        theme.setErrorDefault("#FFCCCC");
	        theme.setErrorDisabled("#FF9999");
	        theme.setWarningLight("#FFFF00");
	        theme.setWarningDark("#999900");
	        theme.setWarningDefault("#FFFFCC");
	        theme.setWarningDisabled("#FFFF99");

	        
	        ThemesLocalServiceUtil.addThemes(theme);
	        
	        return theme;
	    }
}