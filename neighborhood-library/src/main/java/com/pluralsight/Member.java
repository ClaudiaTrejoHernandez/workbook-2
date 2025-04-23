package com.pluralsight;

public class Member {
    private int membershipnumber;


    public Member() {

    }
    public Member(int membershipnumber) {
        this.membershipnumber = membershipnumber;
    }

    public int getMembershipnumber() {
        return membershipnumber;
    }

    public void setMembershipnumber(int membershipnumber) {
        this.membershipnumber = membershipnumber;
    }
}
