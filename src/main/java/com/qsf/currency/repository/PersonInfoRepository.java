package com.qsf.currency.repository;

import com.qsf.currency.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author QSF
 * @Date 2020/8/3 12:11
 * @Version 1.0
 */
public interface PersonInfoRepository extends JpaRepository<PersonInfo,Integer> {
}
