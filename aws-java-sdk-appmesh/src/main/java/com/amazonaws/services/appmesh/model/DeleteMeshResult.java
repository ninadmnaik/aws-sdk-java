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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteMesh" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMeshResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service mesh that was deleted.
     * </p>
     */
    private MeshData mesh;

    /**
     * <p>
     * The service mesh that was deleted.
     * </p>
     * 
     * @param mesh
     *        The service mesh that was deleted.
     */

    public void setMesh(MeshData mesh) {
        this.mesh = mesh;
    }

    /**
     * <p>
     * The service mesh that was deleted.
     * </p>
     * 
     * @return The service mesh that was deleted.
     */

    public MeshData getMesh() {
        return this.mesh;
    }

    /**
     * <p>
     * The service mesh that was deleted.
     * </p>
     * 
     * @param mesh
     *        The service mesh that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMeshResult withMesh(MeshData mesh) {
        setMesh(mesh);
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
        if (getMesh() != null)
            sb.append("Mesh: ").append(getMesh());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMeshResult == false)
            return false;
        DeleteMeshResult other = (DeleteMeshResult) obj;
        if (other.getMesh() == null ^ this.getMesh() == null)
            return false;
        if (other.getMesh() != null && other.getMesh().equals(this.getMesh()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMesh() == null) ? 0 : getMesh().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMeshResult clone() {
        try {
            return (DeleteMeshResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
