/**
 *  Copyright 2012 Society for Health Information Systems Programmes, India (HISP India)
 *
 *  This file is part of Dms module.
 *
 *  Dms module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Dms module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Dms module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package com.onlinebanking.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebanking.dao.OnlinebankingDAO;
import com.onlinebanking.dao.OnlinebankingXmlDAO;
import com.onlinebanking.model.Users;

/**
 * It is a default implementation of {@link OnlinebankingDAO}.
 */
public class OnlinebankingXmlDAOImpl implements OnlinebankingXmlDAO {
	
	private SessionFactory sessionFactoryXml;
	
	public SessionFactory getSessionFactoryXml() {
		return sessionFactoryXml;
	}

	public void setSessionFactoryXml(SessionFactory sessionFactoryXml) {
		this.sessionFactoryXml = sessionFactoryXml;
	}

	@Transactional
	public Users saveOrUpdateUsers(Users users){
		sessionFactoryXml.getCurrentSession().saveOrUpdate(users);
		return users;
	}
	
	@Transactional
	public void deleteUsers(Users users){
		sessionFactoryXml.getCurrentSession().delete(users);
	}
}