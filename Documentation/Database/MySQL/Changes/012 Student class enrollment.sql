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

/**
  * Add course offering id to StudentClassEnrollment table
  */
  
alter table student_class_enrl add course_offering_id decimal(20,0);

alter table student_class_enrl 
  add constraint fk_student_class_enrl_course foreign key (course_offering_id)
  references course_offering (uniqueid) on delete cascade;
  
/*
 * Update database version
 */

update application_config set value='12' where name='tmtbl.db.version';

commit;
  