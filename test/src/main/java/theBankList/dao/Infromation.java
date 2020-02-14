package theBankList.dao;

public class Infromation {

    private int userId;
    private String name;
    private String sureName;
    private int accountId;
    private int account;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getAccountld() {
        return accountId;
    }

    public int getAccount() {
        return account;
    }

    public Infromation(int userId, String name, String sureName, int accountId, int account) {
        this.userId = userId;
        this.name = name;
        this.sureName = sureName;
        this.accountId = accountId;
        this.account = account;
    }

}

