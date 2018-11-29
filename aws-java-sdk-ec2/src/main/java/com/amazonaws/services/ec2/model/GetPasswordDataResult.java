/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPasswordDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is not available.
     * </p>
     */
    private String passwordData;
    /**
     * <p>
     * The time the data was last updated.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the Windows instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * 
     * @return The ID of the Windows instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the Windows instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPasswordDataResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is not available.
     * </p>
     * 
     * @param passwordData
     *        The password of the instance. Returns an empty string if the password is not available.
     */

    public void setPasswordData(String passwordData) {
        this.passwordData = passwordData;
    }

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is not available.
     * </p>
     * 
     * @return The password of the instance. Returns an empty string if the password is not available.
     */

    public String getPasswordData() {
        return this.passwordData;
    }

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is not available.
     * </p>
     * 
     * @param passwordData
     *        The password of the instance. Returns an empty string if the password is not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPasswordDataResult withPasswordData(String passwordData) {
        setPasswordData(passwordData);
        return this;
    }

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     * 
     * @param timestamp
     *        The time the data was last updated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     * 
     * @return The time the data was last updated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     * 
     * @param timestamp
     *        The time the data was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPasswordDataResult withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPasswordData() != null)
            sb.append("PasswordData: ").append(getPasswordData()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPasswordDataResult == false)
            return false;
        GetPasswordDataResult other = (GetPasswordDataResult) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPasswordData() == null ^ this.getPasswordData() == null)
            return false;
        if (other.getPasswordData() != null && other.getPasswordData().equals(this.getPasswordData()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPasswordData() == null) ? 0 : getPasswordData().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetPasswordDataResult clone() {
        try {
            return (GetPasswordDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
