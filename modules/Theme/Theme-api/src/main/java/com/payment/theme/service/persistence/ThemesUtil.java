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

package com.payment.theme.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.payment.theme.model.Themes;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the themes service. This utility wraps <code>com.payment.theme.service.persistence.impl.ThemesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ThemesPersistence
 * @generated
 */
public class ThemesUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Themes themes) {
		getPersistence().clearCache(themes);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Themes> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Themes> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Themes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Themes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Themes> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Themes update(Themes themes) {
		return getPersistence().update(themes);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Themes update(Themes themes, ServiceContext serviceContext) {
		return getPersistence().update(themes, serviceContext);
	}

	/**
	 * Returns all the themeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching themeses
	 */
	public static List<Themes> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the themeses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @return the range of matching themeses
	 */
	public static List<Themes> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the themeses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching themeses
	 */
	public static List<Themes> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Themes> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the themeses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching themeses
	 */
	public static List<Themes> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Themes> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public static Themes findByUuid_First(
			String uuid, OrderByComparator<Themes> orderByComparator)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public static Themes fetchByUuid_First(
		String uuid, OrderByComparator<Themes> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public static Themes findByUuid_Last(
			String uuid, OrderByComparator<Themes> orderByComparator)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public static Themes fetchByUuid_Last(
		String uuid, OrderByComparator<Themes> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the themeses before and after the current themes in the ordered set where uuid = &#63;.
	 *
	 * @param colorsId the primary key of the current themes
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next themes
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public static Themes[] findByUuid_PrevAndNext(
			long colorsId, String uuid,
			OrderByComparator<Themes> orderByComparator)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByUuid_PrevAndNext(
			colorsId, uuid, orderByComparator);
	}

	/**
	 * Removes all the themeses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of themeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching themeses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the themeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching themeses
	 */
	public static List<Themes> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the themeses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @return the range of matching themeses
	 */
	public static List<Themes> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the themeses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching themeses
	 */
	public static List<Themes> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Themes> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the themeses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching themeses
	 */
	public static List<Themes> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Themes> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public static Themes findByUserId_First(
			long userId, OrderByComparator<Themes> orderByComparator)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public static Themes fetchByUserId_First(
		long userId, OrderByComparator<Themes> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public static Themes findByUserId_Last(
			long userId, OrderByComparator<Themes> orderByComparator)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public static Themes fetchByUserId_Last(
		long userId, OrderByComparator<Themes> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the themeses before and after the current themes in the ordered set where userId = &#63;.
	 *
	 * @param colorsId the primary key of the current themes
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next themes
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public static Themes[] findByUserId_PrevAndNext(
			long colorsId, long userId,
			OrderByComparator<Themes> orderByComparator)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByUserId_PrevAndNext(
			colorsId, userId, orderByComparator);
	}

	/**
	 * Removes all the themeses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of themeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching themeses
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the themes in the entity cache if it is enabled.
	 *
	 * @param themes the themes
	 */
	public static void cacheResult(Themes themes) {
		getPersistence().cacheResult(themes);
	}

	/**
	 * Caches the themeses in the entity cache if it is enabled.
	 *
	 * @param themeses the themeses
	 */
	public static void cacheResult(List<Themes> themeses) {
		getPersistence().cacheResult(themeses);
	}

	/**
	 * Creates a new themes with the primary key. Does not add the themes to the database.
	 *
	 * @param colorsId the primary key for the new themes
	 * @return the new themes
	 */
	public static Themes create(long colorsId) {
		return getPersistence().create(colorsId);
	}

	/**
	 * Removes the themes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes that was removed
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public static Themes remove(long colorsId)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().remove(colorsId);
	}

	public static Themes updateImpl(Themes themes) {
		return getPersistence().updateImpl(themes);
	}

	/**
	 * Returns the themes with the primary key or throws a <code>NoSuchThemesException</code> if it could not be found.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public static Themes findByPrimaryKey(long colorsId)
		throws com.payment.theme.exception.NoSuchThemesException {

		return getPersistence().findByPrimaryKey(colorsId);
	}

	/**
	 * Returns the themes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes, or <code>null</code> if a themes with the primary key could not be found
	 */
	public static Themes fetchByPrimaryKey(long colorsId) {
		return getPersistence().fetchByPrimaryKey(colorsId);
	}

	/**
	 * Returns all the themeses.
	 *
	 * @return the themeses
	 */
	public static List<Themes> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the themeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @return the range of themeses
	 */
	public static List<Themes> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the themeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of themeses
	 */
	public static List<Themes> findAll(
		int start, int end, OrderByComparator<Themes> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the themeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of themeses
	 */
	public static List<Themes> findAll(
		int start, int end, OrderByComparator<Themes> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the themeses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of themeses.
	 *
	 * @return the number of themeses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ThemesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ThemesPersistence, ThemesPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ThemesPersistence.class);

		ServiceTracker<ThemesPersistence, ThemesPersistence> serviceTracker =
			new ServiceTracker<ThemesPersistence, ThemesPersistence>(
				bundle.getBundleContext(), ThemesPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}