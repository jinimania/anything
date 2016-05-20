package com.ssoon.presentation.controller;

import com.ssoon.domain.model.entity.Hello;
import com.ssoon.infrastrcture.dao.HelloDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {
    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello add(final Hello hello) {
        final Hello helloData = helloDao.save(hello);

        return helloData;
    }

    @RequestMapping("/list")
    public List<Hello> list(final Model model) {
        final List<Hello> helloList = helloDao.findAll();

        return helloList;
    }
}
