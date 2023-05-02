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

create table session_config (
		session_id decimal(20,0) not null,
		name varchar(255) not null,
		value varchar(4000) null,
		description varchar(500) null,
		primary key (session_id, name)
	) engine = INNODB;

alter table application_config modify description varchar(500);

/*
create table session_config (
		session_id number(20,0) constraint nn_session_config_id not null,
		name varchar2(255 char) constraint nn_session_config_name not null,
		value varchar2(4000 char),
		description varchar2(500 char)
	);

alter table session_config add constraint pk_session_config primary key (session_id, name);

alter table application_config modify description varchar2(500 char);
*/

alter table session_config add constraint fk_session_config foreign key (session_id) references sessions (uniqueid) on delete cascade;

/*
 * Update database version
 */

update application_config set value='117' where name='tmtbl.db.version';

commit;
