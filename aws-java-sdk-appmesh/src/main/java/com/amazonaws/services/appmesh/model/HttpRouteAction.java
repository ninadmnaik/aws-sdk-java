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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the traffic distribution requirements for matched HTTP requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/HttpRouteAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpRouteAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The targets that traffic is routed to when a request matches the route. You can specify one or more targets and
     * their relative weights with which to distribute traffic.
     * </p>
     */
    private java.util.List<WeightedTarget> weightedTargets;

    /**
     * <p>
     * The targets that traffic is routed to when a request matches the route. You can specify one or more targets and
     * their relative weights with which to distribute traffic.
     * </p>
     * 
     * @return The targets that traffic is routed to when a request matches the route. You can specify one or more
     *         targets and their relative weights with which to distribute traffic.
     */

    public java.util.List<WeightedTarget> getWeightedTargets() {
        return weightedTargets;
    }

    /**
     * <p>
     * The targets that traffic is routed to when a request matches the route. You can specify one or more targets and
     * their relative weights with which to distribute traffic.
     * </p>
     * 
     * @param weightedTargets
     *        The targets that traffic is routed to when a request matches the route. You can specify one or more
     *        targets and their relative weights with which to distribute traffic.
     */

    public void setWeightedTargets(java.util.Collection<WeightedTarget> weightedTargets) {
        if (weightedTargets == null) {
            this.weightedTargets = null;
            return;
        }

        this.weightedTargets = new java.util.ArrayList<WeightedTarget>(weightedTargets);
    }

    /**
     * <p>
     * The targets that traffic is routed to when a request matches the route. You can specify one or more targets and
     * their relative weights with which to distribute traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWeightedTargets(java.util.Collection)} or {@link #withWeightedTargets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param weightedTargets
     *        The targets that traffic is routed to when a request matches the route. You can specify one or more
     *        targets and their relative weights with which to distribute traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRouteAction withWeightedTargets(WeightedTarget... weightedTargets) {
        if (this.weightedTargets == null) {
            setWeightedTargets(new java.util.ArrayList<WeightedTarget>(weightedTargets.length));
        }
        for (WeightedTarget ele : weightedTargets) {
            this.weightedTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets that traffic is routed to when a request matches the route. You can specify one or more targets and
     * their relative weights with which to distribute traffic.
     * </p>
     * 
     * @param weightedTargets
     *        The targets that traffic is routed to when a request matches the route. You can specify one or more
     *        targets and their relative weights with which to distribute traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRouteAction withWeightedTargets(java.util.Collection<WeightedTarget> weightedTargets) {
        setWeightedTargets(weightedTargets);
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
        if (getWeightedTargets() != null)
            sb.append("WeightedTargets: ").append(getWeightedTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRouteAction == false)
            return false;
        HttpRouteAction other = (HttpRouteAction) obj;
        if (other.getWeightedTargets() == null ^ this.getWeightedTargets() == null)
            return false;
        if (other.getWeightedTargets() != null && other.getWeightedTargets().equals(this.getWeightedTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeightedTargets() == null) ? 0 : getWeightedTargets().hashCode());
        return hashCode;
    }

    @Override
    public HttpRouteAction clone() {
        try {
            return (HttpRouteAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpRouteActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
