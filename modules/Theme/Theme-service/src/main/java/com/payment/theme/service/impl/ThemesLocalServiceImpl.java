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
import com.payment.color.colorobjects.ErrorColor;
import com.payment.color.colorobjects.MainColor;
import com.payment.color.colorobjects.NeutralColor;
import com.payment.color.colorobjects.PrimaryColor;
import com.payment.color.colorobjects.SecondaryColor;
import com.payment.color.colorobjects.SuccessColor;
import com.payment.color.colorobjects.WarningColor;
import com.payment.theme.model.Themes;
import com.payment.theme.model.impl.ThemesImpl;
import com.payment.theme.service.ThemesLocalServiceUtil;
import com.payment.theme.service.base.ThemesLocalServiceBaseImpl;
import com.payment.theme.service.persistence.impl.ThemesPersistenceImpl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the themes local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.payment.theme.service.ThemesLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ThemesLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.payment.theme.model.Themes", service = AopService.class)
public class ThemesLocalServiceImpl extends ThemesLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.payment.theme.service.ThemesLocalService</code> via injection or a
	 * <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.payment.theme.service.ThemesLocalServiceUtil</code>.
	 */

	public Themes createColors() {

		Themes theme = new ThemesImpl();

		// theme.setUserId(userId);

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

	public MainColor adaptColors() {
		MainColor colors = new MainColor();
		Themes theme = _themesPersistenceImpl.findAll().get(0);

		ErrorColor error = new ErrorColor();
		error.setBg(theme.getErrorBg());
		error.setDark(theme.getErrorDark());
		error.setDefaultPrimary(theme.getErrorDefault());
		error.setDisabled(theme.getErrorDisabled());
		error.setLight(theme.getErrorLight());

		NeutralColor neutral = new NeutralColor();
		neutral.setBlack(theme.getNeutralBlack());
		neutral.setGray1(theme.getNeutralGray1());
		neutral.setWhite(theme.getNeutralWhite());

		PrimaryColor primary = new PrimaryColor();
		primary.setBg(theme.getPrimaryBg());
		primary.setDark(theme.getPrimaryDark());
		primary.setDefaultPrimary(theme.getPrimaryDefault());
		primary.setDisabled(theme.getPrimaryDisabled());
		primary.setLight(theme.getPrimaryLight());

		SecondaryColor secondary = new SecondaryColor();
		secondary.setBg(theme.getSecondaryBg());
		secondary.setDark(theme.getSecondaryDark());
		secondary.setDefaultPrimary(theme.getSecondaryDefault());
		secondary.setDisabled(theme.getSecondaryDisabled());
		secondary.setLight(theme.getSecondaryLight());

		SuccessColor success = new SuccessColor();
		success.setBg(theme.getSuccessBg());
		success.setDark(theme.getSuccessDark());
		success.setDefaultPrimary(theme.getSuccessDefault());
		success.setDisabled(theme.getSuccessDisabled());
		success.setLight(theme.getSuccessLight());

		WarningColor warning = new WarningColor();
		warning.setBg(theme.getWarningBg());
		warning.setDark(theme.getWarningDark());
		warning.setDefaultPrimary(theme.getWarningDefault());
		warning.setDisabled(theme.getWarningDisabled());
		warning.setLight(theme.getWarningLight());

		MainColor main = new MainColor();
		main.setError(error);
		main.setNeutral(neutral);
		main.setPrimary(primary);
		main.setSecondary(secondary);
		main.setSuccess(success);
		main.setWarning(warning);

		return colors;

	}

	@Reference
	ThemesPersistenceImpl _themesPersistenceImpl;
}