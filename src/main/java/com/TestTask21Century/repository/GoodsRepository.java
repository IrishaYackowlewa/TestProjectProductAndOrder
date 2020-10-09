package com.TestTask21Century.repository;

import com.TestTask21Century.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {
}