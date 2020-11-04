package com.yuliyao.helloworld.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author YuLiyao
 * @date 2020/11/3
 */
@Component
@Slf4j
public class DataSourceDemo implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {

        log.info(dataSource.toString());

        Connection connection = dataSource.getConnection();
        log.info(connection.toString());

        connection.close();
    }
}
