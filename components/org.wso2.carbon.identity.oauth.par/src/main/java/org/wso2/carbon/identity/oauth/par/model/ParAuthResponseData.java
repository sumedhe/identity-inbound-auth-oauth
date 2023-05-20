/**
 * Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com). All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth.par.model;

/**
 * Captures the values for response given by PAR Endpoint.
 */
public class ParAuthResponseData {

    private String uuid;
    private long expiryTime;

    public String getUuid() {

        return uuid;
    }

    public long getExpiryTime() {

        return expiryTime;
    }

    public void setUuid(String uuid) {

        this.uuid = uuid;
    }

    public void setExpiryTime(long expiryTime) {

        this.expiryTime = expiryTime;
    }
}
