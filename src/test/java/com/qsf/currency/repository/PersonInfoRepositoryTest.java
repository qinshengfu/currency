package com.qsf.currency.repository;

import com.qsf.currency.entity.PersonInfo;
import com.qsf.currency.utils.UpdateUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author QSF
 * @Date 2020/8/3 15:14
 * @Version 1.0
 */
@SpringBootTest
class PersonInfoRepositoryTest {
    @Autowired
    private PersonInfoRepository personInfoRepository ;

    @Test
    public void saveTest(){
        PersonInfo personInfo=new PersonInfo();
        personInfo.setUserId(9);
        personInfo.setBonus(10000.00);
        PersonInfo personInfo1 = personInfoRepository.findById(9).get();
        UpdateUtil.copyNullProperties(personInfo,personInfo1);
        System.out.println(personInfo);
        System.out.println(personInfo1);
        System.out.println(personInfo1);
        PersonInfo save = personInfoRepository.save(personInfo1);
        System.out.println(save);
        Assertions.assertNotEquals(null,save);
    }

}