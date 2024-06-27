package com.sparta.dc.cyberpunk;

public enum EdgerunnerRole {
    ROCKERBOY("Charismatic Impact"),
    SOLO("Combat Awareness"),
    NETRUNNER("Interface"),
    TECH("Maker"),
    MEDTECH("Medicine"),
    MEDIA("Credibility"),
    EXEC("Teamwork"),
    LAWMAN("Backup"),
    FIXER("Operator"),
    NOMAD("Moto");

    private final String roleAbility;
    private int roleRank;
    //private final String[] roleAbilityDesc;

    EdgerunnerRole(String roleAbility) {
        this.roleAbility = roleAbility;
        this.roleRank = 4;
    }

    public String getRoleAbility() {
        return roleAbility;
    }

    public int getRoleRank() {
        return roleRank;
    }

    public void setRoleRank(int roleRank) {
        this.roleRank = roleRank;
    }
}
