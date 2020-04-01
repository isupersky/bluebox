package com.tothenew.bluebox.bluebox.enitity.user;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@PrimaryKeyJoinColumn(name = "userId", referencedColumnName = "id")
public class Customer extends User {

  @Pattern(regexp = "^(?:\\s+|)((0|(?:(\\+|)91))(?:\\s|-)*(?:(?:\\d(?:\\s|-)*\\d{9})|(?:\\d{2}(?:\\s|-)*\\d{8})|(?:\\d{3}(?:\\s|-)*\\d{7}))|\\d{10})(?:\\s+|)$", message = "The Contact No. is not valid")
  @Size(min = 10, max = 10)
  @NotNull(message = "Contact No is a mandatory field")
  private Long contact;

  //	Default Constructors
  public Customer() {
  }

  public Long getContact() {
    return contact;
  }

  public void setContact(Long contact) {
    this.contact = contact;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "contact=" + contact +
        '}';
  }
}