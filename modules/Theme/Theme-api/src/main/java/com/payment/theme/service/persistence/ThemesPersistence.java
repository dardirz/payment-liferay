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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.payment.theme.exception.NoSuchThemesException;
import com.payment.theme.model.Themes;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the themes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ThemesUtil
 * @generated
 */
@ProviderType
public interface ThemesPersistence extends BasePersistence<Themes> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThemesUtil} to access the themes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the themeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching themeses
	 */
	public java.util.List<Themes> findByUuid(String uuid);

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
	public java.util.List<Themes> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Themes> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

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
	public java.util.List<Themes> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public Themes findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Themes>
				orderByComparator)
		throws NoSuchThemesException;

	/**
	 * Returns the first themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public Themes fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

	/**
	 * Returns the last themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public Themes findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Themes>
				orderByComparator)
		throws NoSuchThemesException;

	/**
	 * Returns the last themes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public Themes fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

	/**
	 * Returns the themeses before and after the current themes in the ordered set where uuid = &#63;.
	 *
	 * @param colorsId the primary key of the current themes
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next themes
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public Themes[] findByUuid_PrevAndNext(
			long colorsId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Themes>
				orderByComparator)
		throws NoSuchThemesException;

	/**
	 * Removes all the themeses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of themeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching themeses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the themeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching themeses
	 */
	public java.util.List<Themes> findByUserId(long userId);

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
	public java.util.List<Themes> findByUserId(long userId, int start, int end);

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
	public java.util.List<Themes> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

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
	public java.util.List<Themes> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public Themes findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Themes>
				orderByComparator)
		throws NoSuchThemesException;

	/**
	 * Returns the first themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public Themes fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

	/**
	 * Returns the last themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes
	 * @throws NoSuchThemesException if a matching themes could not be found
	 */
	public Themes findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Themes>
				orderByComparator)
		throws NoSuchThemesException;

	/**
	 * Returns the last themes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching themes, or <code>null</code> if a matching themes could not be found
	 */
	public Themes fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

	/**
	 * Returns the themeses before and after the current themes in the ordered set where userId = &#63;.
	 *
	 * @param colorsId the primary key of the current themes
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next themes
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public Themes[] findByUserId_PrevAndNext(
			long colorsId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Themes>
				orderByComparator)
		throws NoSuchThemesException;

	/**
	 * Removes all the themeses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of themeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching themeses
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the themes in the entity cache if it is enabled.
	 *
	 * @param themes the themes
	 */
	public void cacheResult(Themes themes);

	/**
	 * Caches the themeses in the entity cache if it is enabled.
	 *
	 * @param themeses the themeses
	 */
	public void cacheResult(java.util.List<Themes> themeses);

	/**
	 * Creates a new themes with the primary key. Does not add the themes to the database.
	 *
	 * @param colorsId the primary key for the new themes
	 * @return the new themes
	 */
	public Themes create(long colorsId);

	/**
	 * Removes the themes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes that was removed
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public Themes remove(long colorsId) throws NoSuchThemesException;

	public Themes updateImpl(Themes themes);

	/**
	 * Returns the themes with the primary key or throws a <code>NoSuchThemesException</code> if it could not be found.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes
	 * @throws NoSuchThemesException if a themes with the primary key could not be found
	 */
	public Themes findByPrimaryKey(long colorsId) throws NoSuchThemesException;

	/**
	 * Returns the themes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes, or <code>null</code> if a themes with the primary key could not be found
	 */
	public Themes fetchByPrimaryKey(long colorsId);

	/**
	 * Returns all the themeses.
	 *
	 * @return the themeses
	 */
	public java.util.List<Themes> findAll();

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
	public java.util.List<Themes> findAll(int start, int end);

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
	public java.util.List<Themes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator);

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
	public java.util.List<Themes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Themes>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the themeses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of themeses.
	 *
	 * @return the number of themeses
	 */
	public int countAll();

}