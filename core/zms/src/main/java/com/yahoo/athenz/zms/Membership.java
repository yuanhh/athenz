//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// Membership - The representation for a role membership.
//
public class Membership {
    public String memberName;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean isMember;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String roleName;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp expiration;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean active;

    public Membership setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return memberName;
    }
    public Membership setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return isMember;
    }
    public Membership setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return roleName;
    }
    public Membership setExpiration(Timestamp expiration) {
        this.expiration = expiration;
        return this;
    }
    public Timestamp getExpiration() {
        return expiration;
    }
    public Membership setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return active;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Membership.class) {
                return false;
            }
            Membership a = (Membership) another;
            if (memberName == null ? a.memberName != null : !memberName.equals(a.memberName)) {
                return false;
            }
            if (isMember == null ? a.isMember != null : !isMember.equals(a.isMember)) {
                return false;
            }
            if (roleName == null ? a.roleName != null : !roleName.equals(a.roleName)) {
                return false;
            }
            if (expiration == null ? a.expiration != null : !expiration.equals(a.expiration)) {
                return false;
            }
            if (active == null ? a.active != null : !active.equals(a.active)) {
                return false;
            }
        }
        return true;
    }

    //
    // sets up the instance according to its default field values, if any
    //
    public Membership init() {
        if (isMember == null) {
            isMember = true;
        }
        if (active == null) {
            active = true;
        }
        return this;
    }
}
