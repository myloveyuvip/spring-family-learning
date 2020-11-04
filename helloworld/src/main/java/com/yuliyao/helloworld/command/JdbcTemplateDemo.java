package com.yuliyao.helloworld.command;

import com.alibaba.fastjson.JSON;
import com.yuliyao.helloworld.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author YuLiyao
 * @date 2020/11/3
 */
@Component
@Slf4j
public class JdbcTemplateDemo implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) {
        insert();
        List<Person> people = select();
        log.info(JSON.toJSONString(people));

    }


    public void insert() {
        jdbcTemplate.update("insert into Person(id,name) values(?,?)", 1, "larry");
    }

    public List<Person> select() {
        return jdbcTemplate.queryForList("select * from Person ", Person.class);
    }
}
