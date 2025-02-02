/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.samples.connectors.ldap.properties;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class LDAPSystemUserAccount extends LDAPUserAccount
{
    private static final long          serialVersionUID = 1L;

    public LDAPSystemUserAccount()
    {
    }


    @Override
    public String toString()
    {
        return "LDAPSystemUserAccount{" +
                       "userId='" + getUserId() + '\'' +
                       ", userPassword='" + getUserPassword() + '\'' +
                       ", distinguishedName='" + getDistinguishedName() + '\'' +
                       ", commonName='" + getCommonName() + '\'' +
                       ", description='" + getDescription() + '\'' +
                       '}';
    }
}
