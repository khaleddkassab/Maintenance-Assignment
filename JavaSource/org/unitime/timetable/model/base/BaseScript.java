/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.unitime.timetable.model.Script;
import org.unitime.timetable.model.ScriptParameter;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseScript implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long iUniqueId;
	private String iName;
	private String iDescription;
	private String iEngine;
	private String iPermission;
	private String iScript;

	private Set<ScriptParameter> iParameters;

	public static String PROP_UNIQUEID = "uniqueId";
	public static String PROP_NAME = "name";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_ENGINE = "engine";
	public static String PROP_PERMISSION = "permission";
	public static String PROP_SCRIPT = "script";

	public BaseScript() {
		initialize();
	}

	public BaseScript(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Long getUniqueId() { return iUniqueId; }
	public void setUniqueId(Long uniqueId) { iUniqueId = uniqueId; }

	public String getName() { return iName; }
	public void setName(String name) { iName = name; }

	public String getDescription() { return iDescription; }
	public void setDescription(String description) { iDescription = description; }

	public String getEngine() { return iEngine; }
	public void setEngine(String engine) { iEngine = engine; }

	public String getPermission() { return iPermission; }
	public void setPermission(String permission) { iPermission = permission; }

	public String getScript() { return iScript; }
	public void setScript(String script) { iScript = script; }

	public Set<ScriptParameter> getParameters() { return iParameters; }
	public void setParameters(Set<ScriptParameter> parameters) { iParameters = parameters; }
	public void addToparameters(ScriptParameter scriptParameter) {
		if (iParameters == null) iParameters = new HashSet<ScriptParameter>();
		iParameters.add(scriptParameter);
	}

	public boolean equals(Object o) {
		if (o == null || !(o instanceof Script)) return false;
		if (getUniqueId() == null || ((Script)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((Script)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "Script["+getUniqueId()+" "+getName()+"]";
	}

	public String toDebugString() {
		return "Script[" +
			"\n	Description: " + getDescription() +
			"\n	Engine: " + getEngine() +
			"\n	Name: " + getName() +
			"\n	Permission: " + getPermission() +
			"\n	Script: " + getScript() +
			"\n	UniqueId: " + getUniqueId() +
			"]";
	}
}
