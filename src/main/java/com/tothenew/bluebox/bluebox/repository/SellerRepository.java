package com.tothenew.bluebox.bluebox.repository;

import com.tothenew.bluebox.bluebox.enitity.user.Seller;
import com.tothenew.bluebox.bluebox.enitity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Long> {

  User findByEmailIgnoreCase(String email);
}
