/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * 
 * Copyright Notice ===================================== This file contains
 * proprietary information of Huawei Technologies India Pvt Ltd. Copying or
 * reproduction without prior written approval is prohibited. Copyright (c) 2012
 * =====================================
 * 
 */
package com.huawei.iweb.platform.logging;

import junit.framework.TestCase;

import org.apache.log4j.Level;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test AuditLevel methods
 * 
 * @author k00742797
 *
 */
public class AuditLevelTest_UT extends TestCase{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuditLevel() {
		assertEquals(AuditLevel.AUDIT.toInt(), 55000);
	}

	@Test
	public void testToLevelIntLevel() {
		assertSame(AuditLevel.AUDIT, AuditLevel.toLevel(55000, Level.DEBUG));
	}

	@Test
	public void testToLevelStringLevel() {
		assertSame(AuditLevel.AUDIT, AuditLevel.toLevel("AUDIT", Level.DEBUG));
	}

}