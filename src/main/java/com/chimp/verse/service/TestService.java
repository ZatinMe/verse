package com.chimp.verse.service;

import com.chimp.verse.controller.request.PostTest;
import com.chimp.verse.dao.TestDao;
import com.chimp.verse.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestService {
    @Autowired private TestDao testDao;

    public TestDTO testServiceFlow(PostTest data){
        return testDao.save(new TestDTO(UUID.randomUUID(), data.getName(), data.getAge()));
    }

}
