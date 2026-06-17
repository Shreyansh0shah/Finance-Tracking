package com.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long>{

	List<Transaction> findByCategory(String category);
	
	@Query("SELECT SUM(t.amount) FROM Transaction t WHERE t.category = :category")
	Double getTotalByCategory(@Param("category") String category);
}
