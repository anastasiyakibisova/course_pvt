package theBankList.model;

public class UserBankList {

    private int userId;
    private String name;
    private String sureName;
    private int accountId;
    private int account;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserBankList:: userId=" + this.userId + " Name=" + this.name + " sureName=" + this.sureName + " accountId=" + this.accountId
                + " account=" + this.account;
    }
}
