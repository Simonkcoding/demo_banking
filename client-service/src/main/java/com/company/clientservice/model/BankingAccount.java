package com.company.clientservice.model;

import java.math.BigDecimal;
import java.util.Objects;

public class BankingAccount {

    private int id;
    private BigDecimal credit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankingAccount that = (BankingAccount) o;
        return id == that.id &&
                credit.equals(that.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, credit);
    }
}
