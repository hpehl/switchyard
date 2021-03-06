/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.common.io.resource;

/**
 * Represents detailed information of a Resource.
 *
 * @author David Ward &lt;<a href="mailto:dward@jboss.org">dward@jboss.org</a>&gt; &copy; 2013 Red Hat Inc.
 */
public interface ResourceDetail {

    /**
     * Gets the input type.
     * @return the input type
     */
    public String getInputType();

    /**
     * Gets the worksheet name.
     * @return the worksheet name
     */
    public String getWorksheetName();

    /* SWITCHYARD-1662
     * 
     * Whether to use external types.
     * @return if using external types
     *
    public boolean isUsingExternalTypes();
    */

}
