package com.swl.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/13/2024 2:58 PM
 */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@NoArgsConstructor
public class Accounts extends BaseEntity{

    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "account_number")
    @Id
    private Long accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAddress;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Accounts accounts = (Accounts) o;
        return getAccountNumber() != null && Objects.equals(getAccountNumber(), accounts.getAccountNumber());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
