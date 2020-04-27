/*
 * Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.webservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implements the spring boot application client.
 *
 * @author Paolo Sandoval
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @PostMapping
    public String SayHello() {
        return "Hello";
    }
}
